/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top11
 * Author:   李佳佳同学
 * Date:     2020/7/13 19:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 李佳佳同学
 * @create 2020/7/13
 * @since 1.0.0
 */
public class top11 {
    public int maxArea(int[] height) {
        int ans=0;
        int r=height.length-1;
        int l=0;
        while(l<r){
            int ji=(r-l)*Math.min(height[l],height[r]);
            ans=Math.max(ans,ji);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}
