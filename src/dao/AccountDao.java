package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.AccountDto;

public class AccountDao {
	
	Scanner sc = new Scanner(System.in);
	
	private List<AccountDto> list = new ArrayList<AccountDto>();
	
	// CRUD
	public void insert() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" 가계부를 작성합니다 . ");
		
		System.out.println(" 년 / 월 / 일 (순서대로 작성) : " );
		String date = sc.next();
		
		System.out.println(" 용도 : " );
		String use = sc.next();
		
		System.out.println(" 수입/지출 : " );
		String classfy = sc.next();
		
		System.out.println(" 금액 : " );
		int money = sc.nextInt();
		
		System.out.println(" 메모 : " );
		String memo = "";
		try {
			memo = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AccountDto dto = new AccountDto(date, use, classfy, money, memo);
		list.add(dto);
		
		
	}
	
	public void delete() {
		System.out.println(" 삭제할 가계부의 날짜 : " );
			String date = sc.next();
			
			int index = searchDate(date);
			
			if(index == -1) {
				System.out.println("가계부를 찾을 수 없습니다.");
				return;
				
			}else {
				list.remove(index);
				System.out.println("가계부가 삭제되었습니다. ");

			}

		
		
		
	}
	
	public void selcet() {
		
	
		
		
		

		
		// 용도   4가지를 따로 만들기 
	}
	
	public void selectMonth() {
		// 연도월별 결산
	}
	
	public void selectUse() {
		// 수입만
		
		// 지출만 
		
	}
	
	public void update() {
		System.out.println(" 수정할 가계부의 날짜 : " );
		String date = sc.next();
		
		int index = searchDate(date);
		
		if(index == -1) {
			System.out.println("가계부를 찾을 수 없습니다.");
			return;
		}
		
		System.out.println("데이터를 찾았습니다");
		System.out.println("수정할 금액 = ");
		int money = sc.nextInt();
		System.out.println("수정할 메모 = ");
		String memo = sc.next();
		
		list.get(index).setMoney(money);
		list.get(index).setMemo(memo);
		
		System.out.println("정상적으로 수정되었습니다");


			

		
	}
	
	public int searchUse(String use) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			AccountDto a = list.get(i);
			if(use.equals(a.getUse())) {
				index = i;
				break;
			}

			
		}
		return index;

		
	}
	
	
	public int searchDate(String date) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			AccountDto a = list.get(i);
			if(date.equals(a.getDate())) {
				index = i;
				break;
			}

			
		}
		return index;

		
		
	}
	
	
	public void allDataPrint() {
		for (AccountDto accountDto : list) {
			System.out.println(accountDto.toString());
		}
	}

}
