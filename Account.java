public class Account {
    private String greetingWord;

    public void setGreetingWord(String word) {
        this.greetingWord = word;
    }

    public String Greeting() {
        System.out.println(this.greetingWord);
    }
}