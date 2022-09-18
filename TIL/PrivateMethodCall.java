package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	private static void main(String[] args) throws Exception {
		//Hello hello = new Hello();
		//hello.main(); // private�̶� �ܺ� ȣ�� �Ұ�
		
		//Reflaction API�� ��� - Ŭ���� ������ ��� �ٷ� �� �ִ� ������ �������
		//java.lang.reflaction��Ű���� ����
		//Hello Ŭ������ Class��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello =(Hello) helloClass.newInstance();// Class��ü�� ���� ������ ��ü ����
		Method main = helloClass.getDeclaredMethod("Main");
		main.setAccessible(true); // private�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�.
		
		main.invoke(hello); // hello.main()
	}
}
