import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Machine> machines = new ArrayList<>();
        machines.add(new Machine(1, 5));
        machines.add(new Machine(2, 3));
        machines.add(new Machine(3, 7));
        machines.add(new Machine(4, 1));
        machines.add(new Machine(5, 2));
        for(int i = 0; i < 10; i++) {
            Machine nextMachine = CopyManager.getNextMachine(machines);

            if (nextMachine != null) {
                System.out.println("Next machine: " + nextMachine.getMachineNumber());
            } else {
                System.out.println("No machine available");
            }
        }
        
    }
}
