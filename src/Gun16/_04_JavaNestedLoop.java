package Gun16;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1

      for(int j=5;j>0; j--) {

          for (int i = 1; i <= j; i++)
              System.out.print("*");

          System.out.println();
      }






    }
}
