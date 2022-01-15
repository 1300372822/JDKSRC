package org.example;

public class MS2 {

    public static void main(String[] args) {
        int[] arr = {1,4,5,7};
        test(arr,5);
        test(arr,2);
    }

    public static void test(int arr[],int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                System.out.println(i);
                return;
            }
        }
        if (arr[0]>k){
            System.out.println(0);
            return;
        }
        if (arr[arr.length-1]<k){
            System.out.println(arr.length+1);
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<k&&arr[i+1]>k){
                System.out.println(i+1);
                return;
            }
        }


    }
}
