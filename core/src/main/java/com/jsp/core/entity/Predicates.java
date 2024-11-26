package com.jsp.core.entity;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

import lombok.Data;


@Data
public class Predicates {
	
    private String dimension;
    private String operator;
    private String value;
    private Map<String, Object> range;
    private List<String> list;
   
}
