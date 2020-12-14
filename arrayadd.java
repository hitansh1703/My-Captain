public class arrayadd
{
    public static void main (String[] args)
 {
    int row=3, c=3;
    int arr1[][]={{1,3,4},{2,4,3},{3,4,5}};
     int arr2[][]={{1,3,4},{2,4,3},{1,2,4}};
     int s[][]= new int[row][c];
     for(int i=0 ; i<row; i++)
     {
         for(int j=0; j<c; j++)
         {
            s[i][j]=arr1[i][j]+ arr2[i][j];
         }
     }
     for(int  i=0 ; i<row; i++)
     {
         for(int j=0; j<c; j++)
         {
            System.out.print(s[i][j]+" ");
         }
         System.out.println(" ");
     }

    
 }
}
