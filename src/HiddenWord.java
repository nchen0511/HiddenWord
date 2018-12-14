public class HiddenWord {
    private String word;
    public HiddenWord(String word){
        this.word = word;
    }

    public String getHint(String guess){
        String temp ="";
        for(int i=0;i<guess.length();i++){
            if(guess.substring(i,i+1).equals(word.substring(i,i+1))){
                temp+=guess.substring(i,i+1);
            } else if(word.indexOf(guess.substring(i,i+1))>-1){
                temp+="+";
            } else {
                temp+="*";
            }
        }
        return temp;
    }
}
