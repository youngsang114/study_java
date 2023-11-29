package fc_java.poly;

public class Radio implements RemoCon{
    // chUp(),chDown().volUp(),volDown()

    @Override
    public void chUp() {
        System.out.println("라디오의 채널이 올라갑니다");
    }

    @Override
    public void chDown() {
        System.out.println("라디오의 채널이 내려갑니다");
    }

    @Override
    public void volUp() {
        System.out.println("라디오의 볼륨이 올라갑니다");
    }

    @Override
    public void volDown() {
        System.out.println("라디오의 볼륨이 내려갑니다");
    }

    @Override
    public void internet() {
        System.out.println("라디오에서는 인터넷 기능을 지원하지 않습니다");
    }
}
