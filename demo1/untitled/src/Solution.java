public class Solution {
    private int tuSo;
    private int mauSo;

    public Solution (int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo != 0){
            this.mauSo = mauSo;
        } else {
            System.out.println("Mau so khong hop le!");
        }
    }


    public double calculator () {
        if (mauSo!=0) {
            return (double) tuSo/mauSo;
        }
        return 0;
    }

}

public class Main {
    public static void main(String[] args) {
        Solution a = new Solution(1,0);
        System.out.println(a.calculator());
    }
}
