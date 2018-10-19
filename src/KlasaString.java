
public class KlasaString {
String neki;
	NekiString (){
		
	}
	
	NekiString( String novi ){
		neki=novi;
	}
	
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
	
	public void karakteriNaNeparnim( String neki) {
		String karakteri = "";
		for (int i = 0; i < neki.length(); i ++) {
			char slovo = neki.charAt(i);
			if (Character.isLetter(slovo) && (i%2 != 0)) {
				karakteri += slovo;
			}
		}
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
