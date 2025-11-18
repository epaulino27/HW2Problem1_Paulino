package HW2Problem1_Paulino;

import java.util.ArrayList;
import java.util.List;

public class PredictionInvoker {
    //where custom command list will be determined
    List<Command> commandList;

    //constructor
    public PredictionInvoker(){
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command){
        //add command to list
        commandList.add(command);
    }

    public void executeCommands(){
        //execute all command in the sequence
        for(Command command : commandList){
            command.execute();
        }
    }
}
