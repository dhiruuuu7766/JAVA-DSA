class Solution {
    public List<List<Integer>> combinationSum(int[] a, int tar) {
       List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();

        fun(a, a.length, 0, diary, 0, res, tar);

        return res;
    }

    void fun(int[] a, int n, int idx, List<Integer> diary, int sum, List<List<Integer>> res, int tar) {
        
        if(sum == tar) {
            res.add(new ArrayList<>(diary));
            return;
        }
        if(idx == n) return;
        fun(a, n, idx+1, diary, sum, res, tar);
        if(a[idx] + sum <=tar) {
            diary.add(a[idx]);
            sum += a[idx];
            fun(a, n, idx, diary, sum, res, tar);
          
             diary.remove(diary.size() - 1);
        }
    }
}