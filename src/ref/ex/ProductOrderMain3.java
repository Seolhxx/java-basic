package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요:");
        int num = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[num];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");
            System.out.print("상품명:");
            scanner.nextLine();
            String productname = scanner.nextLine();
            System.out.println("가격:");
            int price = scanner.nextInt();
            System.out.println("수량:");
            int quantity = scanner.nextInt();
        }


        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);
        printOrders(orders);
        getTotalAmount(orders);
    }

    static ProductOrder createOrder (String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.productName + ", 가격:" + order.price + ", 수량:" + order.quantity);
        }

    }

    static void getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        System.out.println("총 결제 금액:" + sum);

    }
}
