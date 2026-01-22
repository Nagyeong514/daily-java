package example.method;

public class MethodEx2 {
    public static void main(String[] args) {

        sendMessage(3, "아 잠온다");
        sendMessage(5, "힘내라");
        sendMessage(7, "고마워");

    }

    public static void sendMessage (int a, String message){

        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
    }
}
