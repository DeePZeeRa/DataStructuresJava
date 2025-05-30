public class J18_operationsString
{public static void main(String[] args) {
	String str = "  Hello, World!  ";
	
	// Length and Character Access
	System.out.println("Length: " + str.length()); // Output: 16
	System.out.println("Character at index 3: " + str.charAt(3)); // Output: H
	
	// Comparison
	System.out.println("Equals 'hello, world!': " + str.equals("hello, world!")); // Output: false
	System.out.println("Equals ignore case: " + str.equalsIgnoreCase("  hello, world!  ")); // Output: true
	
	// Modification
	System.out.println("Concatenated: " + str.concat(" Java")); // Output:   Hello, World!  Java
	System.out.println("Replace 'o' with '0': " + str.replace('o', '0')); // Output:   Hell0, W0rld!
	System.out.println("Substring (3, 8): " + str.substring(3, 8)); // Output: Hello
	
	// Searching
	System.out.println("Index of 'World': " + str.indexOf("World")); // Output: 8
	System.out.println("Contains 'Hello': " + str.contains("Hello")); // Output: true
	
	// Splitting
	String[] parts = str.split(",");
	System.out.println("Split by ',': " + String.join(" | ", parts)); // Output:   Hello |  World!
	
	// Case Conversion
	System.out.println("Uppercase: " + str.toUpperCase()); // Output:   HELLO, WORLD!
	
	// Trimming
	System.out.println("Trimmed: " + str.trim()); // Output: Hello, World!
	
	// Formatting
	System.out.println("Formatted: " + String.format("Message: %s", str.trim())); // Output: Message: Hello, World!
}
}
