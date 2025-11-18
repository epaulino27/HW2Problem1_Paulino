package HW2Problem1_Paulino;

public class StatisticalPrediction extends HurricanePredictionTemplate{
    //Override Template methods
    @Override
    public void fetchData(){
        System.out.println("Fetching Statistical Data...");
    }
    @Override
    public void preprocessData(){
        System.out.println("Pre-processing Statistical Data...");
    }
    @Override
    public void applyPredictionModel(){
        System.out.println("Applying Statistical Prediction Model...");
    }
    @Override
    public void postprocessResults(){
        System.out.println("Post-processing Statistical Data...");
    }
}
