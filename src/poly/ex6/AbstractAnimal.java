package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); //추상 : 구현 필요
    public void move() { //상속을 목적으로 사용
        System.out.println("동물이 이동합니다.");
    }
}
