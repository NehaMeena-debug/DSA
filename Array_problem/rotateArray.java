public class rotateArray {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
       int[] temp = new int[l];
   
     for(int i=0;i<l;i++){
      int  position = (i+k)%l;
      temp[position] = nums[i];
   }
   
   for(int i=0;i<l;i++){
       nums[i] = temp[i];
   }
          
       }
}
