package com.jsp.core.entity;

import java.util.List;

import javax.persistence.Entity;

import lombok.Data;

@Data
public class Clauses {
   
    private String type;
    private List<Predicates> predicates;
}
