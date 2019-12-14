import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Dinith Jaybaodhi
 *
 */
// it act as the subject here ,
public class WeatherData implements Subject{
	private ArrayList<Observer> weatherDataSubs ; // subscriber list :  list of observers those who have subscribed to the information 
	private float temp = 0;
	private float humidity = 0 ;
	private float pressure = 0;
	
	public WeatherData() {
		weatherDataSubs = new ArrayList<Observer>();
	}

//	new observer is added to its list of observers 
	@Override
	public void subscribe(Observer observer) {
		
		this.weatherDataSubs.add(observer);
	}

//	given observer is removed from its list of observers 
	@Override
	public void unsubscribe(Observer observer) {
		this.weatherDataSubs.remove(observer);
		
	}

//	transmits the information to all the observers in its subscriber list 
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
