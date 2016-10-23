/**
 * Created by surverules on 10/22/2016.
 */
public interface signal {

    boolean green=false, red=false, yellow=false;

    public boolean turnOn();

    public boolean turnOff();

    public void sleep();
}
