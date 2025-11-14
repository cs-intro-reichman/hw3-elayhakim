// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		int x=x1;
		if(x2<0){
			for(int i=x2; i<0; i++){
			x--;
		}
		return x;
		}else{
		for(int i=0; i<x2; i++){
			x++;
		}
		return x;
		}
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int x = x1;
		if(x2<0){
			for(int i=x2; i<0; i++){
			x++;
		}
		return x;
		}else{
		for(int i=0; i<x2; i++){
			x--;
		}
		return x;
		}
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int sighn = 1;
		int x3=0;
		int x4=0;
		if(x1 == 0 || x2 ==0){
			return 0;
		}
		int x=0;
		if(x1 > 0 && x2 > 0){
			x3=x1;
			x4=x2;
			sighn = 1;
		}else if (x1 < 0 && x2 < 0) {
			x3 = minus(0,x1);
			x4 = minus(0,x2);
			sighn =1;
		}else if (x1 < 0) {
			x3 = minus(0,x1);
			x4= x2;
			sighn = -1;
		}else{
			x3= x1;
			x4 = minus(0,x2);
			sighn = -1;
		}
		for(int i=0; i<x4; i++){
				x= plus(x, x3);
			}
		if(sighn>0){
			return x;
		}else{
			return (minus(0, x));
		}
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int num=1;
		for(int i=0; i<n; i++){
			num = times(num,x);
		}
		return num;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int sighn = 1;
		int x3=0;
		int x4=0;
		if(x1 == 0 || x2 ==0){
			return 0;
		}
		if(x1 > 0 && x2 > 0){
			x3=x1;
			x4=x2;
			sighn = 1;
		}else if (x1 < 0 && x2 < 0) {
			x3 = minus(0,x1);
			x4 = minus(0,x2);
			sighn =1;
		}else if (x1 < 0) {
			x3 = minus(0,x1);
			x4= x2;
			sighn = -1;
		}else{
			x3= x1;
			x4 = minus(0,x2);
			sighn = -1;
		}
		int count = 0;
		int x10 = x4;
		while(x3>=x4){
			x4= plus(x4,x10);
			count++;
		}
		if(sighn>0){
			return count;
		}else{
			return (minus(0, count));
		}
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		return minus(x1,times(x2,div(x1,x2)));
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		if(x>0){
			for(int i=0; i<=x; i++){
				if(times(i,i)==x){
					return i;
				}
			}
		}
		return 0;
	}	  	  
}