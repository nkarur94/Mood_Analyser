package assignment21;

public class MoodAnalyser {

    public String analyseMood(String mood) {

        if (mood.contains("Sad"))

            return "SAD";
        else {
            return "HAPPY";
        }
    }
}
