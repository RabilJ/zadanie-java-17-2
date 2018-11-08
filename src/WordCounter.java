public class WordCounter {
    public static int countChars(String text){
        return text.length();
    }
    public static int countCharsWIthoutBlanks(String text){
        String cleanText = text.replaceAll("\\s","");
        return cleanText.length();
    }
    public static int countWords(String text){
        String trim = text.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s").length;
    }
    public static boolean isPalindrom(String text){
        boolean palindrom = false;
        char[]array  = text.toCharArray();
        if(text.length()%2==0){
            for(int i = 0; i < array.length/2-1; i++){
                if(array[i] != array[array.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for(int i = 0; i < (array.length-1)/2-1; i++){
                if(array[i] != array[array.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }
        return palindrom;
        }
    }

