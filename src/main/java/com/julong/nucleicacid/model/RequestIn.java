package com.julong.nucleicacid.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @className: RequestIn
 * @date: 2022/1/6 14:31
 */
@Data
public class RequestIn {
    @NotNull(message = "接口代码不能为空")
    private String service;
    @NotNull(message = "移动的用户名不能为空")
    private String user;
    @NotNull(message = "移动的口令不能为空")
    private String password;
}
