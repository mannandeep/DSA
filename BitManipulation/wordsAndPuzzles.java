package bit_manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class wordsAndPuzzles {
	public static ArrayList<Integer> function(String[] puzzles , String[] words){
		HashMap<Character , ArrayList<Integer>> map = new HashMap<>();
		for(int i=0;i<26;i++) {
			map.put((char) ('a'+i), new ArrayList<>());
		}
		for(String word :words) {
			int mask=0;
			for(char ch : word.toCharArray()) {
				int bit = ch-'a';
				mask= mask | (1<<bit);
			}
			HashSet<Character> set = new HashSet<>();
			for(char ch : word.toCharArray()) {
				if(set.contains(ch)) {
					continue;
				}
				set.add(ch);
				map.get(ch).add(mask);
				
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(String puzzle : puzzles) {
			int puzzle_mask=0;
			for(char ch : puzzle.toCharArray()) {
				int bit = ch-'a';
				puzzle_mask= puzzle_mask | (1<<bit);
			}
			char first_char = puzzle.charAt(0);
			ArrayList<Integer> words_to_check = map.get(first_char);
			int count =0;
			for(int word_mask : words_to_check) {
				if((puzzle_mask & word_mask )== word_mask) {
					count++;
				}
			}
			ans.add(count);
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int np=sc.nextInt();
		int nw = sc.nextInt();
		String[] puzzle = new String[np];
		String[] words = new String[nw];
		for(int i=0;i<np;i++) {
			puzzle[i] = sc.next();
			
		}
		for(int i=0;i<nw;i++) {
			words[i] = sc.next();
		}
		ArrayList<Integer> list = function(puzzle, words);
		System.out.println(list);
	}

}
