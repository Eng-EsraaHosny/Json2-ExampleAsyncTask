package firstapp.json2.models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 5/9/2016.
 */
public class MovieModel {
    private String movie;
    private int year;
    private float rating;
    private String duration;
    private String director;
    private String tagline;
    /*
    public static class cast()
    {private String name ; }
    this class contains below methods but we change it
    as we insert GSON library
    */

    @SerializedName("cast")
    private List<Cast> castList;
    private String image;
    private String story;

    /*
    movie : "Avengers"
    year : 2012
    rating : 7.8
    duration : "141 min"
    director : "Joss Whedon"
    tagline : "A new age begins"
    cast
    0
    name : "Robert Downey Jr."
            1
    name : "Chris Evans"
            2
    name : "Mark Ruffalo"
    image : "http://jsonparsing.parseapp.com/jsonData/images/avengers.jpg"
    story : "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping " +
            "program called Ultron, things go horribly wrong and it's " +
            "up to Earth's Mightiest Heroes to stop the villainous Ultron from enacting his terrible plans."
*/

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }


    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }


    public static class Cast {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
