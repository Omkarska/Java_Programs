class VideoTape {
    protected String title;
    protected int length;
    protected boolean available;

    public VideoTape(String title, int length) {
        this.title = title;
        this.length = length;
        this.available = true;
    }

    public void show() {
        System.out.println("Video Tape Information");
        System.out.println("Title: " + title);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

class Movie extends VideoTape {
    private String director;
    private double rating;

    public Movie(String title, int length, String director, double rating) {
        super(title, length);
        this.director = director;
        this.rating = rating;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Movie Information");
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}

class MusicVideo extends VideoTape {
    private String artist;
    private String category;

    public MusicVideo(String title, int length, String artist, String category) {
        super(title, length);
        this.artist = artist;
        this.category = category;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Music Video Information");
        System.out.println("Artist: " + artist);
        System.out.println("Category: " + category);
    }
}

public class ClassHierarchyDemo {
    public static void main(String[] args) {
        VideoTape videoTape = new VideoTape("Generic Video", 120);
        videoTape.show();

        System.out.println();

        Movie movie = new Movie("The Movie", 150, "Omkar Kanase", 8.2);
        movie.show();

        System.out.println();

        MusicVideo musicVideo = new MusicVideo("Music Video", 90, "Artist Name", "Pop");
        musicVideo.show();
    }
}
