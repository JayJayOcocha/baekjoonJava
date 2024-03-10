import java.io.*;

public class 나머지 {
    public static void main(String[] args) throws IOException{

        // System.out.println(85%42);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for(int i = 0; i< 10; i++){
            arr[i] = (Integer.parseInt(br.readLine()))%42;
        }

        // 5597번 문제와 비슷한 알고리즘으로 풀어봤다.
        // n % 42는 총 0-41, 42개의 나머지가 경우의 수로 나온다.
        // 그렇기에 나머지로 나올 숫자들의 개수를 세어보고
        // count가 0이 아닐 경우에는 count의 수를 늘려주었다.
        // 왜냐하면 count가 0이 아니란 말은, 그만큼의 서로 다른 나머지가 있다는 뜻이니깐
        int[] arr2 = new int[42];
        for(int i = 0; i< 10; i++){
            arr2[arr[i]]++;
        }
        int count = 0;
        for(int i = 0; i<=41; i++){
            if(arr2[i] != 0){
                count ++;
            }
        }
        System.out.println(count);
    }   
}
