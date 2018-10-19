
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
	
	public int brojUppercase() {
		return 0;
	}
	
	public int brojLowercase() {
		return 0;
	}
	
	public void nisuSlova() {
			
		
	}

}

