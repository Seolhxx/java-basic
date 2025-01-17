package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) { // MemberInit member : 참조값
        this.name = name; // this : 자기자신의 인스턴스를 가리킴
        this.age = age;
        this.grade = grade;
    }
}
