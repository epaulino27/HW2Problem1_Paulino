public class SaveResultsCommand implements Command{
    public void execute(){
        ResultSaver saver = new ResultSaver();
        saver.saveResults();
    }
}
