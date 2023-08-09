//Short Encapsulation Example in Java
//        In the example below, encapsulation is demonstrated as an OOP concept in Java. Here, the variable “name” is kept private or “encapsulated.”

        //save as Student.java

public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//save as Test.java

class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Mahabir");
        System.out.println("Student's name is " + s.getName());
    }
}
