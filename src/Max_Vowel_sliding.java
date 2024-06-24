public class Max_Vowel_sliding {
    public static void main(String[] args) {
        String s="abciiidef";
        int k=3;
        System.out.println(maxVowels(s,k));
    }
    public static int maxVowels(String s, int k) {
        int i=0,j=0,n=s.length(),res=0,max=0;
        String ans="";
        while(j<n){
            char ch=s.charAt(j);
            ans+=ch;
            if(j-i+1==k){
                res=vowel(ans);
                i++;
                ans="";

            }
            max=Math.max(max,res);
            j++;


        }
        return max;
    }
    static int vowel(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')count++;
        }
        return count;
    }
}
