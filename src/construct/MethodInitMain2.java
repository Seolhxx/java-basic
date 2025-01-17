package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) { // MemberInit member : 참조값
        member.name = name; // 매개변수 전달받아 각 보라색 인스턴스에 넘겨줌
        member.age = age;
        member.grade = grade;
    }
}
