
public class KlasaString {
String neki;
	
	
	public int duzinaStringa() {
		return 0;
	}
	
	public void karakteriNaParnim() {
		
	}
	
	public void karakteriNaNeparnim( String neki) {
		String karakteri = "";
		for (int i = 0; i < neki.length(); i ++) {
			char slovo = neki.charAt(i);
			if (Character.isLetter(slovo) && (i%2 != 0)) {
				karakteri += slovo;
			}
		}
			
		
	}
	
	public int brojUppercase() {
		return 0;
	}
	
	public int brojLowercase() {
		return 0;
	}
	
	public void nisuSlova() {
			
		
	}

}

