/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top41
 * Author:   李佳佳同学
 * Date:     2020/9/19 20:54
 * Description: 和为S的连续正数数列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package olny67;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈和为S的连续正数数列〉
 *https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/solution/shi-yao-shi-hua-dong-chuang-kou-yi-ji-ru-he-yong-h/
 * 使用滑动窗口求解
 * @author 李佳佳同学
 * @create 2020/9/19
 * @since 1.0.0
 */
public class top41 {

public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
      int targer=0;
       ArrayList<ArrayList<Integer>> lists =new ArrayList();
       int start=1,end=1;
       while(start<=sum/2){

           //如果小于，右指针移动，end++
           if(targer<sum){
            targer+=end;
               //注意此时的相加的和是不包括右指针的。
           end++;
           }

           //如果大于，左指针移动，start++;
           else if(targer>sum){
               targer-=start;
               start++;
           }
           else{
               //这里条件要<
             ArrayList list=new ArrayList();
            for(int i=start;i<end;i++){
                    list.add(i);}
               lists.add(list);
               targer-=start;
               start++;
           }
       }
        return lists;
    }
}
