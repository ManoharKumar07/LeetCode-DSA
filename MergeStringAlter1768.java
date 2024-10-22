class MergeStringAlter1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int len=word2.length();

        if(word1.length()>word2.length()){
            len = word1.length();
        }
        for (int i=0;i<len;i++){
            if(i<word1.length() && i< word2.length()){
            char w1=word1.charAt(i);
            char w2 = word2.charAt(i);
result.append(w1);
result.append(w2);
        }
        else{
            if(i<word1.length()){
result.append(word1.charAt(i));
            }
            if(i<word2.length()){
                result.append(word2.charAt(i));
            }
        }

        }
        return result.toString();
    }
    public static void main(String[] args) {
        mergeAlternately("word1", "word2");
    }
}