class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows ==0){
            return result;
        }

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        for(int i=1;i<numRows;i++){
            List<Integer> prev = result.get(i - 1);
            List<Integer> current = new ArrayList<>();
            current.add(1);

            for (int j = 1; j < i; j++) {
                current.add(prev.get(j - 1) + prev.get(j));
            }

            current.add(1);
            result.add(current);
        }
        return result;
    }
}