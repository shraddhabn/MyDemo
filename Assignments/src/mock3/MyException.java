package mock3;
class Custom extends Exception {
	   String message;
	   Custom(String str) {
	      message = str;
	   }
	   public String toString() {
	      return ("this is Custom Exception  : " + message);
	   }
	}
	public class MyException {
	   public static void main(String args[]) {
	      try {
	         throw new Custom(" I am custom message");
	      } catch(Custom e) {
	         System.out.println(e);
	      }
	   }
	}
