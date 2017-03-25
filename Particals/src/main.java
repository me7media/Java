

import particals.Part;
import particals.Particals;

public class main {

	private static String i;

	public static void main(String[] args) {

		Part p1 = new Particals("first", 1);
		Part p2 = new Particals("second", 1);

		p1.outPart();

		switch (p2.getPower()){
			case 1 : i = "1";
				break;
			case 2 : i = "2";
				break;
			case 3 : i = "therd";
				break;
		}

		int terr = p1.getPower()+p2.getPower();

		System.out.println(terr);
		System.out.println(i);


	}


}
