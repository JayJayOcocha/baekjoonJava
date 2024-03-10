public class duplicateCheck {
    public boolean dupCheck(String[] arr){
        // int isDup;
        for(int i = 0 ; i < arr.length; i++){
            // isDup = i;
            for(int j = i+1; j < arr.length; j++){
                if(Integer.parseInt(arr[i]) == Integer.parseInt(arr[j])){
                    return true;
                }
            }
        }

        return false;
    }

    public int[] linearSearch(String[] arr){
        int[] retArr = new int[2];
        int retArrIdx = 0;
        for(int i = 0; i < 7; i++){
            for (int j = 0; j < arr.length; j++){
                if(Integer.parseInt(arr[j])!= i +1){
                    retArr[retArrIdx] = i + 1;
                    retArrIdx++;
                }
            }
        }
        return retArr;
    }
  
    public static void main(String[] args) {
        
        // String[] arr = {"1","2","2","3","4","5"};
        String[] arr2 = {"1","2","3","4","5"};
        String[] arr3 = {"1","2","3","5","6"};

        duplicateCheck dc = new duplicateCheck();
        System.out.println(dc.linearSearch(arr2));
        System.out.println(dc.linearSearch(arr3));
    }
}
