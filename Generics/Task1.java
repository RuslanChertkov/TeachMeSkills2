package Generics;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        List <String> list = new ArrayList<>();
        rawList = list;
        rawList.add(8);
        String s = list.get(0);
        System.out.println(s);
    }
}
