package Gun44;

public class S23 {
    public static void main(String[] args) {
        int[] stack={10,20,30};

        int size=3;
        int idx=0;

        /*******/
        do {
            idx++;
        }while(idx < size-1);
        /*******/

        System.out.println("the top element "+ stack[idx]);
    }
}
