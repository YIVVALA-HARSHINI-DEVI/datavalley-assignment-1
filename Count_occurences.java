import java.io.*;
import java.util.*;

public class Count_occurences
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int m = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++){
		    if(arr[i] == m){
		        cnt += 1;
		    }
		}
		System.out.println(cnt);
		
	}
}
