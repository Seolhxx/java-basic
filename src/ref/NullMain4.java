package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 기존 코드는 참조할 곳이 없었으므로 참조할 곳 만들어줌
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        // NullPointerException
        System.out.println("bigData.data.value" + bigData.data.value);

    }
}
