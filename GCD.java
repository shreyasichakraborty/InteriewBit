import java.util.*;
public class GCD {
    public int gcd(int A, int B) {
        if(A==0)
        return B;
        if(A==B)
        return A;
        else if(A>B)
        return gcd(B,A);
        else{
            return gcd(B%A,A);
        }
    }
	

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int A=s.nextInt();
	int B=s.nextInt();
	GCD g = new GCD();
	System.out.println(g.gcd(A,B)); 
 }
}
