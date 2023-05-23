class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode();
        ListNode result=dummy;
        int carry=0;
        while(temp1!=null || temp2!=null || carry>0){
            int sum=0;
            if(temp1!=null){
                sum=sum+temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum=sum+temp2.val;
                temp2=temp2.next;
            }
            sum+=carry;
            int mod=sum%10;
            ListNode node=new ListNode(mod);
            result.next=node;
            result=result.next;
            carry=sum/10;
        }
        return dummy.next;
    }
}
