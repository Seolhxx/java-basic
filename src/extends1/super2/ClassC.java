package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); //기본생성자가 없는 경우 개발자가 직접 super로 호출 필요
        //super를 생략할 수 있는 경우는 부모가 기본생성자인 경우에만 생략 가능
        System.out.println("ClassC 생성자");
    }
}
