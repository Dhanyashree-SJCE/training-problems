package DAY14.Leetcode;
import java.util.*;
public class RotateImage {
    public static void Rotate(int[][] mat,int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
       
      for(int i=0;i<r;i++)
        {
            int left=0,right=mat.length-1;
            while(left<right)
            {
               int temp=mat[i][left];
               mat[i][left]=mat[i][right];
               mat[i][right]=temp;
               left++;
               right--;
            }
        }
        

    }
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] mat= new int[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            mat[i][j]=sc.nextInt();
        }
    }
    Rotate(mat,r,c);
     for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
      }
    


    sc.close();
 }   
}
