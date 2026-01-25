package lang.testAn.object;

public class Rectangle {

    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //두 객체가 논리적으로 같은지를 확인하는 equals 메서드를 재정의(Override)하는 코드입니다
    //사람 두 명의 이름과 주민번호가 같을 때 "이 둘은 서류상 같은 사람
    // 이야
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }

    //외계어 말구 예쁘게
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
