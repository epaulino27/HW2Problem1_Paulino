package HW2Problem1_Paulino;

public class FetchDataCommand implements Command{
    @Override
    public void execute() {
        WeatherDataFetcher fetcher = new WeatherDataFetcher();
        fetcher.fetchData();
    }
}
