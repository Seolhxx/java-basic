package final1;

public class ConstructInit {

    final int value; // 이 값은 생성자를 통해서 넣어주어야 함

    public ConstructInit(int value) { // 생성자를 통해서 초기화 : 위에 초기값이 없으므로
        this.value = value; // 생성자를 통해서 값을 할당하게됨. 이후에 값을 변경할 수 없음
    }
    //생성자통해서 딱 한번의 값을 세팅할 수 있음
}
