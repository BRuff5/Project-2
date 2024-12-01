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
}