package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); //상속받았으므로 부모의 기능 물려받아서 사용가능
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //부모타입은 자식을 참조할 수 있음
        poly.parentMethod();

    }
}
