package exception;
 class CredentialsNotValidException extends Exception {
 String username,password;
 public CredentialsNotValidException(String username,String password) {
	 this.username=username;
	 this.password=password;
 }
 public String toString() {
	 return "Entered wrong credentials,try again";
 }
}
 public class exep{
	 static void validation(String username,String password) throws CredentialsNotValidException {
 
	 if(username!="Apoorva" && password!="Ericsson") {
		 throw new CredentialsNotValidException(username,password);
	 }
 }
 public static void main(String args[]) {
	 
	 try {
		 exep.validation("abc", "xyz");
	 }catch(CredentialsNotValidException e) {
		 e.printStackTrace();
	 }finally {
		 System.out.print("prints every time");
	 }
	 System.out.print("rest of code");
 }
}
