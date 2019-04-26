package com.devs4j.curso.internas.method;

public class MethodLevelClasses {
	static void print() {
		class InnerMethodClass {
			void foo() {
				System.out.println("test");
			}
		}
		InnerMethodClass innerClass = new InnerMethodClass();
		innerClass.foo();
	}

	public static void main(String[] args) {
		print();
	}
}
