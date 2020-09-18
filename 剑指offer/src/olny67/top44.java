/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top44
 * Author:   李佳佳同学
 * Date:     2020/9/18 22:55
 * Description: 翻转字符串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package olny67;

/**
 * 〈一句话功能简述〉<br> 
 * 〈翻转字符串〉
 *
 * @author 李佳佳同学
 * @create 2020/9/18
 * @since 1.0.0
 */
//https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/solution/mian-shi-ti-58-i-fan-zhuan-dan-ci-shun-xu-shuang-z/
public class top44 {
    public String ReverseSentence(String str) {
       if(str.trim().isEmpty()){
           return str;
       }
      str=str.trim();
      StringBuffer sb=new StringBuffer();
      int i=str.length()-1;
      int j=i;
      while(i>=0){
         while(i>=0 && str.charAt(i)!=' '){--i;}
          //此时的i就是到空格的位置。,而且要加上空格。
          sb.append(str.substring(i+1,j+1)+" ");
          while(i>=0 && str.charAt(i)==' '){
           i--;
          }
          j=i; //此时i在倒数第二个字符的第一个位置
      }
        return sb.toString().trim();
    }

}
