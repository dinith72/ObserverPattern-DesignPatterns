import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Dinith Jaybaodhi
 *
 */

public class WeatherData implements Subject{
	private ArrayList<Observer> weatherDataSubs ;
	private float temp = 0;
	private float humidity = 0 ;
	private float pressure = 0;
	
	public WeatherData() {
		weatherDataSubs = new ArrayList<Observer>();
	}

	@Override
	public void subscribe(Observer observer) {
		
		this.weatherDataSubs.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.weatherDataSubs.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		this.weatherDataSubs.forEach((element) -> element.update(this.temp , this.humidity , this.pressure));
		
	}
	
	public void measurementChanged() {
		this.humidity += 10;
		this.pressure +=5;
		this.temp += 1;
		notifyObservers();
		
	}
	
	
}
