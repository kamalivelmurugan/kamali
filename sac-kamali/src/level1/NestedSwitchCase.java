package level1;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int tech =2;
         int course =2;
         
         switch(tech)
         {
         case 1:
        	 System.out.println("python");
        	 break;
         case 2:
        	 switch(course) {
        	 case 1:
        		 System.out.println("j2EE");
        		 break;
        	 case 2:
        		 System.out.println("Java Script");
        	 }
         }
         
	}

}
