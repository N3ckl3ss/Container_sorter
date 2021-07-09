import java.util.Scanner;
import java.util.*;

public class Konteneroszlop {
    
        List<Stack<Integer>> columns;

    Konteneroszlop() {
            this.columns = new ArrayList<>();
        }

    void addStack(){
        this.columns.add(new Stack<>());
    }
    void addElement(int stackIndex, int element) {
        this.columns.get(stackIndex).add(element);
    }

    public int peekElement(int stackIndex) {
         return this.columns.get(stackIndex).peek();
    }
    public boolean cheack(){
        return this.columns.isEmpty();
    }
    public  int numOfStacks(){
        return this.columns.size();
    }

    static List<Integer> makingRows(int spaceLimit,int[] c) {
        List<Integer> ans = new ArrayList<>();
        Konteneroszlop list =  new Konteneroszlop();

        for(int container : c){
            boolean getsIn = false;
            if(list.cheack()){
                list.addStack();
                list.addElement(0,container);
                ans.add(1);
            }else{
                for(int i = 0; i < list.numOfStacks(); i++){
                    if(list.peekElement(i) >= container && !getsIn){
                        list.addElement(i,container);
                        ans.add(i+1);
                        getsIn = true;
                    }
                }
                if(!getsIn){
                    list.addStack();
                    list.addElement(list.numOfStacks()-1, container);
                    ans.add(list.numOfStacks());
                }
            }
        }
        int amount = list.numOfStacks();
        if(amount > spaceLimit){
            List<Integer> error = new ArrayList<>();
            System.out.println("Not Enough Space");
            return error;
        }
        System.out.println(amount);
        return ans;

    }

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        List<Integer> results = makingRows(k,c);
        for(int result :results){
            System.out.print(result+" ");
        }

        scanner.close();
    }
}