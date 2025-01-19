package access;

public class Speaker {
    private int volume; //Speaker 안에서만 접근 가능 / 외부접근불가

    //생성자
    Speaker(int volume) {
        this.volume = volume; //볼륨값 생성 시 초기 볼륨값을 받음
    }

    void volumeUp() { // 외부에서 버튼누르면 (소프트웨어에) 이 메소드를 호출한다고 가정
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10; //volume = volume - 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);

    }
}
