import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MoodAnalyzerTest {
    @Test
    public void givenNullMoodShouldReturnHappy()  {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        String mood = null;
        try {
            ExpectedException exceptionRule =ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyzer.analysemood();

        } catch (MoodAnalysisException e) {

        }
        Assert.assertEquals("HAPPY",mood);

    }

    @Test
    public void givenNullMoodShouldThrowException()  {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter valid message",e.getMessage());
        }
    }

}


