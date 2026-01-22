package example.method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("=====================================");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("=====================================");
            System.out.print("선택: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    // 핵심: 메서드가 반환한 값을 다시 balance에 저장합니다.
                    balance = deposit(depositAmount, balance);    //여기서 리턴값을 balance에 넣는거지
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                    // 핵심: 메서드가 반환한 값을 다시 balance에 저장합니다.
                    balance = withdraw(withdrawAmount, balance);
                    break;
                case 3:
                    System.out.println("현재 잔액: "+balance+"원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    break;
                default:
                    System.out.println("다른 메뉴를 입력해주세요.");
                    continue;
            }

        }
    }
    // void 대신 계산된 결과인 int를 반환하도록 수정
    public static int deposit (int amount, int balance) {      //변수에 담긴 값의 복사본이 전달됩니다.
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw (int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
