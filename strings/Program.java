package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String s2 = sc.nextLine();
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();
		/*
		 * Множества символов в каждой строке
		 */
		for (int i = 0; i < s1.length(); i++) {
			set1.add(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			set2.add(s2.charAt(i));
		}
		/*
		 * Обе строки содержат символ
		 */
		System.out.println("Both lines contain:");
		HashSet<Character> Both = new HashSet<Character>();
		for (Character c: set1) {
			if (set2.contains(c)) {
				Both.add(c);
			}
		}
		/*
		 * Вывод в прямом порядке
		 */
		System.out.print("Direct order: ");
		List<Character> list = new ArrayList<>(Both);
		Collections.sort(list);
		for (Character c: list) {
			System.out.print(c+" ");
		}
		System.out.println();
		/*
		 * Вывод в обратном порядке
		 */
		System.out.print("Reverse order: ");
		List<Character> listReverse = new ArrayList<>(Both);
		Collections.sort(listReverse, Collections.reverseOrder());
		for (Character c: listReverse) {
			System.out.print(c+" ");
		}
		System.out.println();
		/*
		 * Вывод в порядке hashCode
		 */
		System.out.print("Rotated hash code order: ");
		List<Character> listHash = new ArrayList<>(Both);
		Collections.sort(listHash, new CharacterComp(n));
		for (Character c: listHash) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println();
		/*
		 * Только первая строка содержит символы
		 */
		System.out.println("Only first line contains:");
		HashSet<Character> FirstOnly = new HashSet<Character>();
		for (Character c: set1) {
			if (!set2.contains(c)) {
				FirstOnly.add(c);
			}
		}
		/*
		 * Вывод в прямом порядке
		 */
		System.out.print("Direct order: ");
		list = new ArrayList<>(FirstOnly);
		Collections.sort(list);
		for (Character c: list) {
			System.out.print(c+" ");
		}
		System.out.println();
		/*
		 * Вывод в обратном порядке
		 */
		System.out.print("Reverse order: ");
		listReverse = new ArrayList<>(FirstOnly);
		Collections.sort(listReverse, Collections.reverseOrder());
		for (Character c: listReverse) {
			System.out.print(c+" ");
		}
		System.out.println();
		/*
		 * Вывод в порядке hashCode
		 */
		System.out.print("Rotated hash code order: ");
		listHash = new ArrayList<>(FirstOnly);
		Collections.sort(listHash, new CharacterComp(n));
		for (Character c: listHash) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println();
		/*
		 * Хотя бы одна из строк содержит символ
		 */
		System.out.println("One of the line contains:");
		HashSet<Character> Any = new HashSet<Character>();
		for (Character c: set1) {
			Any.add(c);
		}
		for (Character c: set2) {
			Any.add(c);
		}
		/*
		 * Вывод в прямом порядке
		 */
		System.out.print("Direct order: ");
		list = new ArrayList<>(Any);
		Collections.sort(list);
		for (Character c: list) {
			System.out.print(c+" ");
		}
		System.out.println();
		/*
		 * Вывод в обратном порядке
		 */
		System.out.print("Reverse order: ");
		listReverse = new ArrayList<>(Any);
		Collections.sort(listReverse, Collections.reverseOrder());
		for (Character c: listReverse) {
			System.out.print(c+" ");
		}
		System.out.println();
		/*
		 * Вывод в порядке hashCode
		 */
		System.out.print("Rotated hash code order: ");
		listHash = new ArrayList<>(Any);
		Collections.sort(listHash, new CharacterComp(n));
		for (Character c: listHash) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println();
		sc.close();
	}
}

class CharacterComp implements Comparator<Character> {
	int n;
	public CharacterComp(int n) {
		this.n = n;
	}
    @Override
    public int compare(Character c1, Character c2) {
        return Integer.rotateLeft(c1.hashCode(), n) - (Integer.rotateLeft(c2.hashCode(), n));
    }
}
