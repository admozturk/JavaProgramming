package day8_LogicalOperators_IfStatements;

public class Grade_Level2 {
    public static void main(String[] args) {

      byte grade = 14;

      boolean elementary = grade >=1 && grade <=5;
      boolean middleSchool = grade >=6 && grade <=8;
      boolean highSchool = grade >=9 && grade <=12;
      boolean college = grade >=13 && grade <=16;
      boolean gradSchool = grade >=17 && grade <=18;

      if (elementary){
          System.out.println("School type is elementary ");
      }
        if (middleSchool){
            System.out.println("School type is middleSchool");
        }
        if (highSchool){
            System.out.println("School type is highSchool");
        }
        if (college){
            System.out.println("School type is college");
        }
        if (gradSchool){
            System.out.println("School type is gradSchool");
        }



    }
}
