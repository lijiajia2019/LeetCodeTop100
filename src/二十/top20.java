/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top20
 * Author:   李佳佳同学
 * Date:     2020/9/16 20:21
 * Description: 有效括号
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

import java.util.Stack;

/**
 * 〈给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉<br>
 * 〈如果这个是有效的，那么我们有，放进去的都是前一个和后面的一个相比，他们必然是相等的。比如有一个例子() 那么我们判断第一个是( ,然后我们放进stack 是) 那么判断第二个字符是否是)我们比较并且弹出。
 *
 * @author 李佳佳同学
 * @create 2020/9/16
 * @since 1.0.0
 */
public class top20 {


    public boolean isValid(String s){
        if(s.length()<2 || s==null){
            return false;
        }
        Stack<Character>  stack=new Stack();
        for(char c:s.toCharArray()){
            if(c=='(') {
                stack.push(')');
            }
            else if(c=='{') {
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }

            //如果不是呢，就踏出比较，如果栈是空的直接返回false;
            else if(stack.isEmpty()  || c!=stack.pop()){
                return false ;
            }
        }
        //防止进入的全部是左半边的字符，直接返回栈是否为空的判断。
        return  stack.isEmpty();
    }


}
