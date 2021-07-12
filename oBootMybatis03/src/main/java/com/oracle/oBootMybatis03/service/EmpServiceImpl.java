package com.oracle.oBootMybatis03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.oBootMybatis03.dao.EmpDao;
import com.oracle.oBootMybatis03.model.Emp;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao ed;
	@Override
	public int total() {
		System.out.println("EmpServiceImpl Start total...");
		int totCnt = ed.total();
		System.out.println("EmpServiceImpl totCnt-> " + totCnt);
		return totCnt;
	}
	@Override
	public List<Emp> listEmp(Emp emp) {
		List<Emp> empList = null;
		empList = ed.listEmp(emp);
		return empList;
	}

}
