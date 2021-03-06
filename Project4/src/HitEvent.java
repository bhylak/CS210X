import java.util.EventObject;

/**
 * General event for a hit
 */
public class HitEvent<T> extends EventObject
{
    T source; //wall or animal
    Ball b;

    /**
     * Hit event constructor
     * @param a what the ball hit
     * @param b the ball
     */
    public HitEvent(T a, Ball b)
    {
        super(a);

        this.source = a;
        this.b = b;
    }

    /**
     * Listener for hit event
     * @param <U> type
     */
    public interface HitListener<U>
    {
        /**
         * How listener handles hit
         * @param e the hit event to handle
         */
        public void handleHit(HitEvent<U> e);
    }
}

