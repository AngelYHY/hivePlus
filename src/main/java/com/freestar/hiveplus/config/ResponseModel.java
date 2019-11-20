package com.freestar.hiveplus.config;

/**
 * 统一返回相应参数实体类
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseModel<T> implements Serializable {
    private static final long serialVersionUID = -1241360949457314497L;
    @ApiModelProperty(value = "数据内容")
    private T data;
    @ApiModelProperty(value = "错误信息")
    private String message;
    @ApiModelProperty(value = "错误码")
    private int code;
}
