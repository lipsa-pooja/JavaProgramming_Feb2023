import java.util.HashMap;

public class C6_PrintEachWordAndOccurances {
    public static void main(String[] args) {
        String str = "java world class Programming";
        findWordOccurances(str);
    }
    public static void findWordOccurances(String input)
    {
        String[] splitwords=input.split(" ");
        System.out.println(splitwords);
        HashMap<String,Integer> hm=new HashMap<>();
        for(String eachword:splitwords)
        {
            if(hm.get(eachword)==null)
            {
                hm.put(eachword,1);
            }
            else {
                hm.put(eachword,hm.get(eachword)+1);
            }
            System.out.println("key: "+eachword+"  occurances: "+hm.get(eachword));
        }

    }
}
