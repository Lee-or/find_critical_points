import javafx.scene.image.Image;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Lee-or on 02/10/2017.
 */
public class Map {
    private Image mapImg;
    private byte[][] binaryMap;
    private List<Point> criticalPoints;

    public Map(Image givenMap){
        this.mapImg = givenMap;
        this.criticalPoints = null;
    }

    /*TODO maybe "pixels" should be a given argument..*/
    private byte[][] fromImageToBinaryArray(BufferedImage image){
        //BufferedImage image = ImageIO.read(new File("/some.jpg"));
        int width = image.getWidth();
        int height  = image.getHeight();
        byte[][] pixels = new byte[width][];

        for (int x = 0; x < width; x++) {
            pixels[x] = new byte[height];

            for (int y = 0; y < height; y++) {
                pixels[x][y] = (byte) (image.getRGB(x, y) == 0xFFFFFFFF ? 0 : 1);
            }
        }

        return pixels;
    }

    /**
     * findCriticalPointsInMap.
     * @return array which holds the coordinates of all critical points in this Map.
     */
    private void findCriticalPointsInMap(){

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
