import java.util.ArrayList;

public class Perfect_iNteger {
    public static void main(String[] args) {
        int x=2,y=3,bound=10;
        ArrayList<Integer> li=new ArrayList<>();
        powerfulIntegers(x,y,bound,li);
        System.out.println(li);

    }
    public static void powerfulIntegers(int x, int y, int bound,ArrayList<Integer> ans) {
//        List<Integer> ans=new ArrayList();
        int j=0;
        for(int i=0;i<=y;i++){
            int sum=(int)Math.pow(x,i) + (int)Math.pow(y,j);
            if(sum <=bound){
                ans.add(sum);
                if(sum%2==0){
                    continue;
                }else
                    j++;

            }
            sum=0;
        }
//        return ans;
    }
}
