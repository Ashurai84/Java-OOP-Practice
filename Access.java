class Student {
    private String name = "Ashu";  // Private - Only accessible inside the class
    int rollno = 32;               // Default - Accessible in same package
    protected int marks = 89;      // Protected - Accessible in same package & subclass

    void display() {
        System.out.println("The name of student is " + name);
        System.out.println("The student roll no is " + rollno);
        System.out.println("He got marks in maths: " + marks);
    }
}

public class Access {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();                  // ✅ Corrected to small 's'
        System.out.println(s.marks);  // ✅ protected - accessible
        System.out.println(s.rollno); // ✅ default - accessible
        // System.out.println(s.name); // ❌ Error - private variable not accessible outside class
    }
}
