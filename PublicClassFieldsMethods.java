
class PublicClass1 
{
        
        public String Name = "Public";
        public void publicMethod() 
        {
            System.out.println("This is " + Name);
        }
    }

public class PublicClassFieldsMethods 
{
        public static void main(String[] args) 
        {
                
                PublicClass1 obj = new PublicClass1();
                obj.Name = "Public Method";
                obj.publicMethod();
  
        }     
}
