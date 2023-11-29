package fc_java.poly;

public class TV implements RemoCon {
    // chUp(),chDown().volUp(),volDown()
    private int currch =10;

    @Override
    public void chUp() {
        currch ++;
        if (currch > RemoCon.MAXCH){
            currch =1;
        }
        System.out.println("텔레비젼의 채널을 올립니다");
    }

    @Override
    public void chDown() {
        currch--;
        if (currch < RemoCon.MINCH){
            currch = 99;
        }
        System.out.println("텔레비젼의 채널이 내려갑니다");
    }

    @Override
    public void volUp() {
        System.out.println("텔레비젼의 볼륨이 올라갑니다");
    }

    @Override
    public void volDown() {
        System.out.println("텔레비젼의 볼륨이 내려갑니다");
    }

    @Override
    public void internet() {
        System.out.println("텔레비젼에서 인터넷이 실행됩니다");
    }
}
