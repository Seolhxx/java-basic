package poly.ex5;

public class Dog implements InterfaceAnimal { //상속과 같음 : 부모를 물려받음
    @Override
    public void move() {
        System.out.println("개 이동");

    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
