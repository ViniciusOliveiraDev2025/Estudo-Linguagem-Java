package Arrays;

public class foreach {
    public static void main(String[] args) {
        double[] arrs = {5.0, 7.0, 9.0};

        for(double arr: arrs){
            System.out.println(arr + " ");
        }
        System.out.println();
        for(int i = 0; i < arrs.length; i++){
            System.out.println(arrs[i] + " ");
        }
    }
}
