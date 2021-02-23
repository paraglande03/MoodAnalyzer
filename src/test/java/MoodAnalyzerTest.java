import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        String mood = moodAnalyzer.analysemood();
        Assert.assertEquals("HAPPY",mood);
    }

}
