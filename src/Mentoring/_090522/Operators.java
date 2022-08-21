package Mentoring._090522;

public class Operators {
    public static void main(String[] args) {
        /**
         * Java Operators**
         * Javada 5 çeşit operator tipi vardır
         * 1- Arithmetic Operators
         * 2- Assignment Operators
         * 3- Relational Operators (Comparison Operators)
         * 4- Mantıksal Operatorler
         * 5- Ternary Operatörü
         * 6- ?
         */

        /**  Aritcmetic Operator   **/
        /**
         *  Toplama = "+"   (Addition)
         *  Çıkarma = "-"   (Subtraction)
         *  Çartpma = "*"   (Multiplication)
         *  Bölme = "/"     (Division)
         *  Mod = "%"       (Modulo Operation (Remainder after division))
         */
        int a = 12,b=5;
        // *  Toplama = "+"   (Addition)
        System.out.println("a+b = " + (a+b));
        //  *  Çıkarma = "-"   (Subtraction)
        System.out.println("a-b = " + (a-b));
        //*  Çartpma = "*"   (Multiplication)
        System.out.println("a*b = " + (a*b));
        // *  Bölme = "/"     (Division)
        System.out.println("(a/b) = " + (a/b));
        //*  Mod = "%"       (Modulo Operation (Remainder after division))
        System.out.println("(a%b) = " + (a%b));

        /**  Assignment Operator   **/
        /**
         *  =
         *  +=
         *  -=
         *  *=
         *  /=
         *  %=
         */
        int f = 12, m = 4;
        // f = f+5;
        f+=5;
        System.out.println("f = " + f);
        f-=4;
        System.out.println("f = " + f);
        f*=2;
        System.out.println("f = " + f);
        f/=4;
        System.out.println("f = " + f);
        f%=1;
        System.out.println("f = " + f);


        /** 3- Relational Operators (Comparison Operators) **/
        /**
         *  == (mi)  (Is Equal To)
         *  != (mi)  (Not Equal To)
         *  >  (mü)  (Greater Than)
         *  <  (mü)  (Less Than)
         *  >= (mi)  (Greater Than or Equal To)
         *  <= (mi)  (Less Than or Equal To)
         */
        boolean equalTo = 3==5;
        System.out.println("equalTo = " + equalTo); //false
        boolean notEqualTo = 3!=5;
        System.out.println("notEqualTo = " + notEqualTo); //true
        boolean greaterThan = 3>5;
        System.out.println("greaterThan = " + greaterThan);//false
        boolean lessThan = 3<5;
        System.out.println("lessThan = " + lessThan);//true
        boolean greaterThanOrEqual = 3>=5;
        System.out.println("greaterThanOrEqual = " + greaterThanOrEqual);//false
        boolean lessThanOrEqual = 3<=5;
        System.out.println("lessThanOrEqual = " + lessThanOrEqual);//true

    }




}
