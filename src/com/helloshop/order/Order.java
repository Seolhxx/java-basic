package com.helloshop.order;

//핵심 : 다른 패키지의 클래스를 가져다 씀
import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    //주문생성자
    //어떤 사용자가 어떤 제품을 주문했는지(매개변수) 알아야하므로
    //public이 붙어야 다른 패키지에서 Order를 호출할 수 있음
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

}

