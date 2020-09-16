/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top21
 * Author:   李佳佳同学
 * Date:     2020/9/16 22:57
 * Description: 合并两个有序链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 三十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈合并两个有序链表〉
 *
 * @author 李佳佳同学
 * @create 2020/9/16
 * @since 1.0.0
 */
 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class top21 {
 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
           l2.next= mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
