import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LittleFrog lf = new LittleFrog();
        ArrayList<Double> z = new ArrayList<>();
        for (int i = 0; i < (int)Math.pow(2, lf.getR() - 2); i++) {
            z.add(lf.getZ(i));
        }
        double math = Util.mathExpect(z);
        System.out.println("Math expection: " + math);
        double dispersion = Util.dispersion(z);
        System.out.println("Dispersion: " + dispersion + "\n");
        ArrayList<Integer> freq = Util.frequency(z);
        System.out.println(freq.toString());
        System.out.println(Util.correlation(z, 2, lf.getR()) + "\n");
        for (int i = 4; i < 15; i++) {
            LittleFrog test = new LittleFrog();
            test.setR(i);
            ArrayList<Double> seq = new ArrayList<>();
            for (int j = 0; j < Math.pow(2, test.getR() - 2); j++) {
                seq.add(test.getZ(j));
            }
            System.out.println(Util.correlation(seq, 2, test.getR()));
        }
    }
}
