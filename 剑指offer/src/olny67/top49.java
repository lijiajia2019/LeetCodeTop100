/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top49
 * Author:   李佳佳同学
 * Date:     2020/9/18 21:19
 * Description: asfa
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package olny67;

/**
 * 〈一句话功能简述〉<br> 
 * 〈asfa〉
 *
 * @author 李佳佳同学
 * @create 2020/9/18
 * @since 1.0.0
 */
public class top49 {
    //https://leetcode-cn.com/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/solution/mian-shi-ti-67-ba-zi-fu-chuan-zhuan-huan-cheng-z-4/

    //int 类型：-2147483648, 2147483647
    public int StrToInt(String str) {
      int len=str.length();
      if(len==0 || str==null){
            return 0;}
      int flag=1;
      int i=0;
      char [] ch=str.trim().toCharArray();
      if(ch[i]=='-'){flag=-1 ;}
      if(ch[i]=='+' || ch[i]=='-') {++i;}
       int b=Integer.MAX_VALUE/10;
        //结果
       int res=0;
      while(i<len){
          //提取每个char的值，判断它是不是字符串.
      int num=ch[i]-'0';
       if(num>=0 &&num<=9){//是数字
           if(res>b ||(res==b&& num>7)){
               return 0;
           }
           res=res*10+num;
           i++;
       }else {
           return 0;
       }

      }
        return flag*res;
    }
}
