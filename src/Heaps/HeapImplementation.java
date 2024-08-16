package Heaps;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class HeapImplementation {

    ArrayList<Integer> heap=new ArrayList<>();

    public void add(int item)
    {
        this.heap.add(item);
        upHeapify(this.heap.size()-1);
    }

    public void remove(int item) throws Exception {
         if(this.heap.size()==0)
         {
             return;
         }
         swap(this.heap,0,this.heap.size()-1);
         this.heap.remove(this.heap.size()-1);

         downHeapyfy(0);
    }

    public void display()
    {
        System.out.println(heap);
    }

    public void upHeapify(int n)
    {
        int pi=(n-1)/2;

        // min heap
        if(this.heap.get(pi)>this.heap.get(n))
        {
            swap(this.heap,pi,n);
            upHeapify(pi);
        }
    }
    public void  downHeapyfy(int idx)
    {
        int mini=idx;
        int lc=2*idx+1;
        int rc=2*idx+2;

        if(lc<this.heap.size() && this.heap.get(lc)>this.heap.get(idx) )
        {
            mini=lc;
        }
        if(rc<this.heap.size() && this.heap.get(rc)>this.heap.get(idx) )
        {
            mini=rc;
        }
        swap(this.heap,mini,idx);
    }
}
