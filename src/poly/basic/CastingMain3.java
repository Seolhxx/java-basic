package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; // 부모는 자식을 담을 수 있음
        //다른 타입을 들어갈 때는 무조건 캐스팅 필요하나 업캐스팅일 경우 생략 가능, 생략 권장 -> 자바가 자동 변환
        //Parent parent1 = (Parent) child;
        Parent parent2 = child; //업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();


    }
}
