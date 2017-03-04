package idv.apac2;

import java.util.*;

public class App {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int caseNum = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=caseNum; i++){
            String result = "Case #"+i+": ";
            String[] tmp = sc.nextLine().split(" ");
            int l = Integer.parseInt(tmp[0]);
            int r = Integer.parseInt(tmp[1]);
            long small = Math.min(l, r);
            long sum = (1+small)*small/2;
            System.out.println(result+sum);
        }
    }
}
