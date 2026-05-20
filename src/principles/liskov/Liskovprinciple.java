package principles.liskov;
public class Liskovprinciple {
    public static class Menu {
        private String name;
        private String descriptions;
        private int price;

        public Menu(String name, String descriptions, int price) {
            this.name = name;
            this.descriptions = descriptions;
            this.price = price;
        }

        public int getPrice() {
            return this.price;
        }
    }

    public static class BeverageMenu extends Menu {
        private String name;
        private String descriptions;
        private int price;
        public BeverageMenu(String name, String descriptions, int price) {
          super(name,descriptions,price);
        }

        public double getPriceWithDiscount(int discount){
            return this.getPrice() - discount * 0.1 * this.price;
        }
    }

    public static void printPrice(Menu item) {
        // this will violate liskov principle and we would have check if item is instance of beverage and call getPriceWIthdiscount() method
        // in this case both price details will be get 100 only
        if (item instanceof BeverageMenu) {
            System.out.println("Beverage menu item details");
            System.out.println("Beverage price: "+ ((BeverageMenu)item).getPriceWithDiscount(10)); //here is problem

        }else {
            System.out.println("remaining item  details");
            System.out.println("menu item price: "+ item.getPrice());  // this will work as per
        }
    }

    public static void main(String[] args) {
        Menu item =new Menu( "Bread","wheat floor bread", 100);
        BeverageMenu beverageItem =new BeverageMenu( "Coke","cold beverages", 60);

        printPrice(item);
        printPrice(beverageItem);
    }


}
