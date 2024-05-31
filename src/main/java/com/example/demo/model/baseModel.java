package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter
@Setter
public class baseModel {

    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;


}
