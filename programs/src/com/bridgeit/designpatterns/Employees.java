

package com.bridgeit.designpatterns;

import java.awt.List;
import java.util.ArrayList;

public class Employees implements Cloneable
{
private List empList;
	
	public Employees(){
		empList = new ArrayList();
	}
	
	public Employees(List list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List temp = new ArrayList();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}

}