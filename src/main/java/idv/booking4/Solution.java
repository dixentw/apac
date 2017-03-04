package idv.booking4;

import java.util.*;

public class Solution {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int services = Integer.parseInt(sc.nextLine());
        int dLen = Integer.parseInt(sc.nextLine());
        int[] starts = new int[dLen];
        int[] ends = new int[dLen];
        for(int i=0; i<dLen; i++){
          String[] data = sc.nextLine().split(" ");
          starts[i] = Integer.parseInt(data[0]);
          ends[i] = Integer.parseInt(data[1]);
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int in = 1;
        int max = 1;
        int i = 1;
        int j = 0;
        while(i<dLen && j<dLen){
          if(starts[i]<=ends[j]){
            in++;
            if(in > max){
              max = in;
            }
            i++;
          }else{
            in--;
            j++;
          }
        }
        System.out.println(max-services);
    }

}
