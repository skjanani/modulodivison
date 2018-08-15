package janani;
import java.util.Scanner;
public class ModuloDivison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		    char b=sc.next().charAt(0);
		    int c=sc.nextInt();
		    int e=0;
		    char f[]={'/','%'};
		   if(b==f[1]){
			   e=a%c;
		   }
		   if(b==f[0]){
		   	e=a/c;
		   }
			System.out.println(e);
	}

}
