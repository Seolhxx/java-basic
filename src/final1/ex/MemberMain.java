package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2", "seo"); //원래 id값을 받지 않아야 함
        //주석으로 id는 막아놔서 이름만 바뀜
        member.print();

    }
}
