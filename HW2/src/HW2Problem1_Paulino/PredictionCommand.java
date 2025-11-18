package HW2Problem1_Paulino;

public class PredictionCommand implements Command{
    @Override
    public void execute() {
        PredictionModel model = new PredictionModel();
        model.applyPredictionModel();
    }
}
