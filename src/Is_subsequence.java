public class Is_subsequence {
    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));

    }
    static boolean isSubsequence(String s, String t) {
        // Map<Character,Integer> hs = new HashMap();
        // for(var i:s.toCharArray()) hs.put(i,hs.getOrDefault(i,0)+1);
        // for(int i=0;i<t.length();i++){
        //     if(hs.containsKey(t.charAt(i))){hs.remove(t.charAt(i));}

        // }
        // return hs.size()==0;



        int i=0,j=0;
        int n=s.length(),m=t.length();
        int count=0;
        while(i<n && j<m){
            char ch=s.charAt(i++);
            char ch1=t.charAt(j++);
            if(ch==ch1){
                count++;
            }
            else if(j<m){
                j++;
            }
        }
        if(count==n) return true;
        return false;

    }
}
