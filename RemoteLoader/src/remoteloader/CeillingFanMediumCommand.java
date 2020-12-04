package remoteloader;

public class CeillingFanMediumCommand implements Command {

    CeillingFan ceillingFan;

    public CeillingFanMediumCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    public void execute() {
        ceillingFan.medium();
    }

}
