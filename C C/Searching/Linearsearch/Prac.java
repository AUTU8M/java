
public class Prac{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,45,65,23,76,87};
        int target=45;
        int ans=fun(array, target);
        System.out.println(array);
    }
    static int fun(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //now run a for loop
        for(int index=0;index<arr.length;index++){
            int ele=arr[index];
           if(ele==target){
                return index;
            }
        }
        return -1;
    }
}