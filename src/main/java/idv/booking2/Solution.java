package idv.booking2;

import java.util.*;

public class Solution {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String[] mentions = sc.nextLine().split(" ");

        String numStr = sc.nextLine();
        int reviewNum  = Integer.parseInt(numStr);
        Map<String, Integer> table = new HashMap<>();
        for(int i=0; i<reviewNum; i++){
          String hotelID = sc.nextLine();
          String[] reviews = sc.nextLine().split(" ");
          Integer val = table.get(hotelID);
          if(val==null){
            table.put(hotelID, matchCount(mentions, reviews));
          }else{
            val += matchCount(mentions, reviews);
            table.put(hotelID, val);
          }
        }
        System.out.println(Arrays.toString(table.entrySet().toArray()));

    }
    private static int matchCount(String[] mentions, String[] reviews){
      int result = 0;
      System.out.println(Arrays.toString(mentions));
      System.out.println(Arrays.toString(reviews));
      for(String m : mentions){
        for(String r : reviews){
          if(r.endsWith(".")){
            r = r.substring(0, r.length()-1);
          }
          //System.out.println(m);
          //System.out.println(r);
          if(m.equals(r)){
            result++;
          }
        }
      }
      System.out.println(result);
      return result;
    }
}
