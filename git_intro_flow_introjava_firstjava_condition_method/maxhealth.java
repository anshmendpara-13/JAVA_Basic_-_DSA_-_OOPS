package git_intro_flow_introjava_firstjava_condition_method;
public class maxhealth {
    public void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,5}};
        int ans =  maximumWealth(accounts);
        System.out.println(ans);
//
    }
    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int[] ints = accounts[person];
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }


}