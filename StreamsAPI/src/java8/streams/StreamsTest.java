package java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
	public static void main(String[] args) {
		/*
		 * We have a stream of names, and we want to print them to the console. Since
		 * peek() expects a Consumer<T> as its only argument, it seems like a good fit,
		 * so let's give it a try:
		 */
		Stream<String> names = Stream.of("John", "Robert", "Tom");
		names.peek(System.out::println); // it won't print anything, why?
		// peek() is an intermediate operation, not a terminal operation, that's why.
		/*
		 * peek()‘s Javadoc page says: “This method exists mainly to support debugging,
		 * where you want to see the elements as they flow past a certain point in a
		 * pipeline“.
		 * 
		 */
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		/*
		 * above snippet demonstrates, how we observe the elements that passed each
		 * operation.
		 * 
		 * On top of that, peek() can be useful in another scenario: when we want to
		 * alter the inner state of an element. For example, let's say we want to
		 * convert all user's name to lowercase before printing them. Alternatively, we
		 * could have used map(), but peek() is more convenient since we don't want to
		 * replace the element.
		 */
		Stream<User> userStream = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
		userStream.peek(u -> u.setName(u.getName().toLowerCase())).forEach(System.out::println);
	}
}

class User {
	private String name;

	public User(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
