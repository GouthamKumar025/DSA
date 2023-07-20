import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
    
    // Write your code here
    int n=arr.size();
       int positive=0;
       int negative=0;
       int zero=0;
        for(int i=0;i<arr.size();i++){
     
            int value=arr.get(i);
            if(value>0){
                positive++;
            }else if(value<0){
                negative++;
            }else{
                zero++;
            }
        }
        double ration1=(double)positive/n;
        double ratio2=(double)negative/n;
        double ratio3=(double)zero/n;
        System.out.println(String.format("%.6f", ration1));
        System.out.println(String.format("%.6f", ratio2));
        System.out.println(String.format("%.6f", ratio3));

    }

}

public class plusMinus{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

