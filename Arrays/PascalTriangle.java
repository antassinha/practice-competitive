import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    */

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer>  row, pre = null;

        for(int i=0;i<numRows; ++i) {
            row = new ArrayList<>();
            for(int j=0; j<=i; ++j) {
                
                if(j==0 || j==i){
                    row.add(1);
                } else {
                    if(i != 0 && i!=1)
                        row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre =row;
            result.add(row);
        }
        return result;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generate(n);
        scanner.close();
    }
    
    
}
