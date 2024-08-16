package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeWithObstacle {
    public static void main(String[] args) {
          boolean [][] arr={{true,true,true},
                            { true,true,true},
                  {true,true,true}};
        int[][] path={{0,0,0},{0,0,0},{0,0,0}};
        fun2(arr,0,0,path,1);
    }

    static ArrayList<String> fun(boolean[][] arr,int r,int c,String out)
    {
        if(r==arr.length-1 && c==arr[0].length-1)
        {

            ArrayList<String> list=new ArrayList<>();
            list.add(out);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(arr[r][c]) {
            if (r < arr.length - 1) {
                list.addAll(fun(arr, r + 1, c, out + "D"));
            }
            if (c < arr[0].length - 1) {
                list.addAll(fun(arr, r, c + 1, out + "R"));
            }
            if (r < arr.length - 1 && c < arr[0].length - 1) {
                list.addAll(fun(arr, r + 1, c + 1, out + "*"));
            }
        }
        return list;
    }

    static ArrayList<String> fun1(boolean[][] arr,int r,int c,String out) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(out);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (arr[r][c]) {
            arr[r][c]=false;
            if (r < arr.length - 1) {
                list.addAll(fun1(arr, r + 1, c, out + "D"));
            }
            if (c < arr[0].length - 1) {
                list.addAll(fun1(arr, r, c + 1, out + "R"));
            }
//            if (r < arr.length - 1 && c < arr[0].length - 1) {
//                list.addAll(fun(arr, r + 1, c + 1, out + "*"));
//            }
            if (r > 0) {
                list.addAll(fun1(arr, r - 1, c, out + "U"));
            }
            if (c > 0) {
                list.addAll(fun1(arr, r, c - 1, out + "L"));
            }
            arr[r][c]=true;
        }

        return list;
    }

    static void fun2(boolean[][] arr,int r,int c,int[][] path,int count) {
        if (r == arr.length - 1 && c == arr[0].length - 1)
        {
            path[r][c]=count;

            for(int[] arr1:path)
            {
                System.out.println(Arrays.toString(arr1));
            }
            System.out.println();
            return;
        }

        if(!arr[r][c]) return;
        arr[r][c]=false;
        path[r][c]=count;
        if (r < arr.length - 1) {
                fun2(arr, r + 1, c, path,count+1);
            }
        if (c < arr[0].length - 1) {
                fun2(arr, r , c+1, path,count+1);

        }
//            if (r < arr.length - 1 && c < arr[0].length - 1) {
//                list.addAll(fun(arr, r + 1, c + 1, out + "*"));
//            }
        if (r > 0) {
                fun2(arr, r - 1, c, path,count+1);
            }
        if (c > 0) {
            fun2(arr, r , c-1, path,count+1);
        }
        arr[r][c]=true;

        path[r][c]=0;





    }


}
