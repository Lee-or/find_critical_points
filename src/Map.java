import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lee-or on 02/10/2017.
 */
public class Map {
    private BufferedImage mapBuffImg;
    private byte[][] binaryMap;
    private List<Point> criticalPoints;


    public Map(BufferedImage givenMap){
        this.mapBuffImg = givenMap;
        this.criticalPoints = null;
    }

    /*TODO maybe "pixels" should be a given argument..*/
    private byte[][] fromImageToBinaryArray(BufferedImage image){
        //BufferedImage image = ImageIO.read(new File("/some.jpg"));
        int width = image.getWidth();
        int height  = image.getHeight();
        byte[][] pixels = new byte[width][];

        for (int x = 0; x < width; ++x) {
            pixels[x] = new byte[height];

            for (int y = 0; y < height; ++y) {
                pixels[x][y] = (byte) (image.getRGB(x, y) == 0xFFFFFFFF ? 0 : 1);
            }
        }

        return pixels;
    }

    // "All BufferedImage objects have an upper left corner coordinate of (0, 0)." (javadoc)
    // x- row, y- col => x- width, y- height.
    /**
     * firstPixelOfAnObstacle
     * @param map
     * @param x x coordinate of the pixel the user wishes to check.
     * @param y y coordinate of the pixel the user wishes to check.
     * @param width width of the map.
     * @param height the height of the map.
     * @return true if the given pixel is a critical point. Otherwise, false.
     */
    /*TODO --PROBLEM-- this algorithm returns false if there are more than 1 pixel in row in the same column */
    /*TODO this algorithm doesn't verify that there are no 2 critical points in the same vertical line*/
    private boolean firstPixelOfAnObstacle(byte[][] map, int x, int y, int width, int height){
        //if()
    }

    /**
     * findCriticalPointsInMap.
     * @return array which holds the coordinates of all critical points in this Map.
     */
    private void findCriticalPointsInMap(){
        int height = this.mapBuffImg.getHeight();
        int width= this.mapBuffImg.getWidth();

        for(int i=0; i<height; ++i){
            for (int j=0; j<width; ++j){

            }
        }

    }

    public List<Point> getCriticalPoints(){
        if(this.criticalPoints == null){
            this.criticalPoints = new LinkedList<Point>();
            this.findCriticalPointsInMap();
        }
        return getCopyOfCriticalPointsList();
    }

    /**
     * getCopyOfCriticalPointsList.
     * @return the copy of the 'criticalPoints' list.
     */
    private List<Point> getCopyOfCriticalPointsList(){
        List<Point> cloneList = new ArrayList<Point>();
        for(Point point : this.criticalPoints) {
            cloneList.add(point.clone());
        }

        return cloneList;
    }
}
