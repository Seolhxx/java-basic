package pack;

import  pack.a.User;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지에 있는 건 클래스 이름으로 불러서 쓰면 됨.
        User user = new User();
    }

}
