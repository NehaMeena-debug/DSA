public class majorityElem {
    public int majorityElement(int[] nums) {
        int n = nums.length; 
        int tCount = 1; 
        int Elem = nums[0];
        for(int i=0;i<n;i++){
         int count = 1;
         for(int j=i+1;j<n;j++){
         if(nums[j] == nums[i]){
             count++;
         }  
         }
 
         if(count>tCount){
             tCount = count ;
             Elem = nums[i];
         }
        }
           return Elem;
     }
 
}
