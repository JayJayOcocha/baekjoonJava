import java.io.*;

public class 크로아티아_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            // System.out.println(i);
            if(str.charAt(i) == 'c'){
                if(str.charAt(i+1) == '='){
                    count++;
                    i++;
                }
                else if(str.charAt(i+1) == '-'){
                    count++;
                    i++;
                }
                else{
                    count++;
                }
            }
            else if(str.charAt(i) == 'l'){
                if(str.charAt(i+1) == 'j'){
                    count++;
                    i++;
                }
                else{
                    count++;
                }
            }
            else if(str.charAt(i) == 'n'){
                if(str.charAt(i+1) == 'j'){
                    count++;
                    i++;
                }
                else{
                    count++;
                }
            }
            else if(str.charAt(i) == 's'){
                if(str.charAt(i+1) == '='){
                    count++;
                    i++;
                }
                else{
                    count++;
                }
            }
            else if(str.charAt(i) == 'z'){
                if(str.charAt(i+1) == '='){
                    // System.out.println(str.charAt(i));
                    count++;
                    i++;
                }
                else{
                    count++;
                }
            }
            else if(str.charAt(i) == 'd'){
                if(str.charAt(i+1) == 'z'){
                    if(str.charAt(i+2) == '='){
                        count++;
                        i+=2;
                        // System.out.println(count);
                        // System.out.println(str.charAt(i));
                    }
                    else{
                        count++;
                        i++;
                        // System.out.println(str.charAt(i));
                    }
                }
                else{
                    count++;
                }
            }
            
            else{
                count++;
            }
            
            
        }
        
        System.out.println(count);
    }
}
