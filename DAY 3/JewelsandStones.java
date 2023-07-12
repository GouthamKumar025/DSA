package projects;

//https://leetcode.com/problems/jewels-and-stones/
public class JewelsandStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels, stones));

	}

	public static int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
			if (jewels.indexOf(stones.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}

}
