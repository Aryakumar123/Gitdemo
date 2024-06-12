import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreamTest1 {
	// Count the number of names starting with alphabet A
	// @Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("arya");
		names.add("anshuman");
		names.add("tushar");
		names.add("aryaman");
		names.add("lopopoo");
		names.add("fukran");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("a")) {
				count++;
			}
		}
		System.out.println(count);

	}

	// @Test
	public void streamfilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("arya");
		names.add("anshuman");
		names.add("tushar");
		names.add("aryaman");
		names.add("lopopoo");
		names.add("fukran");

		long d = names.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(d);

		long c = Stream.of("arya", "anshuman", "tushar", "aryaman", "lopopoo", "fukran").filter(o -> {
			o.startsWith("a");
			return true;
		}).count();
		System.out.println(c);
		// print all the names of array list
		// names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 3).limit(1).forEach(s -> System.out.println(s));
	}

	@Test
	public void streammap() {
		// print names which have last letter n as uppercase
		Stream.of("arya", "anshuman", "tushar", "aryaman", "lopopoo", "fukran").filter(s -> s.endsWith("n"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// print names which haves first letter a in uppercase and sort it
		List<String> names = Arrays.asList("arya", "anshuman", "tushar", "aryaman", "lopopoo", "fukran");
		names.stream().filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// for checking if that name is present in that list string
		/*boolean flag = names.stream().anyMatch(s -> s.equalsIgnoreCase("arya"));
		System.out.println(flag);
		Assert.assertTrue(flag);*/
		
		//Merging 2 different lists
		List<String> names2 = Arrays.asList("man","woman","god");
		Stream<String> newstream = Stream.concat(names.stream(), names2.stream());
		newstream.sorted().forEach(s->System.out.println(s));
		
	}
}
