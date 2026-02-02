package Test.classStart;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;
        order1 = productOrders[0];

        ProductOrder order2 = new ProductOrder();
        order2.productName = "콜라";
        order2.price = 1500;
        order2.quantity = 1;
        order2 = productOrders[1];




    }
}
