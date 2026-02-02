package Test.classStart;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        String[] productNames = new String[] {"두부", "김치", "콜라"};
        int[] prices = new int[] {2000, 5000, 1500};
        int[] quantities = new int[] {2, 1, 2};

        int sum = 0;
        for (int i = 0; i < productNames.length ; i ++ ) {
            sum += prices[i] * quantities[i];
            String n = productNames[i];
            int p = prices[i];
            int q = quantities[i];
            System.out.println("상품명: " + n + ", 가격: " + p + ", 수량: " + q);
        }

        System.out.println("총 결제 금액: " + sum);

    }
}
