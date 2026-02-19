/*
Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. View");
            System.out.println("2. Restock");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int userChoice = keyboard.nextInt();
            keyboard.nextLine(); // consume the newline

            switch (userChoice) {
                case 1:
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                case 2:
                    System.out.print("Enter item name to restock: ");
                    String itemName = keyboard.nextLine();
                    System.out.print("Enter amount to restock: ");
                    int amount = keyboard.nextInt();
                    restockItem(itemNames, itemStocks, itemName, amount);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
}

*/


/*

    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for(int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Item: " + names[i] + ", Price: $" + prices[i] + ", Stock: " + stocks[i]);
            }
        }
    } 

    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        for(int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                System.out.println("Restocked " + target + ". New stock: " + stocks[i]);
                return;
            }
        }
        System.out.println("Item " + target + " not found.");
    }


*/
