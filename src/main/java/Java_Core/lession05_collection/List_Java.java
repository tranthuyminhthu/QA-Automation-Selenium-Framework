package Java_Core.lession05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Java {
    int a = 8;

    List<String> arrayList = new ArrayList<>();

    public List<String> list_java() {
        arrayList.addAll(Arrays.asList("1", "2", "3"));
        return arrayList;
    }

    public static void main(String[] args) {
        List_Java list = new List_Java();
        ArrayList<Integer> in = new ArrayList<>();
        in.addAll(Arrays.asList(1,2,3,4));
        //  System.out.println(list.sum(11));
        //  System.out.println(list.average(Arrays.asList(1,2,3)));
       // System.out.println(list.maxium(Arrays.asList(-1, -2, 0)));
        System.out.println(list.daonguoc(in));
    }

    public int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        return sum;
    }

    public double average(List<Integer> listIn) {
        double sum = 0;
        for (int i = 0; i < listIn.size(); i++) {
            sum += listIn.get(i);
        }
        return sum / listIn.size();
    }

    public double maxium(List<Integer> listIn) {
        int a = listIn.get(0);
        for (int i = 0; i < listIn.size(); i++) {
            if (listIn.get(i) > a) {
                a = listIn.get(i);
            }
        }
        return a;
    }

    // dung interface interator
    // lay ra tat ca chu cai

    public String language(List<String> listLanguage) {
        Iterator<String> iterator = listLanguage.iterator();
        String name = "";
        while (iterator.hasNext()) {
             name = iterator.next();
            System.out.println(name);

        }
        return name;
    }

    // dao nguoc mang

    public ArrayList<Integer> daonguoc (ArrayList<Integer> number){
        ArrayList<Integer> list = new ArrayList();
        for (int i =number.size()-1; i>=0; --i){
            list.add(number.get(i));
        }
        return list;
    }
}
