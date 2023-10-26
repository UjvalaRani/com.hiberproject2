package com.kodnest.com.hiberproject2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
    int  s_id;
    String s_name;
    @OneToOne
    Laptop l_id;
		
	public Student(int s_id, String s_name, Laptop l_id) {
		// TODO Auto-generated constructor stub
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.l_id = l_id;
	}
	
	
     
}
