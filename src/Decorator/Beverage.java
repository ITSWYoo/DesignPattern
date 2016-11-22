package Decorator;

/**
 * Created by Yoo on 2016-09-28.
 */
abstract public class Beverage {
    /**
     * The Description.
     */
    String description = this.getClass().getName();
    /**
     * The Size.
     */
    int size;

    /**
     * Get description string.
     *
     * @return the string
     */
    public String getDescription(){
        return description;
    }

    /**
     * Cost double.
     *
     * @return the double
     */
    public abstract double cost();

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(int size) {
        this.size = size;
    }
}
