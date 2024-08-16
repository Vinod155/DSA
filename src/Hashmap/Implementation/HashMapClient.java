package Hashmap.Implementation;

public class HashMapClient {

    public static void main(String[] args) {
        HashMaps hash=new HashMaps();
        hash.put("vinnie",10);
        hash.put("riya",12);
        hash.Display();
        System.out.println(hash.get("vinnie"));
    }

}
