public class PrivateMemberExample {
    //creating a private variable using the private access modifier
    private String i_m_private = "I am private member, not accessible outside this Class";

    //creating a private method using the private access modifier
    private void privateMethod() {
        System.out.println("Private method of Outer Class");
    }

//    creating a inner class
    class NestedClass extends PrivateMemberExample {// using inheritance by using the extends keyword

        public void showPrivate() {
            System.out.println("Accessing Private members of Outer class: " + i_m_private);
            privateMethod();
        }

        private void privateMethod() {
            System.out.println("Private method of Nested Class");
        }
    }

    public static void main(String args[]) {
        PrivateMemberExample outerClass = new PrivateMemberExample();
        NestedClass nc = outerClass.new NestedClass();
        nc.showPrivate(); //shows that private method are accessible in inner class.

        outerClass = nc;
        nc.privateMethod(); //does not call private method from inner class because
                            // you can not override private method inside inner class.
        outerClass.privateMethod();

    }

}
