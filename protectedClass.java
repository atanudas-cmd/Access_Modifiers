 //Create a class with PROTECTED fields and methods. Access these fields and methods
//from any other class in the same package.
//Also, Access the PROTECTED fields and methods from child class located in a different package
//Access the PROTECTED fields and methods from any class in different packag
 
 class ProtectedClassFieldsMethod {
        protected String name;
        protected void protectedMethod() {
            System.out.println("This is a " + name);
        }
    }

public class protectedClass {
        public static void main(String[] args) {
                ProtectedClassFieldsMethod pc = new ProtectedClassFieldsMethod();
                pc.name = "Protected Method";
                pc.protectedMethod();
            }    
}
