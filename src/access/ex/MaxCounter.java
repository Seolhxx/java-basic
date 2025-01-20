package access.ex;

public class MaxCounter {
    int count;
    int max;

    public MaxCounter(int max) {

    }

    public void increment() {
        if (max > count) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }

}

