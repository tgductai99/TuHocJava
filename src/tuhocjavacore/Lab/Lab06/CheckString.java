package tuhocjavacore.Lab.Lab06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
	public static void main(String[] args) {
		System.out.println("run check String");

		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher matcher = pattern.matcher("+as@gmail.com");
		System.out.println("Input String matches regex - " + matcher.matches());

	}
}
