package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //여기서 this는 자기 자신타입에서 찾는 것 - this 생략 가능
        //this생략 시 내꺼에서 부터 찾고 없을 시 부모에 가서 찾음
        System.out.println("super value = " + super.value); //super는 나의 부모타입에서 찾는 것

        this.hello(); //this 생략 가능
        super.hello();
    }
}
