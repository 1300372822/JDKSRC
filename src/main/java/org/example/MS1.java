package org.example;

import java.util.*;

public class MS1 {
    public static void main(String[] args) {

        String str ="In school and life, the most.";
        String s = str.replaceAll(".", ";");
        System.out.println(s);
        test("In school and life, the most important driving force of work is the pleasure in work, the pleasure of working as a result, and the recognition of the social value of this result.");
    }
    public static void test(String str){
        String s = str.replaceAll(",", "");
        String s1 = s.replace(".", " ");
        String[] array = s1.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],(map.get(array[i])+1));
            }
            else {
                map.put(array[i],1);
            }
        }
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()){
            String next = iterator.next();
            list.add(map.get(next));
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        int count1=0;
        int count2=0;
        int count3=0;
        String str1="";
        String str2="";
        String str3="";
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();

            if (list.get(0)==next.getValue()){
                str1 = next.getKey();
                count1 = next.getValue();
            }
            if (list.get(1)==next.getValue()){
                str2 = next.getKey();
                count2 = next.getValue();
            }
            if (list.get(2)==next.getValue()){
                str3 = next.getKey();
                count3 = next.getValue();
            }
        }
        System.out.println(str1+"="+count1);
        System.out.println(str2+"="+count2);
        System.out.println(str3+"="+count3);

    }

}
