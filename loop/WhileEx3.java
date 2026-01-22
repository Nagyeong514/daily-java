package example.loop;

public class WhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int max = 1;

        while (i <= max) {
            sum += i;
            i++;
//            max++;    //max는 위에서 초기화해둔 값으로 고정하고 i값을 while로 max까지 계속 돌린다

        }
        System.out.println(sum);    //다 돌린 후 나와서 print
    }
}
