import java.util.Scanner;

/**
 * Grocery Management System
 * Group Asssigment for CS3354
 * This program manages a grocery inventory using parallel arrays.
 * It serves as the main entry point for the application
 * 
 * @authors Prashant Subedi, Pratap Wosti, Deeason Sitaula
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Apple";
        itemPrices[0] = 0.50;
        itemStocks[0] = 100;
        itemNames[1] = "Banana";
        itemPrices[1] = 0.99;
        itemStocks[1] = 50;

        printInventory(itemNames, itemPrices, itemStocks);
    }

    /**
     * Task 1: Inventory Display
     * Iterates through the parallel array and displays all valid grocery items.
     * It checks for null values to ensure empty slots are skipped.
     * 
     * @param names  The array of item names.
     * @param prices The array of item prices.
     * @param stocks The array of item stock levels.
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("\nCurrent Grocery Inventory  ");
        System.out.println("Slot | Name           | Price   | Stock");
        System.out.println("----------------------------------------");

        // Create a counte for free space
        int emptySpots = 0;

        // Loop through all items
        for (int slotIndex = 0; slotIndex < names.length; slotIndex++) {
            if (names[slotIndex] != null) {
                // If item found -> make it readable
                String currentName = names[slotIndex];
                double currentPrice = prices[slotIndex];
                int currentStock = stocks[slotIndex];

                // Print the details
                System.out.printf("%-4d | %-15s | $%-6.2f | %-5d%n",
                        slotIndex, currentName, currentPrice, currentStock);
            } else {
                emptySpots++;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Inventory Capacity: " + emptySpots + " slots available.");
        System.out.println("----------------------------------------\n");
    }

    /**
     * Restocks a specific item by increasing its stock quantity.
     *
     * <p>
     * This method searches for the target item name in the names array.
     * If found, it increases the corresponding stock value in the stocks array
     * by the specified amount. If the item is not found, a message is displayed.
     * </p>
     *
     * @param names  Array containing item names.
     * @param stocks Array containing stock quantities corresponding to item names.
     * @param target The name of the item to restock.
     * @param amount The quantity to add to the current stock.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                System.out.println("Restocked " + target + ". New stock: " + stocks[i]);
                return;
            }
        }
        System.out.println("Item " + target + " not found.");
    }
}
