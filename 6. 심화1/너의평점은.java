import java.io.*;
import java.util.*;

public class 너의평점은 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        float creditSum = 0;
        double cgSUM = 0.0;
        double totalCredit = 0.0;
        for(int i = 0; i<20; i++){
            String[] strArr = br.readLine().split(" ");
            double credit = Double.parseDouble(strArr[1]);
            
            String grade = strArr[2];
            double gradeInNum = 0.0;
            
            if(grade.equals("P")){
                continue;
            }
            else{
                switch (grade) {
                    case "A+":
                        gradeInNum = 4.5;
                        break;
                    case "A0":
                        gradeInNum = 4.0;
                        break;

                    case "B+":
                        gradeInNum = 3.5;
                        break;
                    case "B0":
                        gradeInNum = 3.0;
                        break;

                    case "C+":
                        gradeInNum = 2.5;
                        break;
                    case "C0":
                        gradeInNum = 2.0;
                        break;

                    case "D+":
                        gradeInNum = 1.5;
                        break;
                    case "D0":
                        gradeInNum = 1.0;
                        break;

                    case "F":
                        gradeInNum = 0.0;
                        break;

                    default:
                        break;
                }
            }
            cgSUM += credit * gradeInNum;
            totalCredit += credit;
        }
        System.out.printf("%.6f", cgSUM/totalCredit);
    }
}
