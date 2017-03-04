package idv.booking3;

import java.util.*;

public class Solution {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        System.out.println(numbers);
        int[] nums = new int[numbers.length];
        int[] result = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
          nums[i] = Integer.parseInt(numbers[i]);
        }
        for(int i=0; i<nums.length; i++){
          if(i==0){
            result[i] = nums[i];
          }else{
            result[i] = nums[i] - nums[i-1];
          }
        }
        for(int i=0; i<result.length; i++){
          if((result[i]<-127 || result[i]>127)&&i!=0){
            System.out.print(-128 + " ");
          }
          if(i==result.length-1){
            System.out.print(result[i]);
          }else{
            System.out.print(result[i] + " ");
          }
        }

    }

}
