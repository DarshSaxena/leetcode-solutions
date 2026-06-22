class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        int b=h.getOrDefault('b',0);
        int a=h.getOrDefault('a',0);
        int l=h.getOrDefault('l',0)/2;
        int o=h.getOrDefault('o',0)/2;
        int n=h.getOrDefault('n',0);

        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}
