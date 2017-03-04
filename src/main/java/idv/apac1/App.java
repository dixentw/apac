package idv.apac1;

import java.util.*;

public class App {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int caseNum = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=caseNum; i++){
            String result = "Case #"+i;
            String tmp = sc.nextLine();
            int inputNum = Integer.parseInt(tmp);
            List<String> members = new ArrayList<>();
            for(int j=0; j<inputNum; j++){
                members.add(sc.nextLine());
            }
            result += ": " + getLeader(members);
            System.out.println(result);
        }
    }
    private static String getLeader(List<String> members){
        int maxUniq = Integer.MIN_VALUE;
        String maxMember = "";
        for(String m : members){
            char[] mChar = m.toCharArray();
            Set<Character> s = new HashSet<>();
            for(char c : mChar){
                if(c!=' '){
                    s.add(c);
                }
            }
            if(s.size()>maxUniq){
                maxUniq = s.size();
                maxMember = m;
            }
            if(s.size()==maxUniq && m.compareTo(maxMember) < 0){
                maxUniq = s.size();
                maxMember = m;
            }
        }
        return maxMember;
    }
}
