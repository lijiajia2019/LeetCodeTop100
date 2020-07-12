/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Question5
 * Author:   李佳佳同学
 * Date:     2020/7/12 15:37
 * Description: 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。  示例 1：  输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。  示例 2：  输入: "cbbd" 输出: "bb"  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/longest-palindromic-substring 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。  示例 1：  输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。
 * 示例 2：  输入: "cbbd" 输出: "bb"  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/longest-palindromic-substring 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author 李佳佳同学
 * @create 2020/7/12
 * @since 1.0.0
 */
public class Question5 {
    //解法一：暴力解。
    public String longestPalindrome(String s) {

        int len=s.length();
        if(len<2)
        {
            return s;
        }
        char [] cha=s.toCharArray();
        //maxlen，回文子串的的长度，只用一个变量表示，如果后面的值比前面的大，那么就更新。
        int maxlen=1;
        int begin=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                //判断是否是回文并且这个回文是否比前一个大，如果是，那么更新maxlen的值
                if(j-i+1>maxlen && ishuiwen(cha,i,j)){
                    maxlen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxlen);

    }

    //判断是否是回文，第一和倒数第一，第二和倒数第二...他们都是相等的
    public boolean ishuiwen(char [] array,int i,int j){
        while(i<j){
            if(array[i]!=array[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;


    }
}
