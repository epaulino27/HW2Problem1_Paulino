public class Client {
    public static void main(String[] args) {
        //create models
        StatisticalPrediction stat = new StatisticalPrediction();
        MachineLearningPrediction robo = new MachineLearningPrediction();

        //run default prediction of each model
        System.out.println("Default Run");
        System.out.println();
        stat.predictHurricane();  //Statistical Model
        System.out.println();
        robo.predictHurricane();  //Machine Learning Model
        System.out.println();

        //prep for out of order command use
        FetchDataCommand FetchCommand = new FetchDataCommand();
        PredictionCommand PredictCommand = new PredictionCommand();
        SaveResultsCommand SaveCommand = new SaveResultsCommand();
        PredictionInvoker invoker = new PredictionInvoker();

        //run out of order prediction
        System.out.println("Custom Command Run");
        System.out.println();
        invoker.addCommand(SaveCommand);
        invoker.addCommand(PredictCommand);
        invoker.addCommand(FetchCommand);
        invoker.executeCommands();
    }
}
