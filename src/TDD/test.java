package TDD;

public class test {
	public String generate(int i) {
		if (i% 3 == 0){
			return "Fizz";
		}
		if (i == 5){
			return "Buzz";
		}
		return String.valueOf(i);
	}
}
