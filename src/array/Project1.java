package array;
import java.util.*;  
public class Project1.java:5  
{  
    public static void main(String[] args)   
    {  
        int[][] matrix =   
        {  
            {1,2,3},  
            {4,5,6},  
            {7,8,9}  
        };  
          
        int rows=matrix.length;  
        int cols=matrix[0].length;  
          
        int largest=matrix[rows-1][cols-1]; // Initialize largest with the bottom-right element  
        int secondLargest=matrix[rows-1][cols-2]; // Initialize secondLargest with the element before largest  
          
        // Traverse the matrix in reverse order  
        for (int i=rows-1;i>=0;i--)   
        {  
            for (int j=cols-1;j>=0;j--)   
            {  
                if (matrix[i][j]>largest)   
                {  
                    secondLargest=largest; // Update secondLargest to previous largest  
                    largest=matrix[i][j]; // Update largest to the new largest element  
                }   
                else if(matrix[i][j]>secondLargest&&matrix[i][j]<largest)   
                {  
                    secondLargest=matrix[i][j];   
                }  
            }  
        }  
          
        System.out.println("Second largest element in the sorted matrix:"+secondLargest);  
    }  
}  