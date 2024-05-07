package Recurssion.Palindrome;

public class palindrome {

    public static boolean palindrome(int i,String str)
    {
        if(i>=str.length()/2)
        {
            return true;
        }

        if(str.charAt(i)!=(str.charAt(str.length()-i-1)))
        {
            return false;
        }

       return palindrome(i+1,str);

    }

    public static void main(String[] args) {

        String s= "swws";
        System.out.println(palindrome(0,s));

    }


}
