package yalc_java.sec12.chap03;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static final String SONG_PATH = "src/yalc_java/sec12/chap03/beatles.txt";
    public static final String IMG_PATH = "src/yalc_java/sec12/chap03/windows.jpeg";

    public static void main(String[] args) {
        writeLittleStar();
    }
    public static void writeLittleStar () {
        String filePath = "src/yalc_java/sec12/chap03/little_star.txt";
        Charset charset = StandardCharsets.UTF_8;

        List<String> lines = Arrays.asList(
                "반짝반짝 작은 별,",
                "아름답게 비치네.",
                "동쪽 하늘에서도",
                "서쪽 하늘에서도",
                "반짝반짝 작은 별,",
                "아름답게 비치네."
        );

        try (
                //  💡 FileOutputStream & BufferedOutputStream
                //  - 파일을 쓰기 & 버퍼링에 사용
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(filePath)
                )
        ) {
            for (String line : lines) {
                //  🧺 바구니에 담아 🚚 트럭에 싣고 가져다주기
                byte[] buffer = (line + "\n").getBytes(charset);
                bos.write(buffer, 0, buffer.length); // 아까는 read ->이번엔 write
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyWithBis (String from, String newFileName) {
        Path fromPath = Paths.get(from);
        Path toPath = fromPath.getParent().resolve(Paths.get(newFileName));
        String to = toPath.toString();

        //  ⭐️ 이번 강에서 배운 인풋/아웃풋 버퍼 스트림을 사용한 복사
        try (
                BufferedInputStream bis = new BufferedInputStream(
                        new FileInputStream(from)
                );
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(to)
                )
        ) {

            byte[] buffer = new byte[1024];
            int readBytes;
            while ((readBytes = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, readBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
