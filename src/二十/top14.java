/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top14
 * Author:   李佳佳同学
 * Date:     2020/7/15 12:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author 李佳佳同学
 * @create 2020/7/15
 * @since 1.0.0
 */
public class top14 {
    public String longestCommonPrefix(String[] strs) {

        if(strs==null||strs.length==0){
            return "";
        }
        //以数组的第一个元素为基准。
        int firstlen=strs[0].length();
        int count=strs.length;
        for(int i=0;i<firstlen;i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<count;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }

        //否则就是第一个是是长度最短而且都是公共子串。
        return strs[0];
    }
}
