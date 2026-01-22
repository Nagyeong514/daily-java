package example.method;

public class MethodEx1 {
    public static void main(String[] args) {


        System.out.println("평균값: " + average(1, 2, 3));

    }
    //void 쓸거면 return값이 없어도 되지 근데 여기서 계산해서 올려 줘야하니까 void아니죠 평균값 올려주고 싶어 => double
    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;       //int값을 3.0 double로 나누면 int<double 이라서 자동으로 형변환!
    }

}