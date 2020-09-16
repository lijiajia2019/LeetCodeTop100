/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top15
 * Author:   李佳佳同学
 * Date:     2020/9/16 22:28
 * Description: 三数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈三数之和〉
 *
 * @author 李佳佳同学
 * @create 2020/9/16
 * @since 1.0.0
 */
public class top15 {
   public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> lists=new ArrayList();
    int len=nums.length;
    Arrays.sort(nums);
    for(int i=0;i<len;i++){
        if(nums[i]>0) {return lists;}
        if(i>0 && nums[i]==nums[i-1]) {continue ;}

    int cur=nums[i];
    //一次定义多个相同类型的变量会节省时间。
    int l=i+1,r=len-1;

    while(l<r){
        int sum=cur+nums[l]+nums[r];
        if(sum==0){
            List list=new ArrayList();
            list.add(cur);
            list.add(nums[l]);
            list.add(nums[r]);
            lists.add(list);

            //去重。
            while(l<r && nums[l+1]==nums[l]) {++l;}
            while(l<r && nums[r]==nums[r-1]) {--r;}
            ++l;
            --r;
        }
        else if(sum<0) {l++;}
        else if(sum>0) {r--;}
    }
}
    return lists;
    }
}
