import java.util.*;
public class CopyManager {
        
    public static Machine getNextMachine(List<Machine> machines) {
        Machine nextMachine = null;
        int oldestTime = Integer.MAX_VALUE;
        for (Machine machine : machines) {
            int lastCopyTime = machine.getLastCopyTime();
            if (lastCopyTime < oldestTime) {
                oldestTime = lastCopyTime;
                nextMachine = machine;
            }
        }
        if (nextMachine != null) {
            nextMachine.setLastCopyTime(oldestTime + 1);
        }

        return nextMachine;
    }
}