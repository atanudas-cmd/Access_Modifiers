public class AccessingProtectedFieldsMethod extends ProtectedClassFieldsMethod {
        public static void main(String[] args) {
               
                AccessingProtectedFieldsMethod obj = new AccessingProtectedFieldsMethod();
                
               obj.name = "Protected Method in SubClass";
              
                obj.protectedMethod();
            }
}
