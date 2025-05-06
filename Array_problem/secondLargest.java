public class secondLargest {
    int[] arr = {23,76,56,88,99};
    
    public int getSecondLargest(int[] arr) {
    int length = arr.length ;
    int largest = arr[0];
    int  secondLargest = -1;
        
        for(int i=0;i<length;i++){
            // for(int j=i+1;j<length;j++){
                if(arr[i]>largest){
                    secondLargest = largest;
                    largest = arr[i];
                }
                else if(arr[i]<largest&&arr[i]>secondLargest){
                secondLargest = arr[i];
            }
              
        }
        
       
       return  secondLargest ;
    }
    

}
