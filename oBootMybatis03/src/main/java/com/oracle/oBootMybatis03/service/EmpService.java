package com.oracle.oBootMybatis03.service;

import java.util.List;

import com.oracle.oBootMybatis03.model.Emp;

public interface EmpService {

	int total();
	List<Emp> listEmp(Emp emp);
}
