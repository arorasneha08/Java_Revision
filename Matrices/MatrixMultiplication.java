// public class MatrixMultiplication {
//     public static void multiply(int arr1[][] , int arr2[][] , int rows1 , int rows2, int cols1, int cols2){
//         if(c1 != r2){
//             System.out.println("wrong dimensions");
//         }
//         for (int i = 0; i < rows1; i++) {
//             for (int j = 0; j < cols2; j++) {
//                 for (int k = 0; k < cols1; k++) {
//                     mul[i][j] += arr1[i][k] * arr2[k][j];
//                 }
//             }
//         }
//         // Print the result
//         System.out.println("Multiplication of two matrices: ");
//         for (int i = 0; i < rows1; i++) {
//             for (int j = 0; j < cols2; j++) {
//                 System.out.print(mul[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int mat1[][] = {{1,2},{3,4}}; 
//         int mat2[][] = {{5,6},{7,8}}; 
//         int r1 = 2, r2 = 2 ,  c1 = 2 ,  c2 = 2 ; 
//         int mul[][] = multiply(mat1, mat2 ,r1, r2, c1, c2); 
//     }
// }
