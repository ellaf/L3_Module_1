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
	
	public static List<Double> sortScores(List<Double> sorted) {

		
		for (int i = 0; i < sorted.size(); i++) {

			for (int j = 0; j < sorted.size()-1; j++) {
				
				double one = sorted.get(j);
				double two = sorted.get(j + 1);
				
				if(two < one) {
					sorted.set(j, two);
					sorted.set((j+1), one);
				}else if(one < two) {
		
			}				
			}	
		}
	return sorted;
	}
	
	public static List<String> sortDNA(List<String> sorting){
		
		for (int i = 0; i < sorting.size(); i++) {
			
			for (int j = 0; j < sorting.size() - 1; j++) {
				
				String first = sorting.get(j);
				String second = sorting.get(j + 1);
				if(first.length() > second.length()) {
					sorting.set(j, second);
					sorting.set(j + 1, first);
				}else if(first.length() < second.length()) {
					
				}
				
			}
			
		}
		return sorting;
	}
	
	public static List<String> sortWords(List<String> sort){
		
		for (int i = 0; i < sort.size(); i++) {
			
			for (int j = 0; j < sort.size()-1; j++) {
				
				String firstnumber = sort.get(j);
				String secondnumber = sort.get(j+1);
			
			if(firstnumber.compareTo(secondnumber) > 0) {
				sort.set(j, secondnumber);
				sort.set(j+1, firstnumber);
			}else if(firstnumber.compareTo(secondnumber) < 0) {
				
			}
				
			}
			
		}
		return sort;
	}
	// Add other methods here
}