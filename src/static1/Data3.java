package static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++; //원래는 Data3.count++;로 해주어야 함 (클래스에 직접 접근해서 count를 증가해라):내 클래스이므로 생략 가능
        //static붙은 곳에서만 가/
    }
}