package collectionss;
import java.util.*;
public class RepNum {

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		LinkedList<Integer> lst1=new LinkedList<Integer>();
		LinkedList<Integer> lst2=new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		boolean b=true;
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			if(!lst1.contains(a[i])){
				lst1.add(a[i]);
			}
			else if(!lst2.contains(a[i])){
				lst2.add(a[i]);
				if(b){
					b=false;
					System.out.print(a[i]);
				}
				else{
					System.out.print(" "+a[i]);
				}
			}
		}
	}
}
