package Gun20;

public class _01_Tablo {
    public static void main(String[] args) {
        int[][] tablo=
                {
                        {1,2,3,4},  // tablo[0]
                        {1,2},      // tablo[1]
                        {6,7,55,78,89},  // tablo[2]
                        {8,9,45}    // tablo[3]
                };

        for(int i=0;i<tablo.length;i++)
        {
            for(int j=0;j<tablo[i].length ;j++)
                System.out.print(tablo[i][j]+" ");

            System.out.println();
        }
    }
}
