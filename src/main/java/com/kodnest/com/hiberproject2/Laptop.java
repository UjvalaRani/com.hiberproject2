package com.kodnest.com.hiberproject2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop
{
	@Id
    int  l_id;
    String l_name;
	public Laptop(int l_id, String l_name) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
	}
     
}