//Code beats 78% of other submission users using stacks and memory beats 36% other submission users
//Runtime:6ms , 

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack<>();
        int nmb;
        for(String a : tokens){
                if(a.equals("*")){
                    res.push(res.pop() * res.pop());
                }else if(a.equals("+")){
                    res.push(res.pop()+res.pop()); 
                }else if(a.equals("/")){
                    nmb=res.pop();
                    res.push(res.pop()/nmb);
                }else if(a.equals("-")){
                    nmb=res.pop();     
                    res.push(res.pop() - nmb);      
                }else{
                    res.push(Integer.valueOf(a));
                }  
        }
        return res.pop();
    }
}
