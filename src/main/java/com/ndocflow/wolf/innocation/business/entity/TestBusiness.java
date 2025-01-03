package com.ndocflow.wolf.innocation.business.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author is Mj
 * @date 2025-01-03 13:3308
 * @functionDesc
 **/
@Data
@Accessors(chain = true)
public class TestBusiness {
    private Long id;
    private String name;
    private byte type;
    private byte sourceType;
    private String value;
    private String remark;
    private Long createId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
