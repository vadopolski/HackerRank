package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HourGlass {
    static int hourglassSum(int[][] arr) {
        List<Integer> arrSumm = new ArrayList<>();
        
        System.out.println("Test ");
        
        for (int j = 0; j + 2 < arr[0].length; j++) {
            for (int i = 0; i + 2 < arr[0].length; i++) {
                int sum = arr[j][i] + arr[j][i + 1] + arr[j][i + 2];
                sum += arr[j + 1][i + 1];
                sum += arr[j + 2][i] + arr[j + 2][i + 1] + arr[j + 2][i + 2];
                arrSumm.add(sum);
            }
        }
        
        return Collections.max(arrSumm);
    }
    
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        
        String[] matrix = new String[6];
        matrix[0] = "1 1 1 0 0 0";
        matrix[1] = "0 1 0 0 0 0";
        matrix[2] = "1 1 1 0 0 0";
        matrix[3] = "0 0 2 4 4 0";
        matrix[4] = "0 0 0 2 0 0";
        matrix[5] = "0 0 1 2 4 0";
        
        for (int i = 0; i < 6; i++) {
            
            System.out.println("Test");
            
            for (int j = 0; j < 6; j++) {
                String[] arrRowItems = matrix[i].split(" ");
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        System.out.println(hourglassSum(arr));
    }
}