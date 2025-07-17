
public class Maxitem {
public static void main(String[] args) {
    int[] arr={2,3, 4,5,6};
    System.out.println("the max item is : "+ max(arr));//function call
    System.out.println("the range array's max number is: "+maxrange(arr, 1, 4));//this is running for the range array
}  
//imagine that array is not empty
 static int max(int[] arr){
    if(arr.length==0){

        return -1;
    }
    
    int maxval =arr[0];
    for (int i=0;i<arr.length;i++){
        if(arr[i]>maxval){
            maxval=arr[i];
        }        
    }
    return maxval;
}//work on edge cases here , like array being null or whatever
static int maxrange(int[] arr,int start, int end){
    if(end<start){
        return -1;

    }
    if(arr == null){
        return -1;
    }
    int maxval =arr[0];
    for (int i=start;i<end;i++){
        if(arr[i]>maxval){
            maxval=arr[i];
        }        
    }
    return maxval;
}

}

