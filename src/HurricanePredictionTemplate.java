abstract public class HurricanePredictionTemplate {
    //no constructor/using blank default constructor

    //sequentially do steps, default
    public void predictHurricane(){
        fetchData();
        preprocessData();
        applyPredictionModel();
        postprocessResults();
    }

    //default template steps, to be overridden by concrete subclasses
    public void fetchData(){
        System.out.println("Fetching Data...");
    }
    public void preprocessData(){
        System.out.println("Pre-processing Data...");
    }
    public void applyPredictionModel(){
        System.out.println("Applying Prediction Model...");
    }
    public void postprocessResults(){
        System.out.println("Post-processing Data...");
    }
}
