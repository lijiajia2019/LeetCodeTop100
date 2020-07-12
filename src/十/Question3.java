/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Question3
 * Author:   李佳佳同学
 * Date:     2020/7/12 10:58
 * Description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。  示例 1:  输入: "abcabcbb" 输出: 3  解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 十;

import java.util.HashSet;

/**
 * 〈一句话功能简述〉<br> 
 * 〈给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。  示例 1:  输入: "abcabcbb" 输出: 3  解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author 李佳佳同学
 * @create 2020/7/12
 * @since 1.0.0
 */
public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet();
        int n=s.length();
        //rk为移动的指针，i为固定位置，每次都移动一位，Rk不断移动知道遇到相同的位置位置。
        int rk=-1,lan=0;
        for(int i=0;i<n;i++){
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            //rk+1为移动指针的位置。
            while(rk+1<n && !set.contains(s.charAt(rk+1))){
                set.add(s.charAt(rk+1));
                rk++;

            }
            lan=Math.max(lan,rk-i+1);


        }
        return lan;


    }
}
