package com.hackcode.locker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Express {
    private Long id;
    private String expressNumber;
    private String company;
    private int code;
}
