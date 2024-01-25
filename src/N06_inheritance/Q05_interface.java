package N06_inheritance;

interface Musik{
    void play();
    void stop();
}

abstract class Album{
    private String singer;
    private String song;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}

class Mp3 extends Album implements Musik{

    Mp3(String singer, String song){
        setSinger(singer);
        setSong(song);
    }

    @Override
    public void play(){
        System.out.println("MP3 플레이어에서 \'"+getSinger()+" "+getSong()+"\'음악을 재생합니다");
    }

    @Override
    public void stop(){
        System.out.println("MP3 플레이어에서 \'"+getSinger()+" "+getSong()+"\'음악을 정지합니다");
    }
}

class Cd extends Album implements Musik{

    Cd(String singer, String song){
        setSinger(singer);
        setSong(song);
    }

    @Override
    public void play(){
        System.out.println("CD 플레이어에서 \'"+getSinger()+" "+getSong()+"\'음악을 재생합니다");
    }

    @Override
    public void stop(){
        System.out.println("Cd 플레이어에서 \'"+getSinger()+" "+getSong()+"\'음악을 정지합니다");
    }
}

public class Q05_interface {
    public static void main(String[] args) {
        Musik mp3 = new Mp3("이마세", "나이트댄서");
        Musik cd = new Cd("다나카", "와쓰레나이");
        mp3.play();
        mp3.stop();
        cd.play();
        cd.stop();
    }
}
