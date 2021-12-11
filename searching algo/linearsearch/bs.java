public class Main{
    public static void main (String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int key =3;
        int  left =0;
        int rightind = arr.length-1;
        int mid =((left+rightind)/2);
        
        while(left <=rightind)
        {
            if (arr[mid]== key)                                 //5
            {
                System.out.println("Element found at index "+mid);           //executed
                break;
            }
            else if(arr[mid] <key)                                 
            {
                left = mid+1;
            }
            else
            {
                rightind = mid+1;
            }
            mid = left + rightind/2;
        }
        if(left>rightind)
        {
            System.out.println("Element not found! ");
        }
    }
}