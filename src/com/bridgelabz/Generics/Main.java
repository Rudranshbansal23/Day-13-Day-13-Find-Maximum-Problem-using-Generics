package com.bridgelabz.Generics;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to check max of three variables");
		String x = "jack", y = "king", z = "queen", m = "rama";
		Integer a = 26, b = 24, c = 18, d = 23;
		Float p = 1.24f, q = 2.25f, r = 0.1f, s = 2.30f;
		TestMaximum.<String>testMaximum(x, y, z, m);
		TestMaximum.<Integer>testMaximum(a, b, c, d);
		TestMaximum.<Float>testMaximum(p, q, r, s);
	}
}