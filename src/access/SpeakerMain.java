package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근 (외부접근)
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; //외부에서 직접 값 대입 : private로 바뀌면 접근 불가
        speaker.showVolume();
    }
}
