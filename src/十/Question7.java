/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Question7
 * Author:   李佳佳同学
 * Date:     2020/7/13 12:46
 * Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。  示例 1:  输入: 123 输出: 321
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。  示例 1:  输入: 123 输出: 321 〉
 *
 * @author 李佳佳同学
 * @create 2020/7/13
 * @since 1.0.0
 */
public class Question7 {
    public int reverse(int x) {

        int rev=0;
        int pop;
        while(x!=0){
            pop=x%10; //取末尾那位。
            x/=10;
            //判断溢出。
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;


            rev=rev*10+pop;



        }
        return rev;
    }
}
