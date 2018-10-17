
public class KlasaString {
String neki;
	
	
	public int duzinaStringa() {
		return 0;
	}
	
	public void karakteriNaParnim() {
		
		
	}
	
	public void karakteriNaNeparnim() {
		
	}
	
	public int brojUppercase(String neki) {
		int brojUpperCase = 0;

		for (int i = 0; i < neki.length(); i++) {
			char slovo = neki.charAt(i);
			if (Character.isUpperCase(slovo))
				brojUpperCase++;
			}
		return brojUpperCase;
	}
	
	public int brojLowercase() {
		return 0;
	}
	
	public void nisuSlova() {
			
		
	}

}

