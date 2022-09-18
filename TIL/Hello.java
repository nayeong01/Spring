package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // static ����
	@RequestMapping("/hello")
	public void main() { // �ν��Ͻ� �޼��� - iv, cv�� �� �� ��밡��
		System.out.println("Hello");
		System.out.println(cv); // OK
		System.out.println(iv); // OK
	}
	
	public static void main2() { //staic�޼��� - cv�� ��밡��
		System.out.println(cv); // OK
		//System.out.println(iv); // ����
	}
}
