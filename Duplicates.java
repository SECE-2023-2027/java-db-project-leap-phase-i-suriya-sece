import java.util.ArrayList;

public class Duplicates {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
      System.out.println("Duplicate values:");
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int count = 0;
              for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == current) {
                    count++;
                }
            }

            
            if (count > 1) {
                System.out.println(current);
                
                
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(k) == current) {
                        list.set(k, 0);  
                    }
                }
            }
        }
    }
}