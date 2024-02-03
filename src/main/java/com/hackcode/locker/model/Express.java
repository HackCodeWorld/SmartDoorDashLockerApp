package com.hackcode.locker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * Express 实体类, 用于表示快递信息, 包括 id, 快递单号, 快递公司, 取件码
 *
 * @Data 注解是 Lombok 提供的一个组合注解, 它会自动为所有字段添加 getter, setter, equals, hashCode, toString 方法
 * @NoArgsConstructor 注解是 Lombok 提供的一个注解, 它会自动为类添加一个无参构造方法
 * @AllArgsConstructor 注解是 Lombok 提供的一个注解, 它会自动为类添加一个包含所有字段的构造方法
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Express {
    private Long id; // 快递 id
    private String expressNumber; // 快递单号
    private String company; // 快递公司
    private int code; // 取件码
}
