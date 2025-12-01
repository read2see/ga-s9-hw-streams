import java.util.Arrays;

public class CommonPrefix {

    public static String longestCommonPrefix(String[] words) {

        if(words.length == 0){
            return "";
        }

        if( words.length == 1 ){
            return words[0];
        }

        Arrays.sort(words);

        int prefixBoundary = Math.min(words[0].length(), words[words.length - 1].length());

        for(int i = 0; i < prefixBoundary; i++){

            if(words[0].charAt(i) != words[words.length - 1].charAt(i)){
                return words[0].substring(0, i);
            }
        }

        return words[0];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{}));
        System.out.println(longestCommonPrefix(new String[]{"flower"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "doggo", "dogggo"}));
    }
}