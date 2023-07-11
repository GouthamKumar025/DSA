/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
