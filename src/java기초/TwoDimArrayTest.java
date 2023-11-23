package java기초;

public class TwoDimArrayTest {
    // 2차원 이상 차원 배열 -> "다차원 배열"
    public static void main(String[] args) {
        // 2행 4열의 [정수형] [배열을 생성] 하세요
        int[][] a = new int[2][4];
        // 초기화 리스트 생성! -> 행 단위로 초기화
        int[][] ls = {         // 2행의 4열이 된다
                {1,2,3,4},
                {5,6,7,8}
        };
        for(int i=0; i<ls.length; i++){
            for(int j=0; j<ls[i].length; j++){   // 2차원 배열의 처음 길이 -> 행 길이
                System.out.print(ls[i][j]+"\t"); // 2차원 배열의 1차원 길이 -> 열 길이
            }
            System.out.println();
        }

        // 서로 다른 열을 가진 가변 길이 배열 만들기
        int[][] ls2 = new int[5][];
        for (int i=0; i< ls2.length;i++){
            ls2[i] = new int[i+1]; // 디버깅으로 확인하기
            // ls[0] = new int[1] -> 이렇게 첫번째 행에 1차원 배열을 만들어주는 느낌~
        }

        for (int i=0;i<ls2.length;i++){
            for (int j=0; j<ls2[i].length;j++){
                ls2[i][j]='A';
                System.out.print((char)(ls2[i][j])+ "\t");
            }
            System.out.println();
        }

    }
}
