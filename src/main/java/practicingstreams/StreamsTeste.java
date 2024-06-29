package practicingstreams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTeste {

    public static List<Integer> filterEvenMultiplyPer2(List<Integer> list){

        List<Integer> newList = list.stream()
                                    .filter(n -> n % 2 == 0)
                                    .map(n -> n * 2)
                                    .toList();


        return newList;
    }

    public static int sumAllOddNumbers(List<Integer> list){

        return list.stream()
                   .filter(e -> e % 2 != 0)
                   .reduce(0, (integer, integer2) -> {return integer + integer2;});
    }
    public static Map<String, Integer> findMinAndMax(List<Integer> list){

        Integer min = list.stream().mapToInt(e -> e).min().getAsInt();

        Integer max = list.stream().mapToInt(e -> e).max().getAsInt();

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Min=", min);
        map.put("Max=", max);

        return map;
    }

    public static String concatStrings(List<String> list){

        String phrase = list.stream().collect(Collectors.joining(","));

        return phrase;
    }
    public static List<Integer> orderIntegerList(List<Integer> list){

        List<Integer> newList = list.stream().sorted().toList();

        return newList;
    }

    public static List<Integer> removeDuplicates(List<Integer> list){

        List<Integer> newList = list.stream().distinct().toList();

        return newList;
    }

    public static int firstElement(List<Integer> list){

        int num = list.stream().filter(e -> e > 5).findAny().get();

        return num;
    }

    public static int countAllChars(List<String> words){

        return words.stream()
             .mapToInt(String::length)
             .sum();
    }

    public static List<Integer> findNegativeNumber(List<Integer> list){

        return list.stream().filter(e -> e != Math.abs(e)).toList();
    }
    public static Map<String, Integer> convertListToMap(List<String> list){

        return list.stream()
                .collect(Collectors.toMap(str -> str, str -> str.length()));
    }

    public static boolean hasNumberGraterThanTen(List<Integer> list){

        return list.stream().anyMatch(e -> e > 10);
    }

    public static Double calculateAverage(List<Integer> list){

        return list.stream().collect(Collectors.averagingDouble(e -> e));

    }
}
