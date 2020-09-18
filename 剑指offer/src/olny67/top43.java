/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top43
 * Author:   李佳佳同学
 * Date:     2020/9/18 23:51
 * Description: 左旋字符串
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package olny67;

/**
 * 〈一句话功能简述〉<br> 
 * 〈左旋字符串〉
 *
 * @author 李佳佳同学
 * @create 2020/9/18
 * @since 1.0.0
 */
public class top43 {
 public String reverseLeftWords(String s, int n) {
        if(s.length()<n || s==null)
        {
            return s;
        }
        return s.substring(n,s.length())+s.substring(0,n);
    }
}
