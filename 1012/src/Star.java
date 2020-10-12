
public class Star {

	public static void main(String[] args) {
		/*
		 * 1***** 1-5
		 * 2***** 1-5
		 * 3***** 1-5
		 * 4***** 1-5
		 * 5***** 1-5
		 * 별 5개를 출력하고 줄 바꿈 하는 것은 5번 수행
		 * 가로 방향이 안쪽 반복문이 되고
		 * 세로 방향이 바깥쪽 반복문이 됩니다.
		 * *이 하나씩 증가하는 구조
		 * 변하는 숫자의 증감치를 구해서 바깥쪽 반복문의 변수에 곱한 후 더하기 빼기를 이용하여
		 * 결과를 맞추는 작업 수행
		 * 1씩 증가하므로 1*a
	 	*/
		
//		for(int a=1; a<=5; a=a+1) {
//			for(int b=1; b<=a; b=b+1);
//			System.out.printf("*");
//		}
//		   System.out.printf("\n");   
		   
		   
		   
		   
		   
		   
		   
		   /*
		    * 1***** 1-5
		    * 2****  1-4
		    * 3***   1-3
		    * 4**    1-2
		    * 1*     1-1
		    */
	
//		   for(int c=1; c<=5; c=c+1) {
//			   for(int d=1; d<=c-1; d=d+1) {
//				   System.out.printf("*");
//			   }
//			   System.out.printf("\n");
//		   }
		   
		   
		   
		   

		   
		   
		   
		   /*
		    * 1*     1-1
		    * 2**    1-2
		    * 3***   1-3
		    * 4**    1-2
		    * 1*     1-1
		    *3번째 줄 까지는 1개씩 늘어나고
		    *4번째 줄 부터는 하나씩 줄어드는 구조
		    *하나의 패턴이 아닌 경우 동일한 패턴적용 지점까지 분할하여 해결
		    */
		   for(int e=1; e<=5; e=e+1) {
			   if(e<=3) {
				   for(int f=1; f<=e; f=f+1) {
					   System.out.printf("*");
				   }
				   System.out.printf("\n");
				   
			   } //감소하는 부분
			   else {
				   for(int f=1; f<=6-e; f=f+1) {
					   System.out.printf("*");
				   }
				   System.out.printf("\n");
			   }
		   }
		   
		   
		   
		   
		   
		   
	}

}
