/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Question6
 * Author:   李佳佳同学
 * Date:     2020/7/13 11:36
 * Description: 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。  比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：  L   C   I   R E T O E S I I G E   D   H   N  之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。  请你实现这个将字符串进行指定行数变换的函数：  string convert(string s, int numRows);  示例 1:  输入: s = "LEETCODEISHIRING", numRows = 3 输出: "LCIRETOESIIGEDHN"  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/zigzag-conversion 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 十;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。  比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R E T O E S I I G E   D   H   N  之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * 请你实现这个将字符串进行指定行数变换的函数：  string convert(string s, int numRows);  示例 1:  输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/zigzag-conversion 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author 李佳佳同学
 * @create 2020/7/13
 * @since 1.0.0
 */
public class Question6 {
    public String convert(String s, int numRows) {
        //边界值判断。
        if(numRows<2) return s;
        ArrayList<StringBuilder> list=new ArrayList();
        for(int i=0;i<s.length();i++)  list.add(new StringBuilder());

        int i=0,flag=-1;
        for(char c:s.toCharArray()){
            list.get(i).append(c);
            //边界值判断，如果到了最后一行，那么就行值就要减了，如果i是第一行，行值就要加。
            if(i==0||i==numRows-1) flag=-flag;
            i+=flag;  //根据flag的值决定行值I是相加还是相减。
        }

        //  StringBuider sb=new StringBuider();
        StringBuilder sb = new StringBuilder();
        for(StringBuilder s1:list) sb.append(s1);
        return sb.toString();


    }
}
