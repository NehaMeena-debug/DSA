public class moveZero {

        // public static void main (String[]args){
         
        //   int[] arr = {0,0,6,9,7,0};
        
        //  int length = arr.length;
    
         
        // moveZero call = new moveZero();
        
        // call.pushZerosToEnd(arr);
        
        // for(int i=0;i<length;i++){
        //  System.out.println(arr[i]);
        // }
        
        // }
        
        
        void pushZerosToEnd(int[] arr) {
        
              int length = arr.length;
              
              int temp =  0 ;
              int j = 0;
              
             for(int i=0;i<length;i++){
               
                     if(arr[i]!=0){
                         temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp ;
                        j++;
                     }
              
             }
             
              
                }
            
                 
    }

