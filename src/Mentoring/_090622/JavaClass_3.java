package Mentoring._090622;

import java.util.Arrays;

public class JavaClass_3 {

    //  TODO  Create a class called 'Matrix' containing constructor
//    that initializes the number of rows and number of columns
//    of a new Matrix object. The Matrix class has the following information:
//    1 - number of rows of matrix
//    2 - number of columns of matrix
//    3 - elements of matrix in the form of 2D array
    public static void main(String[] args) {

        Matrix matrix = new Matrix();

        for (int i = 0; i < matrix.array.length; i++) {
            System.out.println(Arrays.toString(matrix.array[i]));
        }
    }
}
