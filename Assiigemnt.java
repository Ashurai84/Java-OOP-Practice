




abstract  class Animal{
   
    public abstract  void eat();

}




class  dog extends Animal{
    public void eat(){
        System.out.println("woff woff....... nice food ");


    }

}


class  cat extends Animal{

    public void eat (){
        System.out.println("meow moew");
        System.out.println("Pretty eat .........");
    }
}

public class Assiigemnt {

    public static void main(String[] args) {
        Animal dog = new dog() ;
        Animal cat = new cat();


        dog.eat();
        cat.eat();


            
        }
    }

