package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificaForWhile {

	public static void main(String[] args) {

		// FOR util se conhece o tamanho do array
		
		for (int consegui = 0; consegui  < 5; consegui ++) {
			System.out.println(consegui);
		}

		// Use um forloop para imprimir "consegui" 5 vezes e o numero da tentativa

		String example = "2021.10.10";
		Pattern pattern = Pattern.compile("(\\d{4})[.](\\\\d{2})[.](\\\\d{2})");
		Matcher matcher = pattern.matcher(example);
		// verifies full match

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

		// while pegando so os numeros
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("hello1234goodboy789very2345");
		while (m.find()) {
			System.out.println(m.group());
		}

		String text = "John speak and John writes about that,\" + \" and John think 2021.10.10 about everything.";

		String nominho = "(John)";

		Pattern patternNominho = pattern.compile(nominho);

		Matcher matcherNominho = patternNominho.matcher(text);

		//StringBuffer stringBuffer = new StringBuffer();

		while (matcherNominho.find()) {
			System.out.println("found: " + matcherNominho.group());
		}
	}
}
