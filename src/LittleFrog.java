import java.util.ArrayList;

class LittleFrog {
    private int r = 8;
    private static final int m = 16;
    private static final int M = 9973;
    private ArrayList<Integer> a;
    LittleFrog(){
        a = new ArrayList<>();
        a.add(1);
    }
    private Integer getA(int i){
        a.add((a.get(i) * M) % (int)Math.pow((double)2, r));
        return a.get(i);
    }
    double getZ(int k){
        return getA(k) * Math.pow((double)2, -(r));
    }
    int getR () {
        return r;
    }
    void setR(int r){
        this.r = r;
    }
}
