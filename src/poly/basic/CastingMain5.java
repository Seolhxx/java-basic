package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) { //여기에 parent가 오는지 child가 오는지 알 수 없음
        parent.parentMethod();
        //어떤 게 올지 알고 싶을 때
        if (parent instanceof Child) { //Child 인스턴스이면
            System.out.println("Child 인스턴스가 맞음");
            Child child = (Child) parent; //Child로 다운캐스팅
            child.childMethod();
        }
//        else {
//            System.out.println("Child 인스턴스 아님");
//        }
//
    }
}
