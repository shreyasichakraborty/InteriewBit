import java.util.*;
public class PrimeSum {
    
    public ArrayList<Integer> sieve(int n){
        ArrayList<Integer> pp = new ArrayList<Integer>();
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++){
            prime[i]=true;
        }
        
        for(int p =2 ; p*p <= n ;p++){
            if(prime[p]==true){
                for(int i=p*p;i<=n;i+=p)
                    prime[i]=false;
            }
        }
        
        
        for(int i=2;i<=n;i++){
            if(prime[i]==true)
                pp.add(i);
        }
        return pp;
    }
   
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        ArrayList<Integer> k = new ArrayList<Integer>();
        l=sieve(A);
       
        int start = 0;
        int end = l.size()-1;
        for(int i=0;i<l.size();i++){
           if(l.get(start)+l.get(end)==A){
               k.add(l.get(start));
               k.add(l.get(end));
               break;
           }
            else if(l.get(start)+l.get(end)>A){
               
               end--;
           }
           else{
               start++;
           }
           
        }
        
        return k;
    }

	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int A = s.nextInt();
	PrimeSum ps = new PrimeSum();
	System.out.println(ps.primesum(A));
   }
}
