public class Linearsearch {
public static void main(String[] args) {
    int[] array={2,3,4,5,6,7,8,12,45,75};
    int target=3;
    int ans=fun(array, target);
    System.out.println("the targeted element index is :" + ans);
}    
//search in the array. Return the index if item found 
//otherwise if item not found retun -1
static int fun(int[] arr,int target){                  //here i'm declaring the array and making a target integer
    if(arr.length==0){
        return -1;
    }
    //running a for loop
    for(int index =0;index<arr.length;index++){     //you can also search in range by changing the 'start' to 'end' target
        //chek for element at every index if it is=target
        if(arr[index]==target){//you can also assign another varable to 'arr[index]'  for convenience 
            return index;
        }
        
    }
    //this line will execute if none of the ruturn statement above have executed
    //hence the target not found
    return -1;

}

}
 