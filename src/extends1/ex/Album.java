package extends1.ex;

public class Album extends Item {
    String artist;

    public Album(String name, int price, String artist) {
        super.name = name;
        super.price = price;
        this.artist = artist;
    }

    @Override
    public void print() {
        System.out.println("이름:" + name + " 가격:" + price);
        System.out.println("- 아티스트:" + artist);
    }
}
