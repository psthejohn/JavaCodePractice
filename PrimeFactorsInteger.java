package com.geekster.practice;

import java.util.ArrayList;

public class PrimeFactorsInteger {

	public static void main(String[] args) {
//		System.out.println(isPrime(3));
		int num = 25410;
		ArrayList<Integer> x = factors(num);
		System.out.println("--------- ALL FACTORS ----------");
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i) + " X " + x.get(i + 1) + " = " + num);
			i++;
		}
		System.out.println("--------- PRIME FACTORS ----------");
		ArrayList<Integer> primeFactors = primeFactors(x);
		for (int i = 0; i < primeFactors.size(); i++) {
			System.out.println(primeFactors.get(i) + " X " + primeFactors.get(i + 1) + " = " + num);
			i++;
		}
	}

	public static boolean isPrime(int num) {
		boolean ans = true;
		if (num == 1) {
			return !ans;
		} else if (num == 2) {
			return ans;
		} else if (num < 1) {
			System.out.print("Please input a number greater than 0  ");
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				ans = false;
				break;
			}
		}
		return ans;
	}

	public static ArrayList<Integer> factors(int num) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 1; i <= num / 2; i++) {
			for (int j = num; j > 0; j--) {
				if (i * j == num && i <= j) {
					l.add(i);
					l.add(j);
				}
			}
		}
		return l;
	}

	public static ArrayList<Integer> primeFactors(ArrayList<Integer> fact) {
		ArrayList<Integer> primeFact = new ArrayList<Integer>();
		int counter = 0;
		for (int i = 0; i < fact.size(); i++) {
			if (isPrime(fact.get(i)) == true && isPrime(fact.get(i + 1)) == true) {
				primeFact.add(fact.get(i));
				primeFact.add(fact.get(i + 1));
				counter++;
			}
			i++;
		}
		return primeFact;
	}
}
