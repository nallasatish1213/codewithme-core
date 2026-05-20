package principles.liskov;
public class LiskovPrincipleSolved {
    public static class Menu {
        private String name;
        private String descriptions;
        private double price;

        public Menu(String name, String descriptions, double price) {
            this.name = name;
            this.descriptions = descriptions;
            this.price = price;
        }

        public double getPrice() {
            return this.price - this.getDiscount();
        }

        private double getDiscount(){
            return 0;
        }
    }

    public static class BeverageMenu extends Menu {
        private String name;
        private String descriptions;
        private int price;
        public BeverageMenu(String name, String descriptions, int price) {
            super(name,descriptions,price);
            this.name=name;
            this.descriptions=descriptions;
            this.price=price;
        }

        @Override
        public double getPrice() {
            return this.price - this.getDiscount();
        }

        private double getDiscount() {
            int discount=10;
            return discount * .01 * this.price;
        }
    }

    public static void printPrice(Menu item) {

        if (item instanceof BeverageMenu) {
            System.out.print("Beverage menu item details: ");
        }else {
            System.out.print("remaining item  details: ");
        }
        System.out.println(item.getPrice());
    }

    public static void main(String[] args) {
        Menu item =new Menu( "Bread","wheat floor bread", 100);
        Menu beverageItem = new BeverageMenu( "Coke","cold beverages", 60);

        printPrice(item);
        printPrice(beverageItem);
    }


}
