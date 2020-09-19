/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top40
 * Author:   李佳佳同学
 * Date:     2020/9/19 23:22
 * Description: 数组中出现一次的两个数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package olny67;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数组中出现一次的两个数字〉
 *https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/jie-di-qi-jiang-jie-fen-zu-wei-yun-suan-by-eddievi/
 * @author 李佳佳同学
 * @create 2020/9/19
 * @since 1.0.0
 */
public class top40 {
 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
     int yh=0;
        //得到异或的结果。
      for(int num:array){
          yh ^=num;
      }

        int targer=1;
        while((targer &  yh)==0){
            targer <<=1;
        }
        int a=0,b=0;
       for(int num :array){
           if((num & targer)== 0){
               a^=num;
           }
           else{
               b^=num;
           }
       }
        num1[0]=a;
        num2[0]=b;
    }
}
