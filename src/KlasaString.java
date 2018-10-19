
public class KlasaString {
String neki;
	
	
	public int duzinaStringa() {
		return 0;
	}
	
	public void karakteriNaParnim() {
		
	}
	
	public void karakteriNaNeparnim() {
		
	}
	
	public int brojUppercase() {
		return 0;
	}
	
	public int brojLowercase() {
		int brojac=0;
		for(int i=0; i<neki.length(); i++) {
			if(Character.isLowerCase(neki.charAt(i))) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public void nisuSlova() {
		for(int i=0; i<neki.length(); i++) {
			if(Character.isLetter(neki.charAt(i))==false && neki.charAt(i)!=' ') 
				System.out.print(neki.charAt(i));
			
		
	}

}
	
}
