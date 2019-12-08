
public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherData  = new WeatherData();
		Observer forecastDisplay = new forecastDisplay(weatherData);
		weatherData.measurementChanged();
		Observer statisticDisplay = new DisplayStatistics(weatherData);
		weatherData.measurementChanged();
		weatherData.unsubscribe(forecastDisplay);
		weatherData.measurementChanged();

	}

}
