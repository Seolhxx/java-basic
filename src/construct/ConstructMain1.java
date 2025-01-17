package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //객체 생성하고 생성이 메모리에 만들어지자마자 함께 호출 : 한번에 같이 함
       // MemberConstruct member1 = new MemberConstruct();// 생성자가 하나라도 만들어져 있으므로 기본 생성자가 제공되지 않으므로 기본생성자 호출 안됨.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
