
class  laptop{
    String brand = "Generic Laptop";

}
class GamingLaptop extends  laptop{
    String brand = "ASUS laptop";


    void displayBrand(){
System.out.println("THE laptop name is and brand is "+this.brand);
System.out.println("the laptop bleongs to "+super.brand);
    }
}

    public class SuperExample {
    
        public static void main(String[] args) {
            GamingLaptop g = new GamingLaptop();
            g.displayBrand();
        }
    }




