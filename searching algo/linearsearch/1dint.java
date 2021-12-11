public class Main
{
    int bs(int arr[],int first,int last,int key)
    {
        
        if(last >= first)
        {
                
                public static void int mid = first + (last-first)/2;                                       //mid=3  -> (0+(6-0)/2)
                //if element is present at mid index, return mid.                            //mid =3 -> result=3 as mid =key
                if(arr[mid] == key)
                return mid;
                //if element is smaller than mid,it must be present at first side.
                if(arr[mid]>x)
                    return arr,first,mid-1,x;
                //else element can only be present at right side.
                return arr,mid+1,last,x;
        }
        return -1;
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int key =3;
		int last = arr.length;
		
		bs 0bj= new bs(arr,0,last-1-1,x);
		if(result=-1)
		    System.out.println("element is not present.");
		 else
		    System.out.println("element is present  at index "+ result);
	
	}
}
