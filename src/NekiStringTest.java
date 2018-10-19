import java.util.Scanner;
public class NekiStringTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in);

		System.out.println("Unesite neki string: ");
		String str = input.nextLine();
		NekiString string = new NekiString(str);
		
		System.out.println("Duzina unesenog stringa je: " + string.duzinaStringa());
		
		System.out.println("Karakteri na parnim pozicijama su: ");
		string.karakteriNaParnim();
		System.out.println();
		
		System.out.println("Karakteri na neparnim pozicijama su: ");
		string.karakteriNaNeparnim();
		System.out.println();
		
		System.out.println("Broj velikih slova u stringu je: " + string.brojUppercase());
		
		System.out.println("Broj malih slova u stringu je: " + string.brojLowercase());
		
		System.out.println("Karakteri koji nisu slova su: ");
		string.nisuSlova();
		
input.close();
	}

}
