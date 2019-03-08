package pl.adulek;

public class Song {
    private String Title;
    private double Duration;

    public Song(String title, double duration) {
        Title = title;
        Duration = duration;
    }

    public double getDuration() {
        return Duration;
    }

    public void setDuration(double duration) {
        Duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String toString() {
        return "Title='" + Title + ' ' + ", Duration=" + Duration;
    }
}
