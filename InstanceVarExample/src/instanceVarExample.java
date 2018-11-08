/**
 * 
 */

/**
 * @author leonardolumpford
 *
 */
public class instanceVarExample {
   String myInstanceVar="instance variable";
	
   public static void main(String args[]){
	instanceVarExample obj = new instanceVarExample();
	instanceVarExample obj2 = new instanceVarExample();
	instanceVarExample obj3 = new instanceVarExample();
		
	System.out.println(obj.myInstanceVar);
	System.out.println(obj2.myInstanceVar);
	System.out.println(obj3.myInstanceVar);

		
	obj2.myInstanceVar = "Changed Text";

		
	System.out.println(obj.myInstanceVar);
	System.out.println(obj2.myInstanceVar);
	System.out.println(obj3.myInstanceVar);
   }
}