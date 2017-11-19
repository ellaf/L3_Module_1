package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {

			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
		
	}

	public static int countPearls(List<Boolean> oysters) {
		int totalPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				totalPearls += 1;
			}
		}
		return totalPearls;

	}

	public static double findTallest(List<Double> peeps) {
		double biggest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) >= biggest) {
				biggest = peeps.get(i);
			}
		}
		return biggest;
	}

	public static String findLongestWord(List<String> words) {
		int longest = 0;
		String longestString = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest) {
				longest = words.get(i).length();
				longestString = words.get(i);	
				System.out.println(longestString);
			}
		}
		return longestString;
	
	}
	
	
	public static boolean containsSOS(List<String> f) {
	System.out.println(f);
		if(f.contains(" ... --- ... ")){
				return true;
		}
		return false;
		
	}
	// Add other methods here
}