package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.List;

/**
 * @className: ResultOut
 * @Description: TODO
 * @author: cxd
 * @date: 2022/2/15 9:07
 */
@Data
@XmlRootElement(name = "res")
@XmlSeeAlso({GetItemOutSet.class})
public class ResultOut<T> {
    /**resultCode	res	String	是	处理结果代码：0-成功*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
    /**res	List <payListInfo>集合*/
    private List<T> set;


}
