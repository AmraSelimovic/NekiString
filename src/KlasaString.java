
public class KlasaString {
String neki;
	
	
	public int duzinaStringa() {
		int duzina=neki.length();
		return duzina;
	}
	
	public void karakteriNaParnim() {
		
		
		for(int i=0;i<neki.length();i++) {
			if(i%2==0 && neki.charAt(i)!=' ') {
				System.out.println(neki.charAt(i));
				}
    }
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

