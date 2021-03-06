package com.fzy.admin.fp.goods.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fzy.admin.fp.common.spring.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 满减规则表
 */
@Entity
@Table(name = "member_rule")
@Data
public class MemberRule extends BaseEntity {
    @ApiModelProperty("规则名称")
    private String ruleName;

    @ApiModelProperty("开始时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @ApiModelProperty("结束时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @ApiModelProperty("满减规则json格式 例子:[{'full':'','less':''}]")
    private String rule;

    @ApiModelProperty("状态 1启动0禁用")
    private Integer status;

    @ApiModelProperty("商户id")
    private String merchantId;


}
