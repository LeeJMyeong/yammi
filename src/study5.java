
public class study5 {
 // ���ǹ�
	

	public static void main(String[] args) {
//		������ �׾�����
//		�� true ���� false
		boolean isDead = false;
		if(isDead) {
//			System.out.println("������");
		}else {
//			System.out.println("���δ�");
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
//			���� �ʾ����� !=
//			System.out.println("true");
		}
		else {
//			System.out.println("false");
		
	
//		���ǹ� - 3�׿�����
	
	int p = 6;
	if(p%2 == 0) {
		System.out.println("¦��");
	}else {
		System.out.println("Ȧ��");
		}
	System.out.println(p % 2 == 0 ? "¦��" : "Ȧ��");
	
	switch (p % 2) {
	case 1:
		System.out.println("Ȧ��");
		break;
	case 0:
		System.out.println("¦��");
		break;
	default:
		System.out.println("default");
		break;
	
		}}

	}
}

