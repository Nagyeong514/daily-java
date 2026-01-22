package example.array222;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum, maxNum;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println(count+"개의 정수를 입력하세요:");
        for (int i = 0; i < count ; i++){
            numbers[i] = scanner.nextInt();
        }

        minNum = numbers[0]; // 1이라고 하자
        maxNum = numbers[0];

        for (int i =1; i<count; i++) {
            if(numbers[i] < minNum) {
                minNum = numbers[i];
            }
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: "+minNum);
        System.out.println("가장 큰 정수: "+maxNum);




    }

}
