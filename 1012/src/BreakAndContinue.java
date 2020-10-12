
public class BreakAndContinue {

	public static void main(String[] args) {
		//break는 반복문을 중단하는 역할
		//단독수행일 때는 필요 없음
		for(int a=1; a<=10; a=a+1) {
			System.out.println("Hello Java :" + a);
			//a의 값이 3의 배수가 되면 중단
			if(a%3==0) {
				break;
			}
				System.out.println("Hello Java :" + a);
		}
		
		//break는 반복문을 중단하는 역할
		//단독수행일 때는 필요 없음
		for(int i=1; i<=15; i=i+1) {
			System.out.println("Hello Java :" + i);
		}
		
		
		//continue 는 반복문 안에서 아래 문장은 수행하지 않고 다음 반복으로 진행
		for(int e=1; e<=10; e=e+1) {
			//e의 값이 3의 배수가 되면 다음 반복으로 넘어감
			if(e%3==0) {
				continue;
			}		System.out.println("Hello Java" + e);
		}

		//for(int t = 1; t<=10; t=t+1) {
		//시작    ->  반복조건:false이면 중단 -> 2번째부터 실행되는곳
		//	if(t%3==0){
		//break는 조건이 성립되면 종료
		//continue는 조건이 성립되면 건너띄고 넘어감
		//	}
		//}

		//무한반복
		//while(true){
		//	if(i %2 =0) { } 짝수
		//		else{ } 홀수 번갈아가면서 실행
		//}	
		
		
		
		
	}
}
