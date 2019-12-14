/**
 * creates the subject interface for the weather data 
 */

/**
 * @author Dinith Jaybaodhi
 *
 */
public interface Subject {
	// this add new observer to their notification list 
	public void subscribe(Observer obs);
	
	// this removes existing observer from their notification list 
	public void unsubscribe(Observer obs);
	
	
	// send information to  all the observers in its notification list 
	public void notifyObservers();

}
