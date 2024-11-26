package com.jsp.core.entity;

import java.util.List;

import javax.persistence.Entity;

import lombok.Data;

@Data
public class Filter {

	private List<Clauses> clauses;
}
