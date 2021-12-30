public class RnaTranscription {

    public String transcribe(String word){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            switch (ch){
                case 'G':
                    ans.append("C");
                    break;
                case 'C':
                    ans.append("G");
                    break;
                case 'T':
                    ans.append("A");
                    break;
                case 'A':
                    ans.append("U");
                    break;
                default:
                    break;
            }
        }
        return ans.toString();
    }
}