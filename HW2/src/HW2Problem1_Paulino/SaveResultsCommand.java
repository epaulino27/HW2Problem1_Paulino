package HW2Problem1_Paulino;

public class SaveResultsCommand implements Command{
    public void execute(){
        ResultSaver saver = new ResultSaver();
        saver.saveResults();
    }
}
