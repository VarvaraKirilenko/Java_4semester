import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        ArrayList<Human> array = new ArrayList<>();
        array.add(new Human(22, "Oleg", "Olegov", LocalDate.of(2000, 1, 9), 80));
        array.add(new Human(19, "Nastya", "Kim", LocalDate.of(2002, 10, 10), 57));
        array.add(new Human(12, "Dasha", "Komok", LocalDate.of(2010, 9, 13), 38));
        array.add(new Human(30, "Ivan", "Ivanov", LocalDate.of(1992, 2, 17), 90));
        array.add(new Human(23, "Sergey", "Sergeev", LocalDate.of(1999, 3, 2), 70));

        Stream<Human> stream1 = sortByName(array.stream());
        Stream<Human> stream2 = filterAges(array.stream());
        Stream<Human> stream3 = firstElements(array.stream());
        Optional<Human> res = array.stream().reduce((a, b)-> new Human(0, a.getFirstName() + " " + b.getFirstName(), null, null, 0));
        String names = (String) res.get().getFirstName();


        stream1.forEach(System.out::println);
        System.out.println();
        stream2.forEach(System.out::println);
        System.out.println();
        stream3.forEach(System.out::println);
        System.out.println();
        System.out.println(names);
    }

    public static Stream firstElements(Stream<Human> stream) {
      return stream.limit(3);
  }
    public static Stream sortByName(Stream<Human> stream) {
       return stream.sorted((o1, o2)-> o2.getFirstName().compareTo(o1.getFirstName()));
    }
   public static Stream filterAges(Stream<Human> stream) {
       return stream.filter(str -> str.getAge() > 20);
    }
}
