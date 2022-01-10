package com.julong.nucleicacid.utils;

import com.thoughtworks.xstream.XStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

/**
 * @className: XmlUtil
 * @date: 2022/1/6 14:52
 */
public class XmlUtil {
    /**
     * 把传入的xml字符串参数转为pojo对象
     * @param pojoClass
     * @param inXML
     * @return
     */
    public static Object xmlToPojo(Class<?> pojoClass, String inXML){
        Object returnOb = null ;
        if(pojoClass == null || inXML == null || inXML.trim().equals("")) return returnOb ;

        try {
            InputStream is = new ByteArrayInputStream(inXML.getBytes(StandardCharsets.UTF_8));

            JAXBContext jaxbContext = JAXBContext.newInstance(pojoClass);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            returnOb = jaxbUnmarshaller.unmarshal(is);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return returnOb ;
    }

    /**
     * 把pojo对象转为 xml字符串
     * @param returnFO
     * @return
     */
    public static String pojoToXml(Object returnFO){
        StringWriter writer = new StringWriter();
        String returnStr = "" ;
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(returnFO.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
//			jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");//编码格式
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);//是否格式化生成的xml串
//			jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);//是否省略xml头信息

            jaxbMarshaller.setListener(new MarshallerListener());  	//处理null空节点

            jaxbMarshaller.marshal(returnFO, writer);

            returnStr = writer.toString()  ;
        } catch (JAXBException e) {
            e.printStackTrace();
            returnStr = null ;
        }

        return returnStr ;
    }
    /**
     * 该监听器主要用来解决jaxb无法渲染字段为null的属性.
     * <p>
     *     在将Java类转换为xml片段时,默认jaxb会过滤属性值为null的属性,通过该监听器的{@link #beforeMarshal(Object)}方法，在渲染前
     *     通过将属性赋值为空字符串来达到在生成的xml片段中包含该属性的功能.
     * </p>
     * <p>
     *     <strong>注意:</strong>默认处理{@link String}类型的字段.
     * </p>
     */
    public static class MarshallerListener extends Marshaller.Listener {

        public static final String BLANK_CHAR = "";

        @Override
        public void beforeMarshal(Object source) {
            super.beforeMarshal(source);
            Field[] fields = source.getClass().getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
                //获取字段上注解<pre name="code" class="java">
                try {
                    if (f.getType() == String.class && f.get(source) == null) {
                        f.set(source, BLANK_CHAR);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static Object toBean(Class<?> clazz, String xml) {
        Object xmlObject = null;
        XStream xstream = new XStream();
        xstream.processAnnotations(clazz);
        xstream.autodetectAnnotations(true);
        xmlObject= xstream.fromXML(xml);
        return xmlObject;
    }

}
