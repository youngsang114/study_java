package fc_java.cousrse2.part2;

import fc_java.model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>(); // Movie[]배열
        list.add(new Movie("괴물","봉준호",2006,"한국"));
        list.add(new Movie("기생충","봉준호",2019,"한국"));
        list.add(new Movie("완벽한타인","이재규",2018,"한국"));

        System.out.println("+------------------+----------+-------+--------+");
        System.out.println("| 영화 제목 | 감독 | 개봉년도 | 국가 |");
        System.out.println("+------------------+----------+-------+--------+");
        for (Movie m : list){
            System.out.printf("|%-16s|%-8s|%4d|%-6s|\n",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
        }
        System.out.println("+------------------+----------+-------+--------+");

        String searchTitle = "기생충";
        // 순차검색 -> 이진 검색(*)
        for (Movie m:list){
            if(m.getTitle().equals(searchTitle)){
                System.out.println(m.getTitle());
                System.out.println(m.getDirector());
                System.out.println(m.getYear());
                System.out.println(m.getCountry());
                break;
            }
        }
    }
}
