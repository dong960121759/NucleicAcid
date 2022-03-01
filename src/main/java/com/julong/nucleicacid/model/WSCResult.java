package com.julong.nucleicacid.model;

import lombok.Data;

/**
 * @className: WSCResult
 * @Description: TODO
 * @author: cxd
 * @date: 2022/3/1 16:17
 */
@Data
public class WSCResult {

    /**resultCode	res	String	是	处理结果代码：0-成功*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
}
