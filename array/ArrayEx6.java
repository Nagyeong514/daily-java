package example.array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] numbers  = new int[count];
        int minNum, maxNum;

        System.out.println(count+"개의 정수를 입력하세요:");

        for(int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNum = numbers[0];    //
        maxNum = numbers[0];    // 비교할 것을 둘 다 0번에 넣자

        for (int i = 1; i < count ; i++) {  //0번이랑 1번부터 끝까지 비교를 할건데
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: "+minNum);
        System.out.println("가장 큰 정수: "+maxNum);






    }
}
