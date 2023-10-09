import java.util.ArrayList;

public class FindNum {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean numberInInterval(int n) { 
        boolean result = false;
        int a = 24;
        ArrayList<Integer> spisok = new ArrayList<>();
        while(a < 101){
            a = a + 1;
            spisok.add(a);
        }
        for (int i = 0; i < spisok.size(); i++){
            if (n == spisok.get(i)) {
                result = true;
            }
        }
        return result;
    }
}
