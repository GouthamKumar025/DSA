/** Goutham Kumar S -- 202108017 **/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<ArrayList<Integer>>Lines=new ArrayList<>();
        for(int i=0;i<n;i++){
            int nums=in.nextInt();
            ArrayList<Integer>Line=new ArrayList<>();
            for(int j=0;j<nums;j++){
                Line.add(in.nextInt());
            }
            Lines.add(Line);
        }
        // program for queries
        int query_nums=in.nextInt();
        for(int i=0;i<query_nums;i++){
            int line_index=in.nextInt();
            int position=in.nextInt();
            if(line_index>=1 && line_index<=Lines.size()){
                ArrayList<Integer>Line=Lines.get(line_index-1);
                if(position>=1 && position<=Line.size()){
                    System.out.println(Line.get(position-1));
                }else{
                    System.out.println("ERROR!");
                }
            }else{
                System.out.println("ERROR!");
                
            }
        }
        
    }
}
