package TextFormater;

public class TextFormater {
    private String str;

    public TextFormater() {
    }

    public TextFormater(String str) {
        this.str = str;
    }

    public void countWords(){

    }

    public void wordsNumber() {
        String[] words = this.str.split(" ");
        int count = 0;
        for (String word : words) {
            if(word.length()>2 && word.length()<=5){
                count++;
            }
        }
        System.out.println(count);
    }
/*
    public void palindrom(){
        String[] words1 = this.str.split(" ");
        for(String word1: words1){
            if(word1.equals())
        }
    }*/

}
