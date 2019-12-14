
public class WeatherStation {

	public static void main(String[] args) {
		
		// creates the subject class
		WeatherData weatherData  = new WeatherData();
		
		// the observer class is created and  subject class is passed as a param
		Observer forecastDisplay = new forecastDisplay(weatherData);
		weatherData.measurementChanged();
		
		Observer statisticDisplay = new DisplayStatistics(weatherData);
		weatherData.measurementChanged();
		Observer heatIndexDisplay = new HeatIndex(weatherData);
		weatherData.unsubscribe(forecastDisplay);
		weatherData.measurementChanged();

	}

}
