package static2.ex;

public class Car {
    private static int totalCars; // 값을 누적 : 공용이 되야 함
    private String name;

    // 생성자
    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    //차량의 수 누적
    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
