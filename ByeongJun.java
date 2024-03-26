package market;

import java.util.Scanner;

public class ByeongJun {

	static String[][] bookList = { { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
			{ "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
			{ "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } };

	static int[] cartList = { 0, 0, 0 };
	static int numCartItem = 0;

	public static void main(String[] args) {
		welcome();
		boolean quit = false;
		while (!quit) {

			switch (menu()) {
			case 1:
				bookList();
				break;
			case 2:
				cartList();
				break;
			case 3:
				addCartItem();
				break;
			case 4:
				clearCart();
				break;
			case 0:
				menuExit();
				quit = true;
				break;
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

	static void bookList() {
		System.out.println(">> 도서 목록");
		System.out.println("------------------------------------------------------------------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(bookList[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------");
	}

	static void cartList() {
		if (cartSum() == 0) {
			System.out.println(">> 장바구니가 비어 있습니다.");
		} else {
			System.out.println(">> 장바구니 보기");
			System.out.println("------------------------------------------------------------------------");
			for (int i = 0; i < bookList.length; i++) {
				if (cartList[i] == 0) {
					continue;
				} else {
					System.out.printf("%d권|", cartList[i]);
					for (int j = 0; j < 5; j++) {
						System.out.print(bookList[i][j] + "|");
					}
					System.out.println();
				}
			}
			System.out.println("------------------------------------------------------------------------");
		}
	}

	static void addCartItem() {
		Scanner input = new Scanner(System.in);
		int before = numCartItem;
		while (before == numCartItem) {
			bookList();
			System.out.print(">> 추가할 도서 ID 입력 : ");
			String id = input.nextLine();
			for (int i = 0; i < bookList.length; i++) {
				if (id.equals(bookList[i][0])) {
					System.out.println(">> 장바구니 추가 : " + bookList[i][1]);
					cartList[i]++;
					numCartItem++;
				}

			}
			if(id.equals("quit"))
				break;
			else if(before == numCartItem) {
				System.out.println(">>없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
			}

		}
	}

	static void clearCart() {
		if (cartSum() == 0) {
			System.out.println(">> 장바구니가 비어 있습니다.");
		} else {
			for (int i = 0; i < cartList.length; i++) {
				cartList[i] = 0;
			}
			numCartItem = 0;
			System.out.println(">> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
		}
	}

	static void menuExit() {
		System.out.println(">> 종료합니다.");
	}

	static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.print("=========================================\r\n" + "1. 도서 목록 보기\r\n" + "2. 장바구니 보기\r\n"
				+ "3. 장바구니에 도서 추가\r\n" + "4. 장바구니 비우기\r\n" + "0. 종료\r\n"
				+ "=========================================\r\n" + ">> 메뉴 선택 : ");
		return input.nextInt();

	}

	static void welcome() {
		System.out.println("*****************************************\r\n"
				+ "*    Welcome to ByeonJun Book Market    *\r\n" + "*****************************************");
	}

	static int cartSum() {
		int sum = 0;
		for (int i = 0; i < cartList.length; i++) {
			sum += cartList[i];
		}
		return sum;
	}

}
