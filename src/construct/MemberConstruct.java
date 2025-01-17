package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 추가
    MemberConstruct(String name, int age) { //정의 : 이름과 나이가 있으면 성적은 50점부터 시작함
        this(name, age, 50); //변경 - 자기자신의 method를 자신의 생성자로 호출함(생성자 안에서만 사용가능)
//        this.name = name;
//        this.age = age;
//        this.grade = 50; //성적을 안넣으면 멤버변수의 초기값인 0이되므로 50을 넣어줌

    }

    //직접 생성자를 정의한 것을 호출
    //생성자
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
