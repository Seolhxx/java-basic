package poly.car0;

public class Driver {

    //인스턴스는 없는 것
    private K3Car k3Car;
    private Model3Car model3Car; //추가

    //객체 생성(생성자)이 아니고 외부에서 k3Car세팅 가능
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    //추가
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) { // 둘 다 있으면 여기가 호출
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }
}
