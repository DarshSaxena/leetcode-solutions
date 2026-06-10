class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        int sum=0;
      Stack<Integer> s=new Stack<>();
      for(int i=0;i<n;i++){
        if(operations[i].equals("C")){
            s.pop();}
            else if(operations[i].equals("D")){
                s.push(s.peek()*2);}
                else if(operations[i].equals("+")){
                 int last=s.pop();
                   int slast= s.peek();
                   s.push(last);
                 s.push(last+slast);                
                 }else{
                s.push(Integer.parseInt(operations[i]));}}

while(!s.isEmpty()){
     sum=sum+s.pop();

            }return sum;
    }
        }
      
