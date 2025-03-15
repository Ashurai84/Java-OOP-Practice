
//     double w;
//     double l;
//     double h;

// }
// class Boxdemo1{
//     public static void main(String[] args) {
//       box mybook1 = new box();
//       box mybook2 = new box();
//       double vol;


//       mybook1.h = 23;
//       mybook1.w = 32;
//       mybook1.l = 12;


//       mybook2.w=5;
//       mybook2.h=5;
//       mybook2.l=4;


//       vol=mybook1.h* mybook1.w*mybook1.l;
// System.out.println("voluem of this box 1 is : "+ vol);
//       vol=mybook2.h* mybook2.w*mybook2.l;

//       System.out.println("the volume of this  box is : "+vol);

//     }

// }



// Car Class
class CAR {
  String model;
  String brand;
  float price;

  // Constructor
  CAR(String model, String brand, float price) {
      this.model = model;
      this.brand = brand;
      this.price = price;
  }

  // Display Method
  void display() {
      System.out.println("The car model name is " + model + " and brand name is " + brand + ".");
      System.out.println("The final price is " + price + " (on-road price).");
  }
}

// Main Class
public class S {
  public static void main(String[] args) {
      CAR myCar = new CAR("TATA", "Suzuki", 2233.232f); // Corrected syntax
      myCar.display();
  }
}
