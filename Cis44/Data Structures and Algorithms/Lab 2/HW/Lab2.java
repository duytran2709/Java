package Lab2;
class Lab2 {
	public static void main(String[] arg) {
	
		//Test for problem 1
		int a[] = {2, 3, 5, 7, 11, 13, 17, 19, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 23, 29, 31, 37, 41, 43};
		System.out.println ("#1. Min = " + Lab2.min (a, 0, 24));
				
		//Test for problem 2
		System.out.println ("#2. Total cents: " + Lab2.computePay(39));
		System.out.println ("#2. Total saving: " + Lab2.computeSavings(39));
				
		//Test for problem 3
		String s1 = new String ("Java is a programming language originally developed by James Gosling at Sun Microsystems  and released in 1995 as a core component of Sun Microsystems Java platform. The language derives much of its syntax from C and C++ but has a simpler object model and fewer low-level facilities. Java applications are typically compiled to bytecode (class file) that can run on any Java Virtual Machine (JVM) regardless of computer architecture. Java is a general-purpose, concurrent, class-based, object-oriented language that is specifically designed to have as few implementation dependencies as possible. Java is currently one of the most popular programming languages in use, particularly for client-server web applications, with a reported 10 million users.");
		String s2 = new String ("Java");
		System.out.println ("#3. Total substring: " + Lab2.countSubstring (s1, s2));
	}
	
	// Problem 1
	public static int min(int [] a, int begin, int end) {
		if (a[begin] == a[end])
			return a[begin];
		
		int mid = (begin + end)/2;
		int min1 = min(a, begin, mid);
		int min2 = min(a, mid+1, end);
		
		if (min1 < min2)
			return min1;
		else return min2;
	}
	
	// Problem 2
	public static long computePay(int day) {
		if (day <= 1) return 1;
		return 2 * computePay(day-1);
	}
	
	public static long computeSavings(int day) {
		if (day < 1) return 0;
		return computePay(day) + computeSavings(day-1);
	}
	
	// Problem 3
	public static int countSubstring(String s1, String s2) {
		int index = s1.indexOf(s2);
		if (index < 0) return 0;
		return 1 + countSubstring(s1.substring(index + s2.length()), s2);
	}
}