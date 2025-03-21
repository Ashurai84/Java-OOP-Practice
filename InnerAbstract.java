// abstract  class  Animal{
//     abstract void makesound();

//     void sleep(){
//         System.out.println("Sleeping.....");
//     }}

//     class dog extends Animal{
//         @Override
//         void makesound(){
//             System.out.println("dogs barking........");
//         }
//     }
//    public class Abstract {
   
//     public static void main(String[] args) {
//         dog d = new dog();
//         d.makesound();
//         d.sleep();
//     }
//    }






// abstract  class  vehicle {
//     abstract void engine();

//     void v8(){
//         System.out.println("this sis very power full engine");
//     }}

 
//         class  Suzuki  extends vehicle{
//     @Override
//     void engine(){
//         System.out.println("this is labo and no comparasion from it ");
//     }
// }

// public class Abstract {

//     public static void main(String[] args) {
//         Suzuki s = new Suzuki();
//         s.engine();
//         s.v8();
//     }
// }


// // Abstract Class Shape
// abstract class Shape {
//     abstract void area();  
// }

// // Interface Drawable
// interface Drawable {
//     void draw();  
// }

// // Circle Class extends Shape and implements Drawable
// class Circle extends Shape implements Drawable {
//     double radius;

//     // Constructor
//     Circle(double r) {
//         radius = r;
//     }

//     // Implement area() method of Shape
//     void area() {
//         double area = 3.14 * radius * radius;
//         System.out.println("Area of Circle: " + area);
//     }

//     // Implement draw() method of Drawable
//     public void draw() {
//         System.out.println("Drawing Circle...");
//     }
// }

// // Main Class
// public class Abstract {
//     public static void main(String[] args) {
//         Circle c = new Circle(5);  
//         c.draw();   
//         c.area();     
//     }
// }






// abstract class Animal{   // abstrcat classs hai yeh 
// abstract void makesound();} // AAbstract method hai yeh  and its is runtime me ovveride karrr  raha hai 
// class  Dog extends Animal{
//     @Override
//     void makesound(){
//         System.out.println("Dog barks.......");}}
// public class InnerAbstract {
//      public static void main(String[] args) {
//         Dog d = new Dog();
//         d.makesound();}}









