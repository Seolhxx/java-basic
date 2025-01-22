package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능 : 값이 없으므로 한번 넣을 수 있음
        //data1 = 20; // 컴파일 오류 : 이미 값이 할당되어 있다는 오류 발생

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; // 컴파일 오류 : 이미 위에서 값을 초기화했으므로 못바꿈
        method(10);
    }

    static void method(final int parameter) { // 메소드 호출할 때 10이라는 인수가 넘어온 값으로 고정됨
       // parameter = 20; // 컴파일 오류
    }
}
