class linked_insert_at_end{
    public static void main(String[] args){
    node head = new node();
    head = insert_at_end(head, 10);
    head = insert_at_end(head,210);
    head = insert_at_end(head,310);
    head = insert_at_end(head,410);
    
    printlist(head);
    

    }

    public static node insert_at_end(node head,int data){
        node temp = new node();

        temp.data = data;
        if(head == null){
            temp.next = null;
            head= temp;
            return head;
        }
        node newa = new node();
        newa = head;
        while(newa.next != null){
            newa= newa.next;
        }
        newa.next = temp;
        temp.next = null;
        return head;
        
    }
    public static void printlist(node head){
        System.out.println("Element in List :");
        while(head.next != null){
            System.out.println(head.data);
            head = head.next;
        }

        //print last element
        System.out.println(head.data);
    }
}

class node{
    int data;
    node next;
}