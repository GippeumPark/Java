
public class Toggle {

	public static void main(String[] args) {
		// 1초마다 on 과 off를 교대로 출력 -10번만 수행
		int a=0;
		while(a<10) {
			try {
				//1초씩 대기
				Thread.sleep(1000);
				if(a%2==0) { System.out.println("ON");}
				else {System.out.println("OFF"); }
				a = a + 1;
			}catch(Exception e) {}

		}
		
		
		//1초마다 1~5번째까지는 출근
		//6~7번째는 휴식이라고 번갈아가면서 출력
		
		int i = 1;
		while(true) {
			try {
				Thread.sleep(1000);
				if(i%7==5 || i%7==6) {
					System.out.println("휴식");
				}else {
					System.out.println("출근");
				}
				i=i+1;
			}catch(Exception e) {}
		}
		
		
		
	}

}
