import java.io.BufferedReader;
import java.io.*;

public record 크로아티아_3() {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] KroArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i< KroArr.length; i++){
            if(str.contains(KroArr[i])){
                str = str.replace(KroArr[i], "!");
            }
        }
        System.out.println(str.length());
        br.close();
    }
}
