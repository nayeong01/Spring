package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // static 변수
	@RequestMapping("/hello")
	public void main() { // 인스턴스 메서드 - iv, cv를 둘 다 사용가능
		System.out.println("Hello");
		System.out.println(cv); // OK
		System.out.println(iv); // OK
	}
	
	public static void main2() { //staic메서드 - cv만 사용가능
		System.out.println(cv); // OK
		//System.out.println(iv); // 에러
	}
}
