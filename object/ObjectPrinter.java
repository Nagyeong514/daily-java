package lang.testAn.object;

// 나중에 새로운 클래스(Cat, Car, Phone 등)를 수백 개 추가해도 ObjectPrinter 코드는 단 한 줄도 수정할 필요가 없습니다.
public class ObjectPrinter {

    //타입(Object)은 "세상의 모든 객체를 다 받겠다"는 약속이기 때문에 그대로 두어야 합니다.
    public static void print (Object obj){
        String string = "객체 정보 출력: " +obj.toString();
        System.out.println(string);

    }
}
