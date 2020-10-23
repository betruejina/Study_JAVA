package interpace;

public class Refrigerator implements RemoteControl{
    private int tmp;
    private int brightness;

    //controlTmp() 추상 메소드의 실체 메소드
    public void controlTmp(int tmp){
        if(tmp>RemoteControl.MAX_TEMPERATURE){
            this.tmp = RemoteControl.MAX_TEMPERATURE;
        }
        else if(tmp<RemoteControl.MIN_TEMPERATURE){
            this.tmp = RemoteControl.MIN_TEMPERATURE;
        }
        else{
            this.tmp = tmp;
        }
        System.out.println("현재 냉장고 온도 : " + tmp);
    }

    //setLight() 추상 메소드의 실체 메소드
    public void setLight(int brightness){
        if(brightness>RemoteControl.MAX_BRIGHT){
            this.brightness = RemoteControl.MAX_BRIGHT;
        }
        else if(brightness<RemoteControl.MIN_BRIGHT){
            this.brightness = RemoteControl.MIN_BRIGHT;
        }
        else{
            this.brightness = brightness;
        }
        System.out.println("현재 냉장고 밝기 : " + brightness);
    }

}
