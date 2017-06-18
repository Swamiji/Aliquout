import java.util.Scanner;


public class AliquotSum {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int n,sum=0,i,r;
	System.out.println("Enter the number");
	n=sc.nextInt();
	for(i=1;i<n;i++){
		r=n%i;
		if(r==0){
			sum+=i;
		}
	}
	if(sum==n){
		System.out.println("This Is A Perfect Number");
	}else{
		System.out.println("Its Not Perfect Number");
	}
}
	}

