package remoteloader;

public class GarageDownCommand implements Command{
    GarageDoor garage;
    
    public GarageDownCommand(GarageDoor garage){
        this.garage = garage;
    }
    
    public void execute(){
        garage.down();
    }
    
}
