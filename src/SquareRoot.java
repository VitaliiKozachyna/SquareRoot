import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num = scn.nextDouble();
        double y_prev = 1;
        double y_next;
        double epsilon;
        int count = 0;

        while(true){
            if (num > 0 ){
                y_next = (num/y_prev + y_prev)/2;
                epsilon = y_prev - y_next;
                y_prev = y_next;

                count++;
                if ((count > 1) && (epsilon < 0.0001)) {
                    System.out.println("square root of " + num + " equals " + y_next);
                    System.out.println("count = " + count);
                    System.out.println("epsilon = " + epsilon);
                    break;
                }
            } else if (num == 0) {
                System.out.println("square root of " + num + " equals " + num);
                break;
            } else if (num < 0){

//                y_next = ((-num)/y_prev + y_prev)/2;
//                epsilon = y_prev - y_next;
//                y_prev = y_next;
//
//                count++;
//                if ((count > 1) && (epsilon < 0.0001)) {
//                    System.out.println("square root of " + num + " equals " + y_next + "i");
//                    System.out.println("count = " + count);
//                    break;
//                }

                throw new IllegalArgumentException();
            }
        }
    }
}
