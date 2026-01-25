package lang.test.object;




public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);
        Circle circle = new Circle(100);



        //println은 객체가 들어오면 무조건 .toString()을 실행 --> rect1 객체를 넣기면 rect1.toString() 을 실행함
        System.out.println(rect1);      //Rectangle 클래스 안에서 오버라이딩 함
        System.out.println(rect2);
        //다형성 이용
        ObjectPrinter.print(circle);    //Circle 클래스 안에서 오버라이딩 안 함
        ObjectPrinter.print(rect1);
        ObjectPrinter.print(rect2);
        //
        System.out.println(rect1 == rect2);         //동일 //주소가 다르니까 false가
        System.out.println(rect1.equals(rect2));    //동등 //값이 같으니까 true가
    }

}
