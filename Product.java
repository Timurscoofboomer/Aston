public class Product {
    String name;
    String dateString;
    String manufacturer;
    String originCountry;
    double price;
    boolean bookingStatus;

    public Product(String name, String dateString, String manufacturer,
                   String originCountry, double price, boolean bookingStatus){
        this.name = name;
        this.dateString = dateString;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.bookingStatus = bookingStatus;

    }

    public void printInfo() {
        System.out.println("Название товара: " + name);
        System.out.println("Дата производства: " + dateString);
        System.out.println("Производитель:  " + manufacturer);
        System.out.println("Страна происхождения: " + originCountry);
        System.out.println("Цена: " + price);
        System.out.println("Cостояние бронирования покупателем: " + bookingStatus);

    }

    // протестируем

    public static void main(String[] args) {

        Product prod = new Product(
                "Велосипед",
                "11.05.2023",
                "GT",
                "Китай",
                60399.99,
                true
        );

        prod.printInfo();
    }

    }


