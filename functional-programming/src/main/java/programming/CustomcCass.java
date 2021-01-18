package programming;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class course
{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudents=" + noOfStudents +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }


}
public class CustomcCass {

    public static void main(String[] args) {

        List<course> courses=List.of(new course("Spring","Framework",93,54000),
                new course("Spring Boot","Framework",95,32000),
                new course("MS","DevOps",97,40000),
                new course("Java","DevOps",92,10000),
                new course("Full Stack","Framework",91,22000),
                new course("AWS","Cloud",90,22000)
        );

        //IncreasingOrder

        System.out.println(courses.stream().anyMatch(x->x.getReviewScore()>95));
        Comparator<course> comparingByNoofStudents=Comparator.comparing(course::getNoOfStudents);
        System.out.println(courses.stream().sorted(comparingByNoofStudents).collect(Collectors.toList()));

        //DecreasingOrder

        Comparator<course> comparingByNoofStudentsDecreasing=Comparator.comparing(course::getNoOfStudents).reversed();
        System.out.println(courses.stream().sorted(comparingByNoofStudentsDecreasing).collect(Collectors.toList()));

        //Same NoOfStudents But different ReviewScore

        Comparator<course> comparingByNoofStudentsorReviewScore=Comparator.comparing(course::getNoOfStudents).thenComparing(course::getReviewScore);
        System.out.println(courses.stream().sorted(comparingByNoofStudentsorReviewScore).limit(2).collect(Collectors.toList()));
        System.out.println(courses.stream().sorted(comparingByNoofStudentsorReviewScore).skip(3).collect(Collectors.toList()));
        System.out.println(courses);
        //takeWhile Testing
        System.out.println("Hi");
        System.out.println(courses.stream().takeWhile(cs->cs.getReviewScore()>=93).collect(Collectors.toList()));
        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore()>=93)
                        .collect(Collectors.toList()));
        System.out.println(courses.stream().max(comparingByNoofStudentsorReviewScore));

        //Grouping By
        System.out.println("GroupBy");
        System.out.println(courses.stream().collect(Collectors.groupingBy(course::getCategory)));

        System.out.println(courses.stream().collect(Collectors.groupingBy(course::getCategory, Collectors.counting())));

        System.out.println(LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));


    }
}
