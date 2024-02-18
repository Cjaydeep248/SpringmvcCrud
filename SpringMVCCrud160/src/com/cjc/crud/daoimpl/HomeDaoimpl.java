package com.cjc.crud.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.crud.dao.HomeDao;
import com.cjc.crud.model.Student;

@Repository
public class HomeDaoimpl implements HomeDao
{

	@Autowired
	SessionFactory sf;
	
	
	public void saveData(Student s) 
	{
		Session session=sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
		session.close();
	}

}
