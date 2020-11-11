package com.nnp.test;

import java.util.Scanner;

import com.nnp.Factory.carFactory;
import com.nnp.car.Car;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cartype = null;
		Car car = null;
		System.out.println("enter car type:");
		cartype = sc.nextLine();
		car = carFactory.getCar(cartype);

		car.drive();

	}
}
