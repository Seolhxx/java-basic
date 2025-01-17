package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    //이미 import를 패키지a User에 사용했으므로 b의 User는 전체경로를 적어주어야 함
    //둘 중 하나는 전체 패키지 경로를 다 써주어야 함.
    //import는 하나만 가능



    }
}
