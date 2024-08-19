package main.java.com.pnr.core;


public class Test {  
    public static void main(String[] args) {  
  
        //Initialize array  
        int  arr[] = {25, 11, 7, 75, 56, 789, 728347, 234623423};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        System.out.println(max);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max    
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}