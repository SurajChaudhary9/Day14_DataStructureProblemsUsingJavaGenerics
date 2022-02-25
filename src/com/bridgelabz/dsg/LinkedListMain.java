/**UC2 : PROBLEM STATEMENT
 * Lets create a simple Linked List of 56, 30 and 70 Added first
 * @author Suraj Chaudhary
 * @date 25-Feb-2022
 */
package com.bridgelabz.dsg;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		System.out.println("Welcome to linkedList DataStructure Program");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the data at the start");
		switch (scanner.nextInt()) {
		case 1:
			Operations.addDataAtStart();
		}

	}
}
