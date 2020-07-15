/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top16
 * Author:   李佳佳同学
 * Date:     2020/7/15 13:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author 李佳佳同学
 * @create 2020/7/15
 * @since 1.0.0
 */
public class top16 {
    public int threeSumClosest(int[] nums, int target) {
        //排序
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        //i<nums.length并不影响，因为下边还会限制，不会越界。
        for(int i=0;i<nums.length;i++){
            int start=i+1;
            int end=nums.length-1;

            while(start < end){
                int sum=nums[i]+nums[start]+nums[end];
                if(Math.abs(target-sum)<Math.abs(target-ans))
                    ans=sum;
                else if(sum<target)
                    start++;
                else if(sum>target)
                    end--;
                else  {
                    //相等的情况。
                    return ans;
                }
            }

        }
        return ans;
    }
}
