
public class study5 {
 // Á¶°Ç¹®
	

	public static void main(String[] args) {
//		¹ú·¹°¡ Á×¾ú³ª¿ä
//		¿¹ true °ÅÁþ false
		boolean isDead = false;
		if(isDead) {
//			System.out.println("¹ö¸°´Ù");
		}else {
//			System.out.println("Á×ÀÎ´Ù");
		}
		
		int i = 7;
		if( i > 7 ) {
//			System.out.println("if");

	}	
		
			else if( i == 7 ) {
//			System.out.println("elseif");
		}
		else {
	
//			System.out.println("else");
	}
		String hi = "hi";
		if(hi + 1 == "hi1") {
//			System.out.println(true);
		}
		else {
//			System.out.println(false);
		}
		int a = 0;
		if(a == 0) {
//			°°Áö ¾Ê¾ÒÀ»¶§ !=
//			System.out.println("true");
		}
		else {
//			System.out.println("false");
		
	
//		Á¶°Ç¹® - 3Ç×¿¬»êÀÚ
	
	int p = 6;
	if(p%2 == 0) {
		System.out.println("Â¦¼ö");
	}else {
		System.out.println("È¦¼ö");
		}
	System.out.println(p % 2 == 0 ? "Â¦¼ö" : "È¦¼ö");
	
	switch (p % 2) {
	case 1:
		System.out.println("È¦¼ö");
		break;
	case 0:
		System.out.println("Â¦¼ö");
		break;
	default:
		System.out.println("default");
		break;
	
		}}

	}
}

