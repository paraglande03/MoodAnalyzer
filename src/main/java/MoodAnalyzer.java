public class MoodAnalyzer {
    private String message;
    public  MoodAnalyzer(String message) {
        this.message=message;
    }
    public String analyseMood(String message) throws MoodAnalysisException {
        this.message=message;
        return analysemood();
    }
    public String analysemood() throws MoodAnalysisException {
        try {
            if (message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter valid message");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter valid message");
        }
    }
}
