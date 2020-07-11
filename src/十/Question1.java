/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Question1
 * Author:   李佳佳同学
 * Date:     2020/7/11 21:17
 * Description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。     示例:  给定 nums = [2, 7, 11, 15], target = 9  因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 十;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。  你可以假设每种输入只会对应一个答案。
 * 但是，数组中同一个元素不能使用两遍。     示例:  给定 nums = [2, 7, 11, 15], target = 9  因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author 李佳佳同学
 * @create 2020/7/11
 * @since 1.0.0
 */
public class Question1 {

    public int[] twoSum1(int [] nums, int target){
        int lan=nums.length;
        for(int i=0;i<lan-1;i++){
            for(int j=i+1;j<lan;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no solution");


    }


    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int ss=target-nums[i];
            if(map.containsKey(ss)&&map.get(ss)!=i){
                return new int[]{i,map.get(ss)};
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    public int[] twoSum3(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int ss=target-nums[i];
            if(map.containsKey(ss)){
                return new int []{map.get(ss),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no solution");
    }

    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(1,1);
        map.put(1,2);
        //会更新。

        System.out.println(map.get(1)); //2
    }
}
