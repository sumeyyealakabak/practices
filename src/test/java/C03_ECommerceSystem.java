
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class C03_ECommerceSystem {
        public static void main(String[] args) {
             /*
    Question:
Create a structure to store product categories and products belonging to these categories in an e-commerce system.
The name and price of each product will be stored.

Use the category name as the key (for example: ‘Electronics’, ‘Books’) and
 use a HashMap as the value that stores the products in each category and their prices.
Create a structure with the following categories and products:
Electronics:
Telephone: 15,000
Laptop: 25,000

Books
Novels: 50
Science 75

Clothing:
T-shirt: 150
Trousers 250
Get a category name from the user and print the products in that category and their prices on the screen.
Get a category and product name from the user and print the price of that product. If the category or product cannot be found, display an appropriate message.
     */
            // 1. Create Nested Map to store categories and products
            Map<String, Map<String, Integer>> categories = new HashMap<>();

            // 2. Add products and prices for each category
            Map<String, Integer> electronics = new HashMap<>();
            electronics.put("Telefon", 15000);
            electronics.put("Laptop", 25000);

            Map<String, Integer> books = new HashMap<>();
            books.put("Roman", 50);
            books.put("Bilim", 75);

            Map<String, Integer> clothing = new HashMap<>();
            clothing.put("Tişört", 150);
            clothing.put("Pantolon", 250);

            categories.put("Elektronik", electronics);
            categories.put("Kitaplar", books);
            categories.put("Giyim", clothing);

            Scanner scanner = new Scanner(System.in);

            // 3. Get category name from user and show products
            System.out.print("Bir kategori adı girin (örneğin: Elektronik): ");
            String categoryName = scanner.nextLine();

            if (categories.containsKey(categoryName)) {
                System.out.println(categoryName + " kategorisindeki ürünler:");
                for (Map.Entry<String, Integer> entry : categories.get(categoryName).entrySet()) {
                    System.out.println("Ürün: " + entry.getKey() + ", Fiyat: " + entry.getValue() + " TL");
                }
            } else {
                System.out.println("Bu kategori bulunamadı.");
            }

            // 4. Get category and product name from the user, print the price
            System.out.print("\nBir kategori adı girin: ");
            String selectedCategory = scanner.nextLine();

            System.out.print("Bir ürün adı girin: ");
            String productName = scanner.nextLine();

            if (categories.containsKey(selectedCategory)) {
                Map<String, Integer> selectedProducts = categories.get(selectedCategory);
                if (selectedProducts.containsKey(productName)) {
                    System.out.println(productName + " fiyatı: " + selectedProducts.get(productName) + " TL");
                } else {
                    System.out.println("Bu ürün bulunamadı.");
                }
            } else {
                System.out.println("Bu kategori bulunamadı.");
            }

            scanner.close();
        }
    }

