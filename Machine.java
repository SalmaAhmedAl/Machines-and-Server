import java.util.*;

public class Machine{
    private int machineNumber;
    private int lastCopyTime;

    public Machine(int machineNumber, int lastCopyTime) {
        this.machineNumber = machineNumber;
        this.lastCopyTime = lastCopyTime;
    }

    public int getMachineNumber() {
        return machineNumber;
    }

    public int getLastCopyTime() {
        return lastCopyTime;
    }

    public void setLastCopyTime(int lastCopyTime) {
        this.lastCopyTime = lastCopyTime;
    }
}