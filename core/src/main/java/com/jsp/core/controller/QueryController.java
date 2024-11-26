package com.jsp.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.core.constant.MappingConstant;
import com.jsp.core.dto.ReadRequestDto;
import com.jsp.core.service.QueryServiceImpl;

@RestController
public class QueryController {

	@Autowired
	private QueryServiceImpl queryServiceImpl;
	
    @PostMapping(value=MappingConstant.SAVE_QUERY)
    public ResponseEntity<String> executeQuery(@RequestBody ReadRequestDto readRequest) {
        String sqlQuery = queryServiceImpl.generateSQLQuery(readRequest);
        // Execute the SQL query and return the response
        // ...
        return ResponseEntity.ok(sqlQuery);
    }
}
