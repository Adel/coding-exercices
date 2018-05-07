package geekforgeeks.topquestions.string.array;

public class ReverseArraySpecialChars {

    public static String reverse(String s) {
        char[] arr = s.toCharArray();

        int i = 0, j = arr.length-1;
        while(i < j){
            char f = arr[i];
            char l = arr[j];
            boolean r1 = Character.isAlphabetic(f);
            boolean r2 = Character.isAlphabetic(l);

            if(r1 && r2){
                arr[i] = l;
                arr[j] = f;
                i++;j--;
            }
            if(!r1){
                i++;
            }
            if(!r2){
                j--;
            }
        }
        return new String(arr);
    }

}
