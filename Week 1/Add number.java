import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static int addNums(int n) {
        int i,sum=0;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String args[]) {
        int n = 3;
        assert (addNums(n) == 6);
    }
}

