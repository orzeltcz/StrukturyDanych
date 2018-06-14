package task12;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedHashMap;
import java.util.Map;

public class Fibonacci {
private static Map<Integer,Long> countedFib = new LinkedHashMap<>();
    public long licz (int a) {

            if (a == 0) {
                return 0;
            } else if (a == 1) {
                return 1;
            } else {
                if(countedFib.containsKey(a)) return countedFib.get(a);
              else  return licz(a - 1) + licz(a - 2);
            }
    }
        public void print(int count){

        }

    public static void main(String[] args) {
        long before,after;
        int couter=100;
        Long sum;
        Fibonacci fib = new Fibonacci();
        for (int i = 0; i <= couter; i++) {
            countedFib.put(i,fib.licz(i));
            before = System.currentTimeMillis();
            System.out.print("Number of element:[" + i + "] => value of: [" + fib.licz(i) + "] => time in ms: [");
            after = System.currentTimeMillis();
            sum = after - before;
            System.out.println(sum + "]");
        }


        }
    }

