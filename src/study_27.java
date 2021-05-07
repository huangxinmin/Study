import java.util.ArrayList;
import java.util.List;

public class study_27 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            int[] res = new int[rowIndex + 1];
            for (int i = 0; i <= rowIndex; i++){
                for (int j = i;j >= 0; j--){
                    if(j == 0 || j ==i ){
                        res[j] = 1;
                    }else {
                        res[j] += res[j - 1];
                    }
                }
            }
            List<Integer> resList = new ArrayList<> ();
            for (int i = 0; i <= rowIndex; i++){
                resList.add(res[i]);
            }
            return resList;
        }
    }
}
