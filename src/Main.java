public class Main {
    public static void main(String[] args) {
        int z = 1100;
        int k = 400;
        int f = 0;
        if (k>1000) {
             z += k/100;
             f = k/100;
        }
        System.out.println(z);
        System.out.println(f);
    }
}