package com.jsp.core.dto;

import java.util.List;

import com.jsp.core.entity.Filter;
import com.jsp.core.entity.Projection;

import lombok.Data;
@Data
public class ReadRequestDto {

	private String entityName;
	
	private List<Projection> projections;
	
	private Filter filter;
	
	private String orderBy;
}
