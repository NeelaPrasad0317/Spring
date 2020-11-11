package com.nnp.test;

import java.util.Scanner;

import com.nnp.comp.Vehicle;
import com.nnp.factory.VehicleFactory;

public class Test {
	public static void main(String[] args) {
		Vehicle v = null;
		String engineType = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter engine type:");
		engineType = sc.nextLine();
		v = VehicleFactory.getInstance(engineType);
		v.run();
	}
}
