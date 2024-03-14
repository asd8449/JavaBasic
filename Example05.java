package select;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("1.아메리카노");
			System.out.println("2.카페라떼");
			System.out.println("3.카푸치노");
			System.out.println("4.돌체라떼");
			System.out.println("5.프로그램 종료");
			System.out.printf("메뉴 번호를 선택하세요 : ");

			int num = input.nextInt();
			int cof;

			if(num == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (num) {
			case 1:
				System.out.println("아메리카노를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("카페라떼를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("카푸치노를 선택하셨습니다.");
				break;
			case 4:
				System.out.println("돌체라떼를 선택하셨습니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				continue;
			}
			System.out.print("몇 잔을 주문하시겠습니까? : ");
			cof = input.nextInt();
			System.out.printf("%d번 메뉴를 %d잔 주문하셨습니다.\n", num, cof);
		}
	}

}
