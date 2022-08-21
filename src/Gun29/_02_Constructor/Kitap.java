package Gun29._02_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;

   // Yapıcı metod : Constructor metod
    public Kitap() {// 1.Constructor
    }

    // 2.Constructor
    public Kitap(String name, int publishYear, String author) {
       this.name=name;
       this.publishYear=publishYear;
       this.author=author;
    }

    // 3.Constructor
    public Kitap(String name, int publishYear) {
        this.name=name;
        this.publishYear=publishYear;
        this.author="";
    }

    public void Yazdir(){
        System.out.println(name+" "+publishYear+" "+author);
    }

    public String toString(){
        return name+" "+publishYear+" "+author;
    }
}
