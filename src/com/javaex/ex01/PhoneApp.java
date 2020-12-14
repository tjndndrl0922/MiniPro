package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {
	
	public static void main(String[] args) throws IOException {
		
		String str="";
		int num=0;
		boolean bol = true;
		
		Reader fr = new FileReader("C:\\Users\\1\\Desktop\\새 폴더\\미니프로젝트\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> list = new ArrayList<Person>();
		
		
		Scanner sc = new Scanner(System.in);
		
		//시작화면
		System.out.println("*************************************");
		System.out.println("*\t전화번호 관리 프로그램\t*");
		System.out.println("*************************************");
		
		while(bol) {
			System.out.println("1.리스트     2.등록     3.삭제     4.검색     5.종료");
			System.out.println("--------------------------------------");
			System.out.print(">메뉴번호:");
			num = sc.nextInt();
			if(str == null) {
				break;
			}
	
			switch(num) {
				case 1 :
					System.out.println("<1.리스트>");
					
					break;
				case 2 :
					System.out.println("<2.등록>");
					break;
				case 3 :
					System.out.println("<3.삭제>");
					break;
				case 4:
					System.out.println("<4.검색>");
					break;
				case 5:
					System.out.println("********************************");
					System.out.println("*\t감사합니다\t*");
					System.out.println("********************************");
					bol = false;
					break;
				default :
					System.out.println("[다시 입력 해주세요.]");
					break;
			}
			
			
			
		}
		
		
		
		
		br.close();
		sc.close();
		
	}

}
