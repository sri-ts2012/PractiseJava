package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexpressiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern=Pattern.compile("[ayz]?");
		Matcher matcher=pattern.matcher("ayz");
		System.out.println("String matches the given regex?"+matcher.matches());
System.out.println(Pattern.matches("[ayz]?", "ayz"));//clasname.matches
	}

}
