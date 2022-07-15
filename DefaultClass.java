class DefaultClass1 {
       
        int myAge;
        String myName;
    
        
        void defaultMethod() {
            System.out.println("My name is " + myName + "  My age is " + myAge);
        }
    }

public class DefaultClass {
        public static void main(String[] args) {
               
                DefaultClass1 obj = new DefaultClass1();
                
                obj.myAge = 21;
                obj.myName = "Atanu";
               
                obj.defaultMethod();
            } 
}
