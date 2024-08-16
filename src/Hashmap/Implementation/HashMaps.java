package Hashmap.Implementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMaps {

    private class HMNode{
        String key;
        Integer value;

        public HMNode(String key,Integer value)
        {
            this.key=key;
            this.value=value;
        }
        public String toString()
        {
            return this.key+"@"+this.value;
        }
    }

    private LinkedList<HMNode>[] bucketArray;
    private int size;

    public HashMaps()
    {
        this(5);
    }
    public HashMaps(int cap)
    {
        this.bucketArray=new LinkedList[cap];
        this.size=0;

        for(int i=0;i<bucketArray.length;i++)
        {
            bucketArray[i]=new LinkedList<>();
        }
    }

    public void put(String key,Integer value)
    {
        //key-->hashfunction-->key
        int index=hashFunction(key);

        //check if key exist in list or not
        LinkedList<HMNode> bucket=bucketArray[index];

        int fi=findBucket(bucket,key);

        if(fi==-1)
        {
            //create a node and add value to it
          HMNode nn=new HMNode(key,value);
          this.size++;
          bucket.addLast(nn);
        }
        //if yes update the value
        else{
          HMNode n=bucket.get(fi);
          n.value=value;
        }



        //calculate load factor again
       double threshold=(double) this.size/this.bucketArray.length;
        if(threshold>0.5)
        {
            reHash();
        }
    }

    public int hashFunction(String key)
    {
        int hc=key.hashCode();
        int bi=Math.abs(hc)% bucketArray.length;
        return bi;
    }

    private int findBucket(LinkedList<HMNode> bucket,String key)
    {
       for(int i=0;i<bucket.size();i++)
       {
         HMNode node=bucket.get(i);
         if(node.key.equals(key))
         {
             return i;
         }
       }
       return -1;
    }

    private void reHash()
    {
        LinkedList<HMNode>[] oldArray=this.bucketArray;
        this.bucketArray=new LinkedList[2* oldArray.length];

        for(int i=0;i<this.bucketArray.length;i++)
        {
            bucketArray[i]=new LinkedList<HMNode>();
        }
        for(int i=0;i<oldArray.length;i++) {
          LinkedList<HMNode> lst=oldArray[i];
          for(int j=0;j<lst.size();j++)
          {
              HMNode n=lst.get(j);
              put(n.key,n.value);
          }
        }
    }

    public Integer get(String key)
    {
        int bi=hashFunction(key);

        LinkedList<HMNode> bucket=bucketArray[bi];
        int fi=findBucket(bucket,key);
        if(fi==-1)
        {
            return -1;
        }else{
            return bucket.get(fi).value;
        }

    }

    private boolean containsKey(String key)
    {
        int bi=hashFunction(key);

        LinkedList<HMNode> bucket=bucketArray[bi];
        int fi=findBucket(bucket,key);
        return fi!=-1;
    }

    //Returns all the keys present in the hashMap

    public ArrayList<String> keySet()
    {
        ArrayList<String> keys=new ArrayList<>();
        for(int i=0;i<bucketArray.length;i++)
        {
            LinkedList<HMNode> bucket=bucketArray[i];

            for(int j=0;j<bucket.size();j++)
            {
                HMNode n=bucket.get(j);
                keys.add(n.key);
            }
        }
        return keys;
    }

    public void Display()
    {
        System.out.println("_________________");
        for(int i=0;i<bucketArray.length;i++)
        {
            LinkedList<HMNode> bucket=bucketArray[i];
            System.out.print("B "+i+" => ");

            for(int j=0;j<bucket.size();j++)
            {
                HMNode n=bucket.get(j);
                System.out.print(n+",");
            }
            System.out.println();
        }
        System.out.println("_________________");

    }

}
