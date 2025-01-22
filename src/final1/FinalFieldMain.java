package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);
        //인스턴스로 생성할때마다 생성자에서 값을 넣어주므로 인스턴스마다 값이 다름

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        //필드에서 값을 초기화했으므로 값을 못바꿈

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
        //static이므로 바로 접근해서 사용



    }
}
