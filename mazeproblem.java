public class mazeproblem {
     public static boolean gridpath(int grid[][],int n,int m){
        //base
        if(i == n-1 && j == m-1){   //condn for last call
            return false;
        }
        else if(i==n || j==n){  //boundary cross condn
            return false;
        }
        else if( i== 0){
            return false;
        }

        gridpath(i+1,j,n,m);
        gridpath(i,j+1,n,m);
        return true;
        
    }
    public static void printgrid(int grid[][]){
        for(int i = 0; i<grid.length;i++){
            for(int j= 0;j<grid.length;j++){
                System.out.print(" "+grid[i][j] + " ");
            }
            System.out.println();
        }
    }
public static void main(String args[]){
    int grid[][]= {{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
    if(gridpath(grid,0,0)){
        System.out.print("solution exist");
        printgrid(grid);
    }else{
        System.out.println("solution doesnot exist");
    }

        }
    

}

}


