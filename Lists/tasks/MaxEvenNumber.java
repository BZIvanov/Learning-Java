import java.util.List;

public class MaxEvenNumber {
    public static int findMaxEvenNumber(List<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            return 0;
        }
        
        return numbers.stream().filter(e -> e % 2 == 0).max(Integer::compare).orElse(0);
    }

    public static void main(String[] args) {
        // test case 1 - normal list
        List<Integer> numbers = List.of(2, 15, 5, 4, 5, 8, 10);
        int result = findMaxEvenNumber(numbers);
        System.out.println(result); // 10

        // test case 2 - no even number
        numbers = List.of(1, 3, 5, 7, 9);
        result = findMaxEvenNumber(numbers);
        System.out.println(result); // 0

        // test case 3 - empty list
        numbers = List.of();
        result = findMaxEvenNumber(numbers);
        System.out.println(result); // 0

        // test case 4 - null list
        numbers = null;
        result = findMaxEvenNumber(numbers);
        System.out.println(result); // 0
    }
}
