package com.cjc.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.dao.HomeDao;
import com.cjc.crud.model.Student;
import com.cjc.crud.service.HomeService;

@Service
public class HomeServiceimpl implements HomeService
{

	@Autowired
	HomeDao hd;
	
	
	public void saveData(Student s) {

    hd.saveData(s);
	}

	
	
}
