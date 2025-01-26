public class Transpose2Darray {
    public static void main(String[] args) {
        int[][]matrix={
            {1,2,3},{4,5,6},{7,8,9}};
            int rows=matrix.length;
            int columns=matrix[0].length;
            int[][]transpose=new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("original matrix:");
        for(int[]row:matrix){
            for(int elem:row){
                System.out.print(elem+ " ");
            }
            System.out.println();
        }
        System.out.println("\n transposed matrix:");
        for(int[]row:transpose){
            for(int elem:row){
                System.out.print(elem+ " ");
            }
            System.out.println();
        }
    }
}
            
        
        
            
        
    
            
        
    
