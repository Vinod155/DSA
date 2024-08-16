package Hashmap.Questions;


import java.util.HashMap;

public class maximumFrequencyCharacter {
    public static void main(String[] args) {
        System.out.println(findMax("AAAAAAAAAAAAAAAAAAAAAAAAAAAAbbccccccccccddffghaaa"));
    }

    public static char findMax(String s)
    {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int max=Integer.MIN_VALUE;
        char res='0';
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hashMap.containsKey(c))
            {
                int val= hashMap.get(c);
                if(max<val)
                {
                    max=val;
                    res=c;
                }
                hashMap.put(c,val+1);
            }
            else{
               hashMap.put(c,1);
            }
        }
        return res;
    }
}
