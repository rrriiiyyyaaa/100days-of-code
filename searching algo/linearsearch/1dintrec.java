/*
Algorithm-
1.function.
2.calling function with index.
/*

import java.util.Scanner;
public class Main
{
		//function
     public static int ls(int arr[],int l,int r,int key){
           //base cond.
           if(r<l)
            return -1;
            //calculation:
           if(arr[l] == r)
            return 1;
            if (arr[r] == key)
            return r;
          //hypohesis
           return ls(arr,l+1,r-1,key);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int key = sc.nextInt();                           //to search-4
	    int arr[] = new int[] {1,2,3,4,5,6};
	    //recursive  function:
	    int index = ls(arr,0,arr.length-1,key);
	    if(index != -1)
	        System.out.println(key+ " is found at "+ index);
	    else
	        System.out.println(key + " is not found.");
	
	    
	}
  
}
