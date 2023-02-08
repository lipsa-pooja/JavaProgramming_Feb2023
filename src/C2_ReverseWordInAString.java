public class C2_ReverseWordInAString {
    public static void main(String[] args) {
     String str="Bank of Singapore asia's bank hub";
     String revstr="";
     String[] splitword=str.split(" ");

         for(int i=splitword.length-1;i>=0;i--)
         {
             revstr=revstr+" " +splitword[i];
         }
        System.out.println(revstr);

     }


}

//String =Bank of Singapore asia's bank hub
//output=hub bank asia's Singapore of Bank