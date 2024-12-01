import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.Node;

/**
 * A Quadtree data structure 
 * that allows for the insertion, deletion, 
 * updating, and retrieval of rectangles 
 * in a 2D space.
 */

public class main {
    private Node root;

    /**
     * Defines the initial bounds.
     */
    public main() {
        this.root = new LeafNode(-50, -50, 100, 100);
    }
    /**
     * Processes commands from a specified file.
     * @param filePath the path to the command file
     */
    public void processCommands(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String commandLine = scanner.nextLine().trim();
                String[] parts = commandLine.split(" ");
                switch (parts[0]) {
                    case "Insert":
                        // Insert rectangle parsing and logic
                        break;
                    case "Find":
                        // Find rectangle parsing and logic
                        break;
                    case "Delete":
                        // Delete rectangle parsing and logic
                        break;
                    case "Update":
                        // Update rectangle parsing and logic
                        break;
                    case "Dump":
                        dump();
                        break;
                    default:
                        System.out.println("Invalid command.");
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Error processing commands: " + e.getMessage());
        }
    }

}