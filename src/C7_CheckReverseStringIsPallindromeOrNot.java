public class C7_CheckReverseStringIsPallindromeOrNot {
    public static void main(String[] args) {
        String str="BankOfSingapore";
        //String str="madam";
        String revstr= "";
        for(int i=str.length()-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
       // System.out.println("Reverse String "+str +" is : "+revstr);
        if(str.equalsIgnoreCase(revstr))
        {
            System.out.println("String is pallindrome");
        }
        else {
            System.out.println("String is not Pallidrome");
        }

    }
    }

