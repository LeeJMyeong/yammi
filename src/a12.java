 
public class a12 {

	public static void main(String[] args) {
//		���ǹ� - 3�׿�����
		int p = 6;
		if(p%2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
			}
		System.out.println(p % 2 == 0 ? "¦��" : "Ȧ��");
		
		switch ( p % 2 ) {
		case 1:
			System.out.println("Ȧ��");
			break;
		case 0:
			System.out.println("¦��");
			
		default:
			System.out.println("default");
			break;
		}
	}
	

}
