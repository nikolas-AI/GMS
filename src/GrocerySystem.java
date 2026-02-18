/**
 * Grocery Management System
 * Group Asssigment for CS3354
 * This program manages a grocery inventory using parallel arrays.
 * It serves as the main entry point for the application
 * @author Deeason Sitaula
 * @version 1.0
 */

public class GrocerySystem {
    /**
     * The main method initializes the inverntory and handles the user menu.
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args)
        {
            // Three seperate array implemented parallely to track items.
    
            // Array for Item Names
            String[] itemNames = new String[10];
    
            // Array for Item Prices
            double[] itemPrices = new double[10];
    
            // Array for Inventory Counts
            int[] itemStocks = new int[10];
    
            // Menu (Task 3)
            printInventory(itemNames, itemPrices, itemStocks);
        }
        /**
         * Task 1: Inventory Display
         * Iterates through the parallel array and displays all valid grocery items.
         * It checks for null values to ensure empty slots are skipped.
         * @param names The array  of item names.
         * @param prices The array of item prices.
         * @param stocks The array of item stock levels.
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks)
    {
        System.out.println("\n Cuurrent Grocery Inventory  ");
        System.out.println("Slot  | Name       | Price  | Stock");
        System.out.println("-----------------------------------");
        
        // Create a counte for free space
        int emptySpots = 0;

        // Loop through all items
        for (int slotIndex = 0; slotIndex < names.length; slotIndex++)
        {
            if (names[slotIndex] != null)
            {
                // If item found -> make it readable
                String currentName = names[slotIndex];
                double currentPrice = prices[slotIndex];
                int currentStock = stocks[slotIndex];

                // Print the details
                System.out.printf("%-4d | %-15s | $-6.2f | %-5d%n",
                    slotIndex, currentName, currentPrice, currentStock);
            } else{
                    emptySpots++;
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Inventory Capacity: " + emptySpots + " slots available.");
        System.out.println("---------------------------------------------\n");
    }
    
}
