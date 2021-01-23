
public class OperatorsDemo {

	static int a=100;
	static int b=40;

	public static void main(String[] args) {

		System.out.println("a + b:"+ (a+b));
		System.out.println("a % b:"+ (a % b));
		
		a -=b;
		System.out.println("-= Output:"+a);

		a *=b;
		System.out.println("*= Output:"+a);
		
			a++;
			b--;
		System.out.println("a++:"+a);
		System.out.println("b--:"+b);
		
		{
			if (a == b) {
				System.out.println("a and b are equal");
				}
			else {
				System.out.println("a and b are not equal");
				
			if (a>b) {
				System.out.println("a is greater than b");
			}
			else {
				System.out.println("a is not greater than b");
			}
			}
			}
		
		boolean c=true;
		boolean d=false;
		System.out.println("c&&d:"+(c&&d));
		System.out.println("c||d:"+ (c||d));
		System.out.println("!(c&&d):"+!(c&&d));

			   int f = 10;
			   int g = 20;
			Object result = f&g;
			System.out.println("f&g: "+result);
		    
		    result= f|g;
		    System.out.println("f|g: "+result);
		    
		    result= f^g;
		    System.out.println("f^g: "+result);
		    
		    result= ~f;
		    System.out.println("~f:"+result);
		    
		    result= f<<g;
		    System.out.println("f<<g: "+result);
		    
		    result= f>>g;
		    System.out.println("f>>g: "+result);
		    
		    int daysOfYear= 366;
		    String result1;
		    result1 = (daysOfYear == 365) ? "Not a leap year" : "Leap year";
		    System.out.println(result1);
		    
		}
	}

