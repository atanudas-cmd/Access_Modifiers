public class PrivateFieldsMethods {


    private String name = "Atanu";
    private int age = 21;
    private void pvtMethod() {

        System.out.println("My Name is: " + name + "       My age is: " + age);
    }

    
    public static void main(String[] args) {
        PrivateFieldsMethods obj = new PrivateFieldsMethods();
        
        System.out.println(obj.age);
        System.out.println(obj.name);
       
        obj.pvtMethod();
    }
}
