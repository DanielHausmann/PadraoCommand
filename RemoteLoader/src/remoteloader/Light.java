package remoteloader;

public class Light {
    String desc;
    public Light(String desc){
        this.desc = desc;
    }
    
    public void on(){
        System.out.println(desc+" light is on");
    }
    public void off(){
        System.out.println(desc+ " light is off");
    }
}
