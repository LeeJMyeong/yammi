 
public class a12 {

	public static void main(String[] args) {
//		Á¶°Ç¹® - 3Ç×¿¬»êÀÚ
		int p = 6;
		if(p%2 == 0) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
			}
		System.out.println(p % 2 == 0 ? "Â¦¼ö" : "È¦¼ö");
		
		switch ( p % 2 ) {
		case 1:
			System.out.println("È¦¼ö");
			break;
		case 0:
			System.out.println("Â¦¼ö");
			
		default:
			System.out.println("default");
			break;
		}
	}
	

}
