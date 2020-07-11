/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: Question2
 * Author:   李佳佳同学
 * Date:     2020/7/11 22:45
 * Description: 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。  如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。  您可以假设除了数字 0 之外，这两个数都不会以 0 开头。  示例：  输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/add-two-numbers 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。  如果，我们将这两个数相加起
 * 来，则会返回一个新的链表来表示它们的和。  您可以假设除了数字 0 之外，这两个数都不会以 0 开头。  示例：  输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8 原因：342 + 465 = 807  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/add-two-numbers 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。〉
 *
 * @author 李佳佳同学
 * @create 2020/7/11
 * @since 1.0.0
 */

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }



public class Question2 {


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode(0);
        ListNode cur=pre;
        //进位
        int carry=0;
        while(l1!=null||l2!=null){
            int x=l1==null?0:l1.val;
            int y=l2==null?0:l2.val;
            int sum=carry+x+y;

            carry=sum/10;
            sum=sum%10; //取个位数。

            cur.next=new ListNode(sum);
            cur=cur.next;

            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        //当到最后一次相加有进位的时候，那么在最后一位还要加上1.
        if(carry==1)
        {
            cur.next=new ListNode(1);
        }

        return pre.next; //第一位是0；
    }

}
