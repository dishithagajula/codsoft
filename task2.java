import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of subjects");
        int n=s.nextInt();
        String result,grade;
        List<Integer> marks = new ArrayList<>();
        for(int i=1;i<=n;i++){
            System.out.println("Enter subject "+i+"marks out of 100");
            marks.add(s.nextInt());
        }
        int total_marks=marks.stream().mapToInt(Integer::intValue).sum();
        int avg_per=total_marks/n;
        if(avg_per>90){
            result="PASS";
            grade="O - Out Standing";
        }
        else if(avg_per>=80){
            result="PASS";
            grade="A+ - Excellent ";
        }
        else if(avg_per>=70){
            result="PASS";
            grade="A - Very Good";
        }
        else if(avg_per>=60){
            result="PASS";
            grade="B+ - Good";
        }
        else if(avg_per>=50){
            result="PASS";
            grade="B - Above Average";
        }
        else if(avg_per>=40){
            result="PASS";
            grade="C - Average";
        }
        else{
            result="FAIL";
            grade="F";
        }
        System.out.println("******** Student Report**********");
        System.out.println("Total Marks student achieved :"+total_marks);
        System.out.println("Average Percentage:"+avg_per+"%");
        System.out.println("Result :"+result);
        System.out.println("Grade :"+grade);
    }
}
