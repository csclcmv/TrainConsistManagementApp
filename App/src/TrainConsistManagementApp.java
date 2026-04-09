import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // ===== UC1: Initialize Train =====
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // ===== UC2: Add Passenger Bogies =====
        System.out.println("\n--- Adding Passenger Bogies ---");

        // Add bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition: " + trainConsist);

        // Remove a bogie
        System.out.println("\n--- Removing a Bogie (AC Chair) ---");
        trainConsist.remove("AC Chair");

        // Display after removal
        System.out.println("Bogies after removal: " + trainConsist);

        // Check existence
        System.out.println("\n--- Checking for Sleeper Bogie ---");
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final state
        System.out.println("\nFinal train consist: " + trainConsist);

        // Program continues...
    }
}