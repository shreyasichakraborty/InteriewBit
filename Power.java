import java.util.*;
public class Power {
    public int isPower(int A) {
        
        if(A==1)
        return 1;
        for(int x=2;x<=Math.sqrt(A);x++){
            int y=2;
            double p = Math.pow(x,y);
            while(p<=A && p>0){
                if(p==A)
                return 1;
                y++;
                p=Math.pow(x,y);
            }
        }
        return 0;
    }


	

    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int A=s.nextInt();
	Power p = new Power();
	int res = p.isPower(A);
	if(res==1)
	System.out.println("True");
	else
	System.out.println("False"); 
 }
}
