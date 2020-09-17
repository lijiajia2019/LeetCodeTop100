/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top50
 * Author:   李佳佳同学
 * Date:     2020/9/17 23:19
 * Description: 数组中的重复数字
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package olny67;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数组中的重复数字〉
 *
 * @author 李佳佳同学
 * @create 2020/9/17
 * @since 1.0.0
 */
public class top50 {
 public boolean duplicate(int numbers[],int length,int [] duplication) {
        //为什么这里length<2就会空指针异常。
      if(length<=0 || numbers==null){
         return false;
      }
        //寻找空间复杂度是O(1)的算法。
        for(int i=0;i<length;i++){
        //如果不相同，就就行进行交换。
            while(i!=numbers[i]){
                //此时该位置的不是应该放的位置，所以，就要比较这个位置和他要去交换位置的
                //值是否一样。
                if(numbers[i]==numbers[numbers[i]]){ //相同就返回
                    duplication[0]=numbers[i];
                    return true;
                }
                //不同就交换
                int tem=numbers[i];
                numbers[i]=numbers[tem];
                numbers[tem]=tem;

            }
        }
        //遍历完整个数组都没有，就返回false;
       return false;
    }
}
