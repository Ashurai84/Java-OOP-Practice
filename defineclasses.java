

class Box{
    double w;
    double l;
    double h;


    void volume(){                          // method 
        System.out.println("Volume  is ");
        System.out.println(w*l*h);
    }

}
public class defineclasses {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();


        mybox1.h=10;
        mybox1.w=20;
        mybox1.l=3;

        // mybox2 
        mybox2.l=2;
        mybox2.w=2;
        mybox2.h=2;

        mybox1.volume();
        mybox2.volume();

    }
}