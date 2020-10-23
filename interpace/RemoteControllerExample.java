package interpace;

public class RemoteControllerExample {
    public static void main(String[] args){
       RemoteControl rc = null; //인터페이스 변수 선언

       rc = new Refrigerator(); //Refrigerator 객체를 인터페이스 타입에 대입
       rc.setPower(true);
       rc.controlTmp(2);
       rc.rockTmp(false);
       rc.controlTmp(-3);
       rc.rockTmp(true);
       rc.setLight(0);
       RemoteControl.changeBattery();
       rc.setPower(false);
    }
}