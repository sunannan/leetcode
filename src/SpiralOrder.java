import java.util.ArrayList;

/**
 * User: sunan
 * Date: 13-10-10
 * Time: 下午7:17
 */
public class SpiralOrder {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
           // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0)
            return ret;
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int i=0;
        int j=0;

        while(i<=m && j<=n){
            loop(matrix, i, j, m, n, ret);
            i++;
            j++;
            m--;
            n--;
        }

        return ret;
    }

    public void loop(int[][] matrix, int i, int j, int m, int n, ArrayList<Integer> ret) {
        if (i == m) {
            for (int k = j; k < n; k++)
                ret.add(matrix[i][k]);
            return;
        }
        if (j == n) {
            for (int k = i; k < m; k++)
                ret.add(matrix[k][j]);
            return;
        }
        for (int k = j; k < n; k++)
            ret.add(matrix[i][k]);
        for (int k = i; k < m; k++)
            ret.add(matrix[k][n]);
        for (int k = n; k > j; k++)
            ret.add(matrix[m][k]);
        for (int k = m; k > i; k++)
            ret.add(matrix[k][j]);

    }

    public static void main(String[] args) {
        SpiralOrder test = new SpiralOrder();
        int[][] data = {{1, 2}, {11, 12}};
        System.out.println(test.spiralOrder(data));
    }

}
