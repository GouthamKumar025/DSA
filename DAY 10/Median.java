package prat;
import java.util.*;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>med=new ArrayList<>();
        med.add(7);
        med.add(2);
        med.add(9);
        med.add(1);
        med.add(8);
        med.add(5);
        med.add(3);
        System.out.println(findMedian(med));
	}
	static int findMedian(List<Integer>med) {
		ArrayList<Integer>meds=new ArrayList<>(med);
		Collections.sort(meds);
		int n=meds.size();
		int mid=n/2;
	    return meds.get(mid);
		
	}
	
}
