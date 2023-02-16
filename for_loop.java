class for_loop{
    public static void main(String[] args){
     //for loop
     for(int i=0;i<2;i++){
        System.out.println("For Loop");
     }   

     //while loop
     add_line("while");
     
     int a =0;
     while(a<2){
        System.out.println("While Loop");
        a = a +1;
     }
    }

    public static void add_line(String data){
        System.out.println("======="+data+"=======");
    }
}