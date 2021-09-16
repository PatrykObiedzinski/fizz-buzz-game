import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FizzBuzzGame {

    private static FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

    public static void main(String[] args) {

        List<String> fizzBuzzNumbers = IntStream.rangeClosed(1, 100)
                .mapToObj(fizzBuzzGenerator::getNext)
                .collect(toList());

        System.out.println(fizzBuzzNumbers);

    }
}
