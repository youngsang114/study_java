package java기초;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // 영화 3 편을 저장 할 [배열을 생성하고], 영화 편의 데이터를 저장하고 출력하세요

        Movie[] m = new Movie[3];

        m[0]= new Movie();
        m[0].title ="A";
        m[0].actor ="KIM";
        m[0].time =160;
        m[0].date= 20231122L;
        m[0].genre="action";
        m[0].grade=15;

        m[1]= new Movie();
        m[1].title ="B";
        m[1].actor ="Yoo";
        m[1].time =170;
        m[1].date= 20231123L;
        m[1].genre="action2";
        m[1].grade=18;

        m[2]= new Movie();
        m[2].title ="C";
        m[2].actor ="KI";
        m[2].time =30;
        m[2].date= 20221122L;
        m[2].genre="comedy";
        m[2].grade=8;


        for(int i=0; i<m.length; i++){
            System.out.println(m[i].actor +"\t"+ m[i].genre+"\t"+m[i].title+"\t"+m[i].grade+"\t"+m[i].time+"\t"+m[i].date);
        }


    }
}
