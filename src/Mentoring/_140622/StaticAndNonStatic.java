package Mentoring._140622;

public class StaticAndNonStatic {


    void nonStatic(){
        staticMethod();
        none_staticMethod();
    }

    static void anastaticMethod(){
        staticMethod();

        StaticAndNonStatic staticAndNonStatic = new StaticAndNonStatic();
        staticAndNonStatic.none_staticMethod();

    }


    static void staticMethod (){
        System.out.println("static method çalıştı");
    }

    void none_staticMethod (){
        System.out.println("static olmayan method çalıştı");
    }
}

