package com.nnp.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceTest2 {
public static void main(String[] args) {
	Class c1,c2=null;
	Object obj1,obj2=null;
	Constructor[] con=null;
	try {
		//load the class
		c1=Class.forName(args[0]);
		//get the available constructors
		con = c1.getDeclaredConstructors();
		//create objs
		obj1=con[1].newInstance();
		System.out.println(obj1);
		System.out.println("----------------");
		obj2=con[0].newInstance(10,20);
		System.out.println(obj2);
				
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
