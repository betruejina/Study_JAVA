package interpace;

public interface RemoteControl {
    //상수
    public int MAX_TEMPERATURE = 2;
    public int MIN_TEMPERATURE = -10;
    public int MAX_BRIGHT = 10;
    public int MIN_BRIGHT = 0;

    //추상 메소드
    public void controlTmp(int tmp); //온도 조절
    public void setLight(int brightness); //밝기 조절

    //디폴트 메소드
    default void setPower(boolean mute) {
        if(mute){
            System.out.println("전원을 켭니다.");
        }
        else{
            System.out.println("전원을 끕니다.");
        }
    }

    default void rockTmp(boolean rock){ //온도 잠금
        if(rock){
            System.out.println("온도를 고정합니다.");
        }
        else{
            System.out.println("온도 고정을 해제합니다.");
        }
    }

    //정적 메소드
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}