public class Main{  
        public static void main(String args[]){  
        //creating a matrix  
        int original[][]={{1,3,4},{2,4,3},{3,4,5}};    
    
        
        int transpose[][]=new int[3][3];  //3 rows and 3 columns  
    

        System.out.println("Printing 2d arrays: ");  
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                System.out.print(original[i][j]+" ");    
            }    
            //new line 
                System.out.println();   
        }   
    }
    
}  
