/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: top19
 * Author:   李佳佳同学
 * Date:     2020/9/16 21:25
 * Description: 倒数第K个结点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 二十;

/**
 * 〈一句话功能简述〉<br> 
 * 〈倒数第K个结点〉
 *给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @author 李佳佳同学
 * @create 2020/9/16
 * @since 1.0.0
 */
public class top19 {
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=new ListNode(0);
        pre.next=head;


        ListNode end=pre;
        ListNode start=pre;

        while(n!=0){
            //假定链表是有效的。
            end=end.next;
            n--;
        }
        //经过前一歌步骤，那么end所在的位置就是倒数的第n个结点的前一个结点。
        //那么现在开始第二个索引也开始移动
        while(end.next!=null){
            end=end.next;
            start=start.next;
        }
        //因为他们相距有n，所以此时start的位置就是倒数第N的前一个结点.
        start.next=start.next.next;
        //pre指向的是head;
        return pre.next;
    }
}
