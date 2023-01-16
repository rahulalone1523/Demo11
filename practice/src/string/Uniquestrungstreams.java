package string;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Uniquestrungstreams {
	public static void main(String[] args) {
		String str="ababcabcd";
//		str.chars().st.distinct().forEach(a->System.out.println(a));
//		Stream<String> distinct = Stream.of(str).distinct();
//		distinct.forEach(a->System.out.println(a));
		
		List<Character> disinctChars 
	     = str.replaceAll(",","").chars()                       // get chars as ints
	            .distinct()                     // remove duplicates
	            .sorted()                       // sort
	            .mapToObj(c -> (char) c)        // convert int to Character
	            .collect(Collectors.toList()); 
		disinctChars.forEach(a->System.out.print(a));
		
		
//		
//		String string = "aabbeeddffcc";
//		Set<Character> chars = new TreeSet<>();
//		for( char c : string.toCharArray() ) {
//		  chars.add(c);
//		}
//
//		System.out.println( chars );
//		
	
	List<Character>list= str.chars().distinct().sorted().mapToObj(c->(char)c).collect(Collectors.toList());
	List<String> collect = Arrays.stream(str.split("")).distinct().sorted().collect(Collectors.toList());
	System.out.println(collect);
	
	}

}
