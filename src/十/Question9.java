/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Question9
 * Author:   李佳佳同学
 * Date:     2020/7/13 17:01
 * Description: 判断一个数字是不是回文数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈判断一个数字是不是回文数〉
 *
 * @author 李佳佳同学
 * @create 2020/7/13
 * @since 1.0.0
 */
public class Question9 {

    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        if(s.length()<2) return true;
        char [] c=s.toCharArray();
        int j=c.length-1;
        int i=0;
        while(i<j){
            if(c[i]!=c[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
