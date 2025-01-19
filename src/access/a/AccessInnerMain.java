package access.a;

public class AccessInnerMain { // 같은 패키지 내
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //privata 호출 불가
        //data.privateField = 3;
        //data .privateMethod();

        data.innerAccess(); //public이므로 아무 곳에서나 호출 가능
        // 메서드의 내부의 값들을 호출
    }
}
