
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class C02_Supermarket {
        public static void main(String[] args) {
            /*
    Question:
Write an application that stores the names (for example: ‘Apple’, ‘Banana’, ‘Cheese’) and prices (for example: 15, 25, 40) of products in a supermarket. Write a script that asks you to do the following:

1. Store the product names and prices in a HashMap.
2. Add 5 different products to the map.
3. Get a product name from the user and print the price of that product on the screen.
4. If the product is not found, display the message ‘Product out of stock’.
5. Calculate the total price of all products and print it on the screen.
     */
            // 1. Create a HashMap to store product names and prices
            Map<String, Integer> products = new HashMap<>();

            // 2. Add 5 different products to the map
            products.put("Elma", 15);
            products.put("Muz", 25);
            products.put("Peynir", 40);
            products.put("Süt", 20);
            products.put("Ekmek", 10);

            // 3. Get a product name from the user and show the price of that product
            Scanner scanner = new Scanner(System.in);
            System.out.print("Fiyatını öğrenmek istediğiniz ürünün ismini girin: ");
            String productName = scanner.nextLine();

            if (products.containsKey(productName)) {
                System.out.println(productName + " fiyatı: " + products.get(productName) + " TL");
            } else {
                System.out.println("Ürün stokta yok.");
            }

            // 4. Calculate the total price of all products
            int totalPrice = 0;
            for (int price : products.values()) {
                totalPrice += price;
            }

            System.out.println("Tüm ürünlerin toplam fiyatı: " + totalPrice + " TL");

            scanner.close();
        }
    }


