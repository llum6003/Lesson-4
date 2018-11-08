/**
 * 
 */
package staticVarExample;

/**
 * @author leonardolumpford
 *
 */
public class staticVarExample {
	   public static String myClassVar="class or static variable";
		
	   public static void main(String args[]){
	      staticVarExample obj = new staticVarExample();
	      staticVarExample obj2 = new staticVarExample();
	      staticVarExample obj3 = new staticVarExample();
	      
	      //All three will display "class or static variable"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);

	      //changing the value of static variable using obj2
	      obj2.myClassVar = "Changed Text";

	      //All three will display "Changed Text"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);
	   }
	}