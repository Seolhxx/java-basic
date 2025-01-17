package construct;

public class MemberThis {

    String nameField;

    void initMember(String nameParameter) {
        //멤버변수와 메서드의 매개변수의 이름이 다른 경우는 this가 생략됨
        nameField = nameParameter;
    }
}
