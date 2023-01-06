package main;

import java.util.Scanner;

import dao.AccountDao;
import dto.AccountDto;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountDao dao = new AccountDao();

		// menu
		out:while(true) {
		System.out.println("\t\t< 가계부 >\t\t");
		System.out.println("1. 가계부 작성");
		System.out.println("2. 가계부 삭제");
		System.out.println("3. 가계부 검색");
		System.out.println("4. 가계부 수정");
		System.out.println("5. 가계부 출력");
		System.out.println("6. 종료 ");
		
		System.out.println(" =  ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			dao.insert();
			break;
		case 2:
			dao.delete();
			break;
		case 3:
			dao.selectUse();
			break;
		case 4:
			dao.update();
			break;
		case 5:
			dao.allDataPrint();
			break;
		case 6:

			break out;
			
		default:

		}
		
		
		}

	}

}
