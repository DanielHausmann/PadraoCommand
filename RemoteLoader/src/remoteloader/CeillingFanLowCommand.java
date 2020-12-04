package remoteloader;

public class CeillingFanLowCommand implements Command {

    CeillingFan ceillingFan;

    public CeillingFanLowCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    public void execute() {
        ceillingFan.low();
    }

}
