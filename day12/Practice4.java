class c1 extends Calculator{
    int p,a;
    public void print(){
        System.out.println(p);
        System.out.println(a);
    }
}

public class Practice4 {
    public static void main(String[] args) {
        c1 c=new c1();
        c.print();
    }
}
