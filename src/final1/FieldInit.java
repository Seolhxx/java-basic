package final1;

public class FieldInit {

    //초기값 미리 할당 : 값을 못바꿈
    static final int CONST_VALUE = 10;
    final int value = 10;

    //초기값을 넣어버린 경우 생성자를 통해서 값 할당 및 변경 불가
//    public FieldInit(int value) { // 컴파일 오류
//        this.value = value;
//    }


    // final은 값이 한번 세팅되면 끝!
}
