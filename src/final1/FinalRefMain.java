package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data(); //변수data의 값을 바꿀 수 없는 것
        //data = new Data(); //final이므로 새로 또 담으면 컴파일 오류(참조대상변경불가)
        // 이것과 같은 것
//        final Data data; // 참조형
//        data = new Data();

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
