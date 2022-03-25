package techcourse.fp.mission;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class StreamStudy {

//    public static long countWords() throws IOException {
//        String contents = Files.readString(Paths
//            .get("src/main/resources/fp/war-and-peace.txt"));
//        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));
//
//        long count = 0;
//        for (String w : words) {
//            if (w.length() > 12) count++;
//        }
//        return count;
//    }

    public static long countWords() throws IOException {
        String contents = Files.readString(Paths
                .get("src/main/resources/fp/war-and-peace.txt"));
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        return words.stream()
                .filter(word -> word.length() > 12)
                .count();
    }

//    public static List<Integer> doubleNumbers(List<Integer> numbers) {
//        List<Integer> result = new ArrayList<>();
//        for (Integer number : numbers) {
//            result.add(2 * number);
//        }
//
//        return result;
//    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * 2)
                .collect(toList());
    }

//    public static long sumAll(List<Integer> numbers) {
//        int result = 0;
//
//        for (Integer number : numbers) {
//            result += number;
//        }
//
//        return result;
//    }

    public static long sumAll(List<Integer> numbers) {
        return numbers.stream()
                .reduce((a, b) -> a + b)
                .get();
    }

    public static long sumOverThreeAndDouble(List<Integer> numbers) {
        return 0L; // TODO: 이 부분을 구현한다.
    }

    public static void printLongestWordTop100() throws IOException {
        String contents = Files.readString(Paths
            .get("src/main/resources/fp/war-and-peace.txt"));
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        System.out.println(words);
        System.out.println(words.size());
        // TODO 이 부분에 구현한다.
    }
}
