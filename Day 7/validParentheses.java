class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                char ls = st.pop();
                if((ch==')' && ls!='(') || (ch=='}' && ls!='{') || (ch==']' && ls!='[')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
