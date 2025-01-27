import java.util.List;
import java.util.stream.Collectors;

class ListItemsLength {
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if (courses == null || courses.size() == 0) {
            return List.of();
        }
        
        return courses.stream().map(String::length).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // test case 1 - normal list
        List<String> courses = List.of("Java", "Python", "JavaScript", "C++");
        List<Integer> result = getCourseNameCharacterCount(courses);
        System.out.println(result); // [4, 6, 10, 3]

        // test case 2 - empty list
        courses = List.of();
        result = getCourseNameCharacterCount(courses);
        System.out.println(result); // []

        // test case 3 - null list
        courses = null;
        result = getCourseNameCharacterCount(courses);
        System.out.println(result); // []
    }
}
