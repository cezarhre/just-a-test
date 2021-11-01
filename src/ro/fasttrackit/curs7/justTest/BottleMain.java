package ro.fasttrackit.curs7.justTest;
import java.awt.desktop.SystemEventListener;

public class BottleMain {
    public static void main(String[] args) {

        Bottle bottle = new Bottle(30, 20, true);
        Bottle bottle1 = new Bottle(20, 20, false);

        System.out.println(bottle.openBottle());
        System.out.println("Increase liquid with " + bottle.getIncLiquid() + "% from the bottle");
        System.out.println("You drink " + bottle.getDecLiquid()+"% from bottle");
        System.out.println("Available liquid " + bottle.totalLiquid()+"% from the bottle");
        System.out.println("More liquid " + bottle.isMoreLiquid());
        System.out.println("Empty capacity " + bottle.emptyCapacity()+"% from the bottle");
        System.out.println(bottle1.closedBottle());
        bottle1.openBottle();
        System.out.println(bottle1.openBottle());
        System.out.println("Available liquid " + bottle1.totalLiquid()+"% from the bottle");
        System.out.println("More liquid " + bottle1.isMoreLiquid());
        System.out.println("Empty capacity " + bottle1.emptyCapacity()+"% from the bottle");
        System.out.println(bottle1.emptyBottle());
    }
}
