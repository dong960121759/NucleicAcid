package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.List;

/**
 * @className: GetItemOut
 * @date: 2022/1/10 17:06
 */
@Data
@XmlRootElement(name = "res")
public class GetItemOut {

    /**resultCode	res	String	是	处理结果代码：0-成功 -1 失败*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
    /**set	res	List	是	套餐的集合*/
    private List<GetItemOutSet> set;

}
