public class Ransom {
    public static void main(String[] args) {
        String ransomNote = "aad", magazine = "bagreberbsdvsdvsda";
        
        if (ransomNote.length() > magazine.length()) {
            System.out.println("False");
            return;
        }
        
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) {
                System.out.println("False");
                return;
            }
            alphabets_counter[c-'a']--;
        }
        System.out.println("True");
    }
}
