
// второе задание

 public class Array {
     public static void main(String[] args) {
         Product[] productsArray = new Product[5];
         productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
         productsArray[1] = new Product("Xiaomi 17 pro max", "11.05.2023", "Xiaomi", "China", 110000, false);
         productsArray[2] = new Product("iPhone 17 Pro", "02.04.2025", "Apple", "Japan", 99999, true);
         productsArray[3] = new Product("realme P3 Lite 8", "10.10.2024", "Realme", "China", 10000, true);
         productsArray[4] = new Product(" Hot 60 Pro", "02.05.2023", "Infinix", "China", 15000, false);

         // выведем
         for (int i = 0; i < productsArray.length; i++) {
             productsArray[i].printInfo();
             System.out.println();

         }


     }

 }