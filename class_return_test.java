public class class_return_test {
    public static void main (String[] args){
        System.out.println("Testing..");
        node c = test();
        System.out.println("Data :"+c.data+"\n Next :"+c.next);
    }

    public static node test(){
     node temp = new node();
     temp.data=10;
     temp.next = 20;
     return temp;   
    }

}

public class node{
    int data;
    int next;
}
