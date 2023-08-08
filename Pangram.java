class Pangram {
    public static void main(String[] args) {
        String sentence ="abcdefghijklmnopqrstuvwxyz";
        checkIfPangram(sentence);

    }
    public static boolean checkIfPangram(String sentence) {
        for(int i=97; i<=122;i++){
            if(sentence.indexOf((char)i)<0) {
                System.out.println("false");
                return false;
            }
        }

        System.out.println("true");
        return true;

    }
}