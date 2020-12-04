package remoteloader;

public class Stereo {

    String local;
    
    public Stereo(String local){
        this.local = local;
    }
    
    public void on() {
        System.out.println(local+" stereo is on");
    }

    public void off() {
        System.out.println(local+" stereo is off");
    }

    public void setCD() {
        System.out.println(local+" stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(local+" stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(local+" stereo is set for Radio input");
    }

    public void setVolume(int volume) {
        System.out.println(local+" stereo volume set to "+ volume);
    }
}
