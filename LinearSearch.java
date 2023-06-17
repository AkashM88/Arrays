 public class LinearSearch{
    public static int linear_search(int num[],int key){
        for(int i =0 ;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int num[] = {2,4,5,6,7,8,9};
       int key = 8;
    //   int index = linear_search(num, key);
    //    if(index == -1){
    //     System.out.println("not found");
    //    }else{
        System.out.println("found at :" +linear_search(num, key));
    //   }
        
    }
}