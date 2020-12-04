package remoteloader;

public class RemoteControl {
    Command [] onCommands;
    Command [] offCommands;
    Command undoCommand;
    
    public RemoteControl(){
        onCommands = new Command[9];
        offCommands = new Command[9];
        
        Command noCommand = new NoCommand();
        undoCommand = noCommand;
        
        for (int i = 0; i < 9; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    
    public void setCommand(int slot, Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\n---------Remote Control-----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot "+ i +"] " +onCommands[i].getClass().getName()+"    "+offCommands[i].getClass().getName() +"\n");
        }
        return sb.toString();
    }
}
