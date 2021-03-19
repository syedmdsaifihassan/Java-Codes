import java.util.Scanner;

public class Array_practice {
    public static void main(String[] args) {
        // 1. Sum of 5 floats in array
        // float [] num = new float[5];
        // num[0] = 2.1f;
        // num[1] = 2.2f;
        // num[2] = 2.3f;
        // num[3] = 2.4f;
        // num[4] = 2.5f;
        // float [] num = {2.1f, 2.2f, 2.3f, 2.4f, 2.5f};
        // float sum=0;
        // for (int i = 0; i < num.length; i++) {
        //     sum += num[i];
        // }
        // System.out.println(sum);

        // 2. Find the element present in array or not
        // float [] num = {2.1f, 2.2f, 2.3f, 2.4f, 2.5f};
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the element to find: ");
        // float search = sc.nextFloat();
        // boolean inArray = false;
        // for (float elements : num) {
        //     if (search == elements){
        //         inArray=true;
        //         break;
        //     }
        // }
        // if(inArray){
        //     System.out.println(search+" Present in array");
        // }
        // else{
        //     System.out.println(search+" Not present in array");
        // }

        // 3. Cal avg marks of students
        // float [] phy = {89.5f, 90f, 85, 84.5f, 95f};
        // float sum = 0;
        // for (float f : phy) {
        //     sum += f;
        // }
        // float avg = 0;
        // avg = sum/phy.length;
        // System.out.println(avg);

        // 4. Addition of 2D matrix
        // int [][] num1 = {{2, 3, 4}, {5, 6, 7}};
        // int [][] num2 = {{8, 9, 10}, {11, 12, 13}};
        // int [][] sum = {{0, 0, 0}, {0, 0, 0}};
        // for (int i = 0; i < num1.length; i++) {
        //     for (int j = 0; j < num1[i].length; j++) {
        //         sum[i][j] = num1[i][j] + num2[i][j];
        //         System.out.print(sum[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // 5. Reverse an array
        // int [] arr = {2, 3, 4, 5, 6, 7};
        // for (int i = arr.length-1; i >=0; i--) {
        //     System.out.print(arr[i]+" ");
        // }

        // 6. Maximum element in the array
        // int [] arr = {6, 3, 4, 5, 6, 7};
        // int max = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        // 7. Minimum element in the array
        // int [] arr = {6, 3, 4, 5, 6, 2};
        // int min = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]<min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println(min);

        // 8. Array is sorted or not
        // int [] arr = {1, 3, 4, 5, 6, 7};
        // boolean sorted = true;
        // for (int i = 0; i < arr.length-1; i++) {
        //     if(arr[i]>arr[i+1]){
        //         sorted = false;
        //         break;
        //     }
        // }
        // if(sorted){
        //     System.out.println("Sorted");
        // }
        // else{
        //     System.out.println("Unsorted");
        // }

    }
}
