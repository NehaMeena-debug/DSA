public class jump_game {
    
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
          int maxL = 0;
       for(int i=0;i<=n;i++){
           if(i > maxL){
               return false ;
           }
          maxL = Math.max(maxL , i+nums[i]);
           
       } 
       return true ;  
       }
}
