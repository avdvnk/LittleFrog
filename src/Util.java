import java.util.*;

public class Util {
    static double mathExpect(ArrayList<Double> input){
        double res = 0;
        HashMap<Double, Integer> values = getP(input);
        for (Map.Entry<Double, Integer> entry: values.entrySet()) {
            res += entry.getKey() * entry.getValue() / input.size();
        }
        return res;
    }
    static double dispersion(ArrayList<Double> input){
        double res = 0;
        double mathEx = mathExpect(input);
        HashMap<Double, Integer> values = getP(input);
        for (Map.Entry<Double, Integer> entry : values.entrySet()) {
            res += Math.pow((entry.getKey() - mathEx), 2) * entry.getValue() / input.size();
        }
        return res;
    }
    private static HashMap<Double, Integer> getP(ArrayList<Double> input){
        HashMap<Double, Integer> values = new HashMap<>();
        for (Double tmp: input) {
            if (values.containsKey(tmp)){
                values.put(tmp, values.get(tmp) + 1);
            }
            else{
                values.put(tmp, 1);
            }
        }
        return values;
    }
    static double correlation(ArrayList<Double> input, int s, int r){
        double R = 0;
        for (int i = 0; i < input.size() - s; i++) {
            R += input.get(i) * input.get(i + s);
        }
        R *= 12;
        R = R / (Math.pow((double)2, r - 2) - s);
        R -= 3;
        return R;
    }
    static ArrayList<Integer> frequency(ArrayList<Double> input){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            res.add(0);
        }
        for (Double value: input){
            int tmp = (int)(value * 10);
            res.set(tmp, res.get(tmp) + 1);
        }
        return res;
    }
}
