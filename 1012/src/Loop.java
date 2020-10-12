
public class Loop {

	public static void main(String[] args) {

//		//Hello Java를 5번 출력
//		int i=1;
//		while(i<=5) {
//			System.out.println("Hello Java");
//			i=i+1;
//		}
//
//		
//		//image1, image3, image5 출력할 수 있도록 반복문 작성
//		//3번 출력
//		//공통된 부분 image.png
//		//패턴을 갖는 부분은 1, 3, 5
//		int e = 1;
//		while(e<6);{
//			System.out.println("image"+ (e=e+2)+ ".png");
//			e=e+1;
//		}
		
		
		
		//횟수를 찾기
		//횟수 찾아 반복문 만들고 그 안에 해결할 문장 삽입
		//1부터 100까지 홀수의 합을 do~while로 해결 -2500
		//1씩 증가 시
		int a = 1;
		int sum = 0;
		do {
			sum = sum +(2*a-1);
			a=a+1;
		}while(a<51);
		System.out.println("sum = " + sum);
	
		//2씩 증가 시
		//50번을 수행하는 것은 0~49까지 진행해도 되고 1~50까지 진행해도 되고
		//1~101보다 작을 떄 까지 2씩 증가하면 진행해도 됩니다
		//횟수는 자신이 편한 패턴 사용해도 됨
		int s =1;
		int sum1 =0;
		do {
			sum1 = sum1 + s;
			s=s+2;
		}while(s<101);
		System.out.println("sum1 ="+sum1);
		
		
		//Hello Java를 5번 출력하는 것을 for로 작성
		int sum2 = 0;
		for(int p=0; p<5; p=p+1) {
			sum2 = sum2 + p;
			System.out.println("sum2 =" + p );
		}
			
			
		//1~100까지 더한 합을 for를 이용해서 작성
			//합계를 저장할 변수
			int sum3 = 0;
		for(int y=1; y<=100; y=y+1) {
			sum3 = sum3 + y;
			System.out.println("sum3 =" + sum3);
			System.out.println("sum3:%d\n =" + sum3);
		}

	
	}
		
		}




