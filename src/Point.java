/**
 * Created by Lee-or on 14/10/2017.
 */

/**
 * Point- a class of a single point in a binary array.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Constructor.
     * @param xCoordinate x value of this Point.
     * @param yCoordinate y value of this Point.
     */
    public Point(int xCoordinate, int yCoordinate){
        this.x = xCoordinate;
        this.y = yCoordinate;
    }

    /**
     * Default constructor.
     */
    private Point(){

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    /**
     * Override of the java 'clone' function.
     */
    public Point clone(){
        Point p = new Point();
        p.x = this.x/*.clone()*/;
        p.y = this.y/*.clone()*/;
        return p;
    }
}
