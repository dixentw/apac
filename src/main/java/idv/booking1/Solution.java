package idv.booking1;

import java.util.*;

public class Solution {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int squareCount = 0;
        int rectangleCount = 0;
        int polyCount = 0;

        while(sc.hasNext()){
          String line = sc.nextLine();
          String[] sidesStrs = line.split(" ");
          int[] sides = new int[sidesStrs.length];
          for(int i=0; i<sidesStrs.length;i++){
            sides[i] = Integer.parseInt(sidesStrs[i]);
          }
          if(sides[0]<=0||sides[1]<=0||sides[2]<=0||sides[3]<=0){
            polyCount++;
          }else if(sides[0]==sides[1]&&sides[1]==sides[2]&&sides[2]==sides[3]){
            squareCount++;
          }else if(sides[0]==sides[2]&&sides[1]==sides[3]){
            rectangleCount++;
          }else{
            polyCount++;
          }
        }
        System.out.println(squareCount+" "+ rectangleCount+" "+polyCount);
    }
}
