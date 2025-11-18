public class MachineLearningPrediction extends HurricanePredictionTemplate{
    //Override Template methods
    @Override
    public void fetchData(){
        System.out.println("Fetching Machine Learning Data...");
    }
    @Override
    public void preprocessData(){
        System.out.println("Pre-processing Machine Learning Data...");
    }
    @Override
    public void applyPredictionModel(){
        System.out.println("Applying Machine Learning Prediction Model...");
    }
    @Override
    public void postprocessResults(){
        System.out.println("Post-processing Machine Learning Data...");
    }
}
