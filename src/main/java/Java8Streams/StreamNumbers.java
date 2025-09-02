package Java8Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamNumbers {

	public void maximumNumber(List<Integer> numbers) {
		// Find the maximum number in the list
		int ans = numbers.stream().max(Integer::compare).orElseThrow();
		System.out.println("The maximum number in the list : " + ans);
	}

	public void countEvenNumbers(List<Integer> numbers) {
		// find the count of even numbers in a list
		long ans = numbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println("The count even numbers in the list : " + ans);
	}

	public void findTheDuplicates(List<Integer> numbers) {
		// find the duplicates in a list
		Set<Integer> seen = new HashSet<>();
		List<Integer> duplicates = numbers.stream().filter(n -> !seen.add(n)).toList();
		System.out.println("the Duplicates values : " + duplicates);
	}

	public void GetFirst3Elements(List<Integer> numbers) {
		// get the first 3 elements in a list
		List<Integer> firstThree = numbers.stream().limit(3).toList();
		System.out.println("The first 3 elements : " + firstThree);
	}

	public void SkipFirst2Elements(List<Integer> numbers) {
		// skip first 2 elements
		List<Integer> skiptwo = numbers.stream().skip(2).toList();
		System.out.println("The skipping first 2 numbers in a list : " + skiptwo);
	}

	public void sumOfAllNumbers(List<Integer> numbers) {
		// sum of all numbers
		int num = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("The sum of all numbers : " + num);
	}

	public void checkIfAllNumbersAreEven(List<Integer> numbers) {
		// Check if All numbers are even or not
		boolean AllEven = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println("All numbers are even or not : " + AllEven);
	}

	public void sortListDescendingOrder(List<Integer> numbers) {
		List<Integer> descendingNumbers = numbers.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Sort list in descending Oreder : " + descendingNumbers);
	}

	public void removeDuplicates(List<Integer> numbers) {
		List<Integer> removeDuplicate = numbers.stream().distinct().toList();
		System.out.println("Remove Duplicates from the list : " + removeDuplicate);
	}

	private void findTheAvarageofList(List<Integer> numbers) {
		double avarage = numbers.stream().mapToInt(i -> i).average().orElse(0.0);
		System.out.println("The Avarage of the list : " + avarage);

	}

	private void partitionListIntoEvenOdd(List<Integer> numbers) {
		Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("The partition list into even and odd : " + partitioned);
	}

	private void findTheSeconfHighestNumber(List<Integer> numbers) {
		int num = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow();
		System.out.println("the second highest numbers : " + num);
	}

	private void getTop3HighestNumbers(List<Integer> numbers) {
		List<Integer> top3 = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println("the top3 highest elements : " + top3);
	}
	
	public void reversed() {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		List<Integer> reversedIntegers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse order : "+reversedIntegers);
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 3, 9, 1, 7, 1, 3, 8);
		StreamNumbers sol = new StreamNumbers();
		sol.maximumNumber(numbers);
		sol.countEvenNumbers(numbers);
		sol.findTheDuplicates(numbers);
		sol.GetFirst3Elements(numbers);
		sol.SkipFirst2Elements(numbers);
		sol.sumOfAllNumbers(numbers);
		sol.checkIfAllNumbersAreEven(numbers);
		sol.sortListDescendingOrder(numbers);
		sol.removeDuplicates(numbers);
		sol.findTheAvarageofList(numbers);
		sol.partitionListIntoEvenOdd(numbers);
		sol.findTheSeconfHighestNumber(numbers);
		sol.getTop3HighestNumbers(numbers);
		sol.reversed();
	}

}
