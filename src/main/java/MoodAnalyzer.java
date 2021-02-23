public class MoodAnalyzer {
    private String message;
    public  MoodAnalyzer(String message) {
        this.message=message;
    }
    public String analyseMood(String message){
        this.message=message;
        return analysemood();
    }
    public String analysemood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
