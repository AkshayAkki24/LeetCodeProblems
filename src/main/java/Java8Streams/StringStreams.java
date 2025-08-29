package Java8Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
public class StringStreams {
	
	private void upperCase(List<String> names) {
		//uppercase
		List<String> upperCase = names.stream().map(String::toUpperCase).toList();
		System.out.println("Uppercase : "+upperCase);
	}

	private void startWithA(List<String> names) {
		//start with A
		List<String> startWithA = names.stream().filter(n -> n.startsWith("A")).toList();
		System.out.println("start with A : "+startWithA);
	}

	private void listLength(List<String> names) {
		//lenth of String
		Map<Integer,List<String>> length = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("length of the list : "+length);
	}

	private void StringsWithComma(List<String> names) {
		//join with comma
		String joined = names.stream().collect(Collectors.joining(", "));
		System.out.println("join all string with comma : "+joined);
	}

	private void flatMapListOfList() {
		//list of list flatmap
		List<List<String>> lists = List.of(List.of("a","b"),List.of("c","d"));
		List<String> flat = lists.stream().flatMap(List::stream).toList();
		System.out.println("flatMap list of lists : "+flat);
	}

	private void frequencyOfEachCharacter(List<String> names) {
		//frequency of string
		String input = names.get(0);
		Map<Character,Long> freq = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
		System.out.println("Frequency of each character : "+freq);
		
	}

	public static void main(String[] args) {
		
		List<String> names = List.of("Akshay","Rakesh","Abhishek","Royal Enfield","john");
		StringStreams sol = new StringStreams();
		sol.upperCase(names);
		sol.startWithA(names);
		sol.listLength(names);
		sol.StringsWithComma(names);
		sol.flatMapListOfList();
		sol.frequencyOfEachCharacter(names);
	}

	

}
