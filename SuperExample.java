// class Animal{
//     Animal(){
//         System.out.println("Animal constructor is being called ");
//     }
// }

// class cat extends Animal{
//         cat(){
        
            
//         System.out.println("Cat is being called ");

//     }
// }
// class Dog extends Animal{
//     Dog(){
//        super();
//         System.out.println("dOG IS BEIONG CALLED FROM ANIMAL ");
//     }
// }
// public class Super {

//     public static void main(String[] args) {
//         Dog d = new Dog();
//         cat c =  new cat();




//     }
// }









// super.var
 
// // Parent Class
// class Vehicle {
//     String brand = "Generic Vehicle";
// }

// // Child Class
// class Car extends Vehicle {
//     String brand = "Tesla";

//     // Method to Display Brand Names
//     void displayNames() {
//         System.out.println("Car brand is: " + this.brand);   // Child class variable
//         System.out.println("Vehicle brand is: " + super.brand); // Parent class variable
//     }
// }

// // Main Class
// public class SuperExample {
//     public static void main(String[] args) {
//         Car myCar = new Car(); // Car Object
//         myCar.displayNames(); // Method Call
//     }
// }

// class Animal{
//     String species = "General Animal";

// }

// class dog extends Animal{
//      String species = "German Shepherd";
     

//      void displaySpecies(){
//         System.out.println("the dog species veleongs to "+this.species);
//         System.out.println("Animal is a "+super.species);
//      }
// }
// public class SuperExample {

//     public static void main(String[] args) {
//         dog d =new dog();
//          d.displaySpecies();

//     }
// }







// person 

// class person{
//     String name = "General Person";}

// class Student extends  person{
//     String name = "Engineering Student";

//     void displayName(){
//         System.out.println(" the person belongs  to "+this.name);
//         System.out.println("the person is doing "+super.name);

//     }

// }
// public class SuperExample {

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.displayName();
//     }
// }


// class employee{
//     String designation = "General Employee";

// }

// class manager extends employee {

// String designation = "Project Manager";


// void displayDesignation(){
//     System.out.println("the employee is an "+this.designation);
//     System.out.println("the role of emplloyee is "+super.designation);

// }

// }
// public class SuperExample {

//     public static void main(String[] args) {
//         manager m = new manager();
//         m.displayDesignation();
//     }
// }


// class laptop

// class  laptop{
//     String brand = "Generic Laptop";

// }
// class GamingLaptop extends  laptop{
//     String brand = "ASUS laptop";


//     void displayBrand(){
// System.out.println("THE laptop name is and brand is "+brand);
// System.out.println("the laptop bleongs to "+super.brand);
//     }
// }

//     public class SuperExample {
    
//         public static void main(String[] args) {
//             GamingLaptop g = new GamingLaptop();
//             g.displayBrand();
//         }
//     }




//class mobile


// class mobile{
//     String company = "Generic Mobile";

// }

// class SmartPhone extends mobile{
//     String company = "Samsung";

//     void displayCompany(){
//         System.out.println("The smartphone is  brand is "+company);

//         System.out.println("this smartphone belongs to "+super.company);
//     }
// }


// public class SuperExample {

//     public static void main(String[] args) {
//         SmartPhone s = new SmartPhone();

//         s.displayCompany();
//     }
// }



// class food 

class food{
    String category = "General Food";

}
class  pizza extends food{
    String category = "Fast food";

    void displayFood(){
        System.out.println(" pizza comes in "+category+"  category ");
        System.out.println("this food belongs to "+super.category);
    }

}
public class SuperExample {

    public static void main(String[] args) {
        pizza p = new pizza();
        p.displayFood();
    }
}