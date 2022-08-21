package Gun27._02_Ornek;

public class Rectangle {
    int width;
    int length;

    public void Cevre()
    {
        System.out.println("cevre = " +
                ((width+length)*2));
    }

    public void Alan()
    {
        System.out.println("alan = " +
                (width*length));
    }

    public int Alan2()
    {
        return (width*length);
    }

    public void kosegenSayisi()
    {
        System.out.println(2);
    }

}
