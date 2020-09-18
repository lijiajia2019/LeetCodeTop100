/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top42
 * Author:   李佳佳同学
 * Date:     2020/9/18 23:53
 * Description: 和为s的两个递增数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package olny67;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈和为s的两个递增数组〉
 *
 * @author 李佳佳同学
 * @create 2020/9/18
 * @since 1.0.0
 */
public class top42 {
 public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list=new ArrayList();
        int len=array.length;
        if(len<2 || array==null){
            return list;
        }
        int l=0,r=len-1;
        while(l<r){
           if(array[l]+array[r]==sum){
               list.add(array[l]);
               list.add(array[r]);
               break;
           }
            else if(array[l]+array[r]<sum){
                l++;
            }
            else {
                r--;
            }
        }
        return list;
    }
}
