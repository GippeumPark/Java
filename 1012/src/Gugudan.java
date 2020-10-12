
public class Gugudan {

	public static void main(String[] args) {
		// 2단 만들기
		for(int i =1; i<=9; i=i+1) {
			System.out.printf("2 * %d = %3d\n", i, 2*i);
		}
		// 반복문의 중첩을 이용한 구구단 만들기
		for(int a=2; a<=9; a++) {
			for(int t = 1; t<=9; t = t + 1) {
			
			System.out.printf("%d * %d = %3d",a,t,a*t);
			}
			System.out.printf("\n");
		}	
			

		
		
		
		// * 5번 출력
		for(int j =1; j<=5; j=j+1) {
			System.out.printf("*");
		}
		System.out.printf("\n");
		
		
		
		
		

		
		// * 5개 5줄-> 개수 변경
		// 안쪽 for이 가로, 바깥 for이 세로 (가로 +변경 시 변경조건을 2*u로 바꿔서 계산하면 됨)
		// 가로 -변경 시 변경조건 u만큼 -로 계산하면 됨(-1*u+6 : 6-u)
		for(int u=1; u<=5; u=u+1) {
			for(int d=1; d<=6-u; d=d+1) {
				System.out.printf("*");
				
			}
			System.out.printf("\n");
		}


		
		//*
		//**
		//***
		//**
		//*
		for(int p=1; p<=5; p=p+1) {
			if(p<=3) {
				for(int o=1; o<=p; o=o+1) {
				}
				System.out.printf("*");
			}
			else {
				for(int k=1; k<=3-p; k=k+1) {
				}
				System.out.printf("\n");
			}
		}
	
	
	
		
		
		//공백 System.out.printf(""); 10/16까지 풀어보기
		//----*
		//---*-*
		//--*---*
		//-*-----*
		//*********
	
		
		
		//***
		// **
		//  *
		// **
		//***
		for(int b=1; b<=5; b=b+1) {
			if(b<=3) {
			for(int v=1; v<=b-1; v=v+1) {
				
			}
			System.out.printf("%5d" + "*");
			}
			else {
				for(int c =1; c<=b; c=c+1) {
					
				}
				System.out.printf("\n");
				
			}
			
		}
		
	
	}

}
