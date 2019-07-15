import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.*;

public class main {

	public static void main(String[] args) {
		// list.
		// stream.
		Stream<String> tokenStream = Stream.of("s","w","a","t","h","i");
		System.out.println(tokenStream);
		  // stream to list 
		List<String> tokenlist = tokenStream.collect(Collectors.toList());
		System.out.println(tokenlist);
		
		// 
		Stream<Integer> tokenStream2 = Stream.of(101,202,303,404);
		List<Integer> tokenlist1 = tokenStream2.filter(x-> x !=3).collect(Collectors.toList());
		tokenlist1.forEach(x -> System.out.println(x));
		
		
		// Linked List.
		// stream.
		Stream<String> tokenStream1 = Arrays.asList("p","r","i","y","a","n","k","a").stream();
		System.out.println(tokenStream1);
		// stream to linkedlist.....Collectors.toCollection()
        List<String> tokenLinkedlist = tokenStream1.collect(Collectors.toCollection(LinkedList::new)); 
		System.out.println(tokenLinkedlist);		
		
	}

}
