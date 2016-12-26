package subject;

import observer.MyObserver;

/**
 * Created by hiro on 12/26/16.
 */
public interface Subject {
    public void registerObserver(MyObserver observer);
    public void removeObserver(MyObserver observer);
    public void notifyObservers();
}
