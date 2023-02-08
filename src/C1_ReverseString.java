public class C1_ReverseString {
    public static void main(String[] args) {
        String str="BankOfSingapore";
        String revstr= "";
        for(int i=str.length()-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        System.out.println("Reverse String "+str +" is : "+revstr);

    }
}

//String=BankOfSingapore
//Output=eropagniSfOknaB