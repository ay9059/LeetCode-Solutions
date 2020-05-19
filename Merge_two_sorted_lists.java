class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //check if one of the nodes is null, then return the non null node
        if(l1==null || l2==null){
            ListNode lik;
           if(l1!=null){
               return l1;
           }else{
               return l2;
           }
        }
        
        ListNode li = new ListNode();
        ListNode pointer = li;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                pointer.next = l1;
                l1=l1.next;
            }else{
                pointer.next=l2;
                l2=l2.next;
           }
             pointer = pointer.next;
        }
             pointer.next = l1 != null ? l1 : l2;
             return li.next;
    }
}