class linkd_list{
    public static void main(String[] args){
        node head = new node();
        node sec = new node();
        node thi = new node();

        head.data = 10;
        sec.data = 20;
        thi.data = 30;

        head.next = sec;
        sec.next = thi;
        thi.next = null;

        printlist(head);
    }

   

    public static void printlist(node head){
        while(head.next !=null){
            System.out.println(head.data);
            head = head.next;
        }
        //print the last element
        System.out.println(head.data);
    }
}

public class node{
    int data;
    node next;
    
   
}