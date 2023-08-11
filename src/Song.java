public class Song {
    //step 1. declare the variable
    private String title;
    private double duration;
        //step 2. create the constructor
    public Song() {   //default constructor

    }

    public Song(String title, double duration) {   //parameterised constructor
        this.title = title;
        this.duration = duration;
    }
    //step 3. declare getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    //step 4. declare the toString method to print the correct

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
