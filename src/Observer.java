/**
 * 
 */

/**
 * @author Dinith Jaybaodhi
 *
 */
public interface Observer {
//	each of the observer can react to the information from the subscriber in the way which it want to by implementing below method
	public void update(float temp, float humidity , float pressure);

}
