/*Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Input : 12121
Output : True

Input : 123
Output : False

*/
import java.util.*;
public class PalindromeInteger {
    public int isPalindrome(int A) {
        if(A<0)
        return 0;
        String str = "" + A;
        int start = 0;
        int end = str.length()-1 ;
        int flag = 0;
        for(int i=0;i<str.length()/2 + 1 ; i++){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            
            else{
                flag=1;
            }
        }
        if(flag==1)
        return 0;
        
        else
        return 1;
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
	PalindromeInteger p = new PalindromeInteger();
        int res = p.isPalindrome(n);
        if(res==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
