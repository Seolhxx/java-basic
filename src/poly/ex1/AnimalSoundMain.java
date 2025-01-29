package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        //이건 원하던 방향이 아님
//        Caw caw1 = new Caw();
//        Caw caw2 = new Caw();
//
//        Caw[] cawArr = {caw, caw1, caw2};

        //Caw[] cawArr = {dog, caw, cat}; //오류:caw와 다른 타입인 dog와 cat은 담을 수 없음

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        //soundCaw(cat); //오류:cat타입을 메서드의 매개변수 caw에 넣는 게 불가능->Caw caw != Cat cat
        soundCaw(caw);
    }

    private static void soundCaw(Caw caw) {
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");

    }
}
