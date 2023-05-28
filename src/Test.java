	
public final class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		글 문자열
//		String
		// 기본 데이터 타입 , 참조 데이터 타입
		String str = "hello";
		String world = "world";
		System.out.println(str +" " +world);
		char  a = 'a';
		Character b = 'b';
		// 1 글자 사용할때 연산 처리는 빠름 많이 사용하지는 않음
		System.out.println(a+b);
		
//		boolean
		boolean p = true;
		boolean z = false;
		// 참과 거짓만 있다
		Boolean x = true;
		
//			String name = "현수정";
//			String name1 = "이태열";
//			String name2 = "";
//			위처럼 나열하면 너무 길어짐 그래서 배열이란게 있음
//			배열 array
			String[] names = {"현수정","이태열",""};
			System.out.println(names[0]);
			String[] names2 = {};
			String[] names3 = new String[2];
//			배열의 길이는 항상 정해져있다. 길이를 늘릴 순 없다. 그만큼 메모리를 적게 사용함
		
//			1,2,3,4,5 의 배열을 만들기
			int[] ints = {};
			int[] arr = {1,2,3,4,5};
			int[] arr2 = new int[2];
			Integer[] arr3 = new Integer[2];
//			System.out.println( arr3[1] + " " + arr2[1] );
			
//			길이가 궁금할땐 .length를 이용
			System.out.println(arr3.length); 
			
			
	}
	{
		for (int i=1; i<5; i++ ) ;
			for (int i=1; i<5; i++ ) {
					System.out.println("*");
						
				}
			System.out.println("");
			}
			
			
			
	}


