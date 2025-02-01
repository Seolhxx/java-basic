package poly.car1;

public class Driver {

    //자동차라는 역할만 이해
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다." + car); //넘어오는 인스턴스가 뭔지 출력
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }


}
