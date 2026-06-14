import java.util.*;
public class RemovingStarFromAstring{
    public static void main(String [] args){
        String str="leet**cod*e";
        Stack<Character>stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch!='*'){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch1:stack){
            sb.append(ch1);
        }
        System.out.println(new String(sb));
    }
}