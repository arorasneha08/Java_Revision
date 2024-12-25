// public class RotateMatrixOneElem {
//     import java.io.*;
// import java.util.*;

// import java.util.ArrayList;

// public class Solution {
//     public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
//         int layers = Math.min(n, m) / 2;

//         for (int layer = 0; layer < layers; layer++) {
//             int top = layer;
//             int bottom = n - 1 - layer;
//             int left = layer;
//             int right = m - 1 - layer;

//             int prev = mat.get(top).get(left);

//             for (int j = left + 1; j <= right; j++) {
//                 int temp = mat.get(top).get(j);
//                 mat.get(top).set(j, prev);
//                 prev = temp;
//             }

//             for (int i = top + 1; i <= bottom; i++) {
//                 int temp = mat.get(i).get(right);
//                 mat.get(i).set(right, prev);
//                 prev = temp;
//             }

//             for (int j = right - 1; j >= left; j--) {
//                 int temp = mat.get(bottom).get(j);
//                 mat.get(bottom).set(j, prev);
//                 prev = temp;
//             }

//             for (int i = bottom - 1; i >= top; i--) {
//                 int temp = mat.get(i).get(left);
//                 mat.get(i).set(left, prev);
//                 prev = temp;
//             }
//         }
//     }
// }

// }

// // code 360 : rotate matrix 
// // https://www.naukri.com/code360/problems/981260?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=PROBLEM