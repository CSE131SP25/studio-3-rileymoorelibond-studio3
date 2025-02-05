package studio3;
import java.util.Scanner;

public class prime{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int n=10000;
	
	boolean[] A = new boolean[n+1];
	for (int i=2; i<=n; i++){
        A[i]=true;
    }
	
	
	for (int i=2; i<=n; i++){		
        for(int j=2*i; j<=n; j+=i) {
		A[j]=false;
    }
	}
	
	
	for (int i=2; i<=n; i++){
		if (A[i]) {
		System.out.print(i+",");
    }
	}
	
}
}