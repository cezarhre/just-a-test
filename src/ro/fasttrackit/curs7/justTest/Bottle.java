package ro.fasttrackit.curs7.justTest;

import java.util.Objects;

 public class Bottle {
    private int totalLiquid;
    int capacity = 100;
    private int incLiquid;
    private int decLiquid;
    private boolean open;

    public Bottle(int nuArTrebuiSaFieAici, int niciAsta, boolean open) {
        this.incLiquid = nuArTrebuiSaFieAici;
        this.decLiquid = niciAsta;
        this.open = open;
    }

    public int getIncLiquid() {
        return incLiquid;
    }

    public int getDecLiquid() {
        return decLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public int totalLiquid() {
        totalLiquid = totalLiquid - decLiquid + incLiquid;
        return totalLiquid;
    }

    public boolean isMoreLiquid() {
        if (totalLiquid > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int emptyCapacity() {
        int emptyCapacity = 0;
        emptyCapacity = capacity - totalLiquid;
        return emptyCapacity;
    }

    public String emptyBottle() {
        if (!isMoreLiquid()) {
            return "The bottle is empty. You have to refill";
        } else {
            return "The bottle has liquid";
        }
    }

    public String openBottle() {
        if (open) {
            return "Bottle is already open";
        } else {
            return "Bottle is open";
        }
    }

    public String closedBottle() {
        if (!open) {
            return "The bottle is already closed";
        } else {
            return "The bottle is closed";
        }
    }
}



