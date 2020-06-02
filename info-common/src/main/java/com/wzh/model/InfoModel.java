package com.wzh.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class InfoModel  implements Serializable {
    private Integer tid;

    private String name;

    private String jibie;

    private String sheng;

    private String people;

    private String peopled;

    private Integer status;


}