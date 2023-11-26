package fc_java.part3;

import fc_java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO vo = new MovieVO("아바타","2022.12.14","jake","action",192,12);
        System.out.println(vo.toString());
        System.out.println(vo.getTime());
    }
}
