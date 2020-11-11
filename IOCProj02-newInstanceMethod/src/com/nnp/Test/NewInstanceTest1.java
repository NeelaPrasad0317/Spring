package com.nnp.Test;

public class NewInstanceTest1 {
	public static void main(String[] args) {
		Class c1,c2=null;
		Object obj1,obj3=null;
		try {
			//load the class
			c1=Class.forName(args[0]);
			//create instance
			obj1=c1.newInstance();
			System.out.println(obj1);
			
			System.out.println("...........................................");
			
			c2=Class.forName(args[1]);
			obj3=c2.newInstance();

			System.out.println(obj3);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
