package remoteloader;

public class GarageUpCommand implements Command{
    GarageDoor garage;
    
    public GarageUpCommand(GarageDoor garage){
        this.garage = garage;
    }
    
    public void execute(){
        garage.up();
    }
    
}
