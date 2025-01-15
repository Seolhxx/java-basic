package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조값이 null, 참조할 대상이 없는 것
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
    }
}
