/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top13
 * Author:   李佳佳同学
 * Date:     2020/7/13 23:11
 * Description: 罗马数字转整数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈罗马数字转整数〉
 *
 * @author 李佳佳同学
 * @create 2020/7/13
 * @since 1.0.0
 */
public class top13 {
    public int romanToInt(String s) {
        int result=0;
        int pre=getValue(s.charAt(0));
        //判断第一个数字和第二个数的大小，如果前一个数比第二个数字大，直接累加，如果前一个数字比后一个数字小，那么累加的值为后一个数字减前一个数字
        for(int i=1;i<s.length();i++){
            int num=getValue(s.charAt(i));

            if(pre>=num){
                result+=pre;
            }
            else if(pre<num){
                result-=pre;
            }
            //相等的情况

            pre=num;
        }
        //最后一位
        result+=pre;
        return result;

    }

    public static int getValue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }

    }



}
