package Gun40.Ornek3;

class C{
  public C(){ System.out.println("C "); }
}

class B extends C{
    public B(){
//        super();
        System.out.println("B ");
    }
}

class A extends B{
    public A(){
//        super();
        System.out.println("A ");
    }
}

public class Soru {
    public static void main(String[] args) {
         A a=new A();  // Soru Main çalıştırılınca çıktısı ne olur ?
    }
}
