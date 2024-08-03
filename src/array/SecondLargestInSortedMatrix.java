package array;
public class SecondLargestInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    secondLargest = largest;
                    largest = matrix[i][j];
                } else if (matrix[i][j] > secondLargest && matrix[i][j] < largest) {
                    secondLargest = matrix[i][j];
                }
            }
        }
        
        System.out.println("The second largest element in the matrix is: " + secondLargest);
    }
}
