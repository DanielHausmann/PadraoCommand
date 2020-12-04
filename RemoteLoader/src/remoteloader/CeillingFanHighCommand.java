package remoteloader;

public class CeillingFanHighCommand implements Command {
    CeillingFan ceillingFan;
    
    public CeillingFanHighCommand(CeillingFan ceillingFan){
        this.ceillingFan = ceillingFan;
    }
    
    public void execute() {
        ceillingFan.high();
    }

}
