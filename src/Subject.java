/**
 * creates the subject interface for the weather data 
 */

/**
 * @author Dinith Jaybaodhi
 *
 */
public interface Subject {
	public void subscribe(Observer obs);
	public void unsubscribe(Observer obs);
	public void notifyObservers();

}
