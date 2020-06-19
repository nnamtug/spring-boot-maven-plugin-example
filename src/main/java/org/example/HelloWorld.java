package org.example;

import org.apache.commons.lang3.RandomStringUtils;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("hi!");

		System.out.println("random string: '" + RandomStringUtils.randomAscii(12) + "'");
		System.out.println("generated using " + RandomStringUtils.class.getName());
		
		System.out.println("bye!");
	}
}
