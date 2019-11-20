package com.freestar.hiveplus.ynyc_dm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zongzi
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="LtpUser对象", description="用户表")

public class LtpUser extends Model<LtpUser> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "手机号")
    private String telephone;

    @ApiModelProperty(value = "用户状态（默认0）    0：正常     10、未激活    20、账号已过期    30、已锁定   40、用户凭证已过期")
    private Integer state;

    @ApiModelProperty(value = "关联id")
    private Long objectId;

    @ApiModelProperty(value = "1 管理端 ")
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
