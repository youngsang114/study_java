package fc_java.model;

public class MovieVO {
    private String name;
    private String open;
    private String main;
    private String genre;
    private int time;
    private int grade;

    public MovieVO(){ // 디폴트 생성자
    }
    public MovieVO(String name, String open, String main, String genre, int time, int grade){
        this.name = name;
        this.open = open;
        this.main = main;
        this.genre = genre;
        this.time = time;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "name='" + name + '\'' +
                ", open='" + open + '\'' +
                ", main='" + main + '\'' +
                ", genre='" + genre + '\'' +
                ", time=" + time +
                ", grade=" + grade +
                '}';
    }
}
