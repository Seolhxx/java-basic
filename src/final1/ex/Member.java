package final1.ex;

public class Member {

    private final String id; //final 키워드 사용
    private String name;

    //생성자
    public Member(String id, String name) {
        this.id = id; // 생성할 때만 바꾸고 이후엔 변경 불가
        this.name = name;
    }

    public void changeData(String id, String name) { //원래 String id도 빼주어야 함
        //this.id = id; // 변경 불가 : 컴파일 오류
        this.name = name;
    }

    //출력 메서드
    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }

}
