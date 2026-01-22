package example.array;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProducts = 10;
        String[] products = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;


        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int option = scanner.nextInt();

            if (option == 1) {
                if(productCount > maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;   //다시 메뉴 선택으로 올라간다 밑에 다 무시
                }

                scanner.nextLine();
                System.out.print("상품 이름을 입력하세요:");
                products[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (option == 2) {
                if(productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for(int i = 0; i < productCount ; i++) {
                    System.out.println(products[i] + ": "+ productPrices[i]+"원");
                }
            } else if (option ==3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }

        }
    }
}
