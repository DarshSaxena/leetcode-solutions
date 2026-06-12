class StockSpanner {
    Stack<int[]> stk;
    public StockSpanner() {
        stk=new Stack<>();
    }
    
    public int next(int price) {
        int count=1;
        while(!stk.isEmpty() && price>=stk.peek()[0]){
            count+=(stk.pop()[1]);
        }
        stk.push(new int[] {price,count});
        return count;
    }
}
