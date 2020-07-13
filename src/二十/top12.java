/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top12
 * Author:   李佳佳同学
 * Date:     2020/7/13 23:05
 * Description: 整数转罗马数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈整数转罗马数字〉
 *
 * @author 李佳佳同学
 * @create 2020/7/13
 * @since 1.0.0
 */
public class top12 {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int n=values.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            while(values[i]<=num && num>=0){
                sb.append(symbols[i]);
                num-=values[i];
            }
        }

        return sb.toString();
    }
}
