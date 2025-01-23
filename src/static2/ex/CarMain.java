package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        //차량이름이 인스턴스마다 다르므로 인스턴스 변수 사용

        Car.showTotalCars();
    }


}
