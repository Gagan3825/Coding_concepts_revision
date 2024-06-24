import java.util.ArrayList;
import java.util.List;

public class Pivot {
    public static void main(String[] args) {
        int n=8;
        int pivot=0;
        int leftsum=0,rightsum=0;
        List<Integer> li=new ArrayList();
        for(int i=1;i<=n;i++){
            li.add(i);
        }
        System.out.println(li);
        for(int i=0;i<li.size()-1;i++){
            pivot=i+1;
            leftsum+=li.get(i)+li.get(pivot);

            for(int j=pivot;j<li.size();j++){
                rightsum+=li.get(j);
            }
            if(leftsum==rightsum){
                System.out.println(pivot);
            }else{
                rightsum=0;
                continue;
            }


        }
        System.out.println(-1);
    }
}
