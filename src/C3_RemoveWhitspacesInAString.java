public class C3_RemoveWhitspacesInAString {
    public static void main(String[] args) {

        String str="my name is khan.my name is bob. my name is sonoo";
        String replacestring=str.replaceAll("\\s", "");
        System.out.println(replacestring);
    }
}

//String=my name is khan.my name is bob. my name is sonoo
//Output=mynameiskhan.mynameisbob.mynameissonoo