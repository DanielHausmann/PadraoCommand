package remoteloader;

public class CeillingFan {

    String speed;
    String local;
    public CeillingFan(String local){
        this.local = local;
        this.speed = "Ceilling Fan is off";
    }
    
    public String getSpeed() {
        return speed;
    }

    public void high() {
        speed = "Ceilling Fan is on high";
        System.out.println(local + " " + getSpeed());
    }

    public void medium() {
        speed = "Ceilling Fan is on medium";
        System.out.println(local + " " + getSpeed());
    }

    public void low() {
        speed = "Ceilling Fan is on low";
        System.out.println(local + " " + getSpeed());
    }
    public void off(){
        speed = "Ceilling Fan is off";
        System.out.println(local + " " + getSpeed());
    }
}
