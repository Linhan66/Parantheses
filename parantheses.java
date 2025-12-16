//name:Linhan
//date:12/16/25
//This app will make sure the bracket are in order and have both open and ending bracket

public class parantheses {
    public static boolean trueFalse(String brackets){
        int check = brackets.length();
        if(check == 0 || check % 2 != 0){
            return false;
        }
        while(check > 0){
            brackets = brackets.replace("()", "");
            brackets = brackets.replace("{}", "");
            brackets = brackets.replace("[]", "");
             if (brackets.length() == check) {
                break; 
            }
            check = brackets.length();
        }
        return brackets.length() == 0;
    }
    public static void main(String[] args){
         System.out.println(trueFalse("(){}[]")); //true
        System.out.println(trueFalse("(]")); //false
        System.out.println(trueFalse("([{({})}])")); //true
        System.out.println(trueFalse("(([]){})")); //true
        System.out.println(trueFalse("{}[())()(]")); //false
        System.out.println(trueFalse("(){}{")); //false
        System.out.println(trueFalse("([)]")); //false
        System.out.println(trueFalse("([{}([)])]")); //false
    }
}