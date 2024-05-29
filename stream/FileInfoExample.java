package stream;
import java.io.File;
import java.io.IOException;

public class FileInfoExample {

    public static void main(String[] args) throws IOException {

        // imgDir 변수에 "C:/Temp/images" 경로를 가진 File 객체 생성
        File imgDir = new File("C:/Temp/images");
        // testFile 변수에 "C:/Temp/test.txt" 경로를 가진 File 객체 생성
        File testFile = new File("C:/Temp/test.txt");

        // imgDir 디렉토리가 존재하지 않으면
        if (imgDir.exists() == false) {
            // 디렉토리(및 필요 시 상위 디렉토리) 생성
            imgDir.mkdirs();
            // 생성된 디렉토리 이름 출력
            System.out.println(imgDir.getName() + "을 생성합니다.");
        }
        // testFile 파일이 존재하지 않으면
        if (testFile.exists() == false) {
            // 새 파일 생성
            testFile.createNewFile();
            // 생성된 파일 이름 출력
            System.out.println(testFile.getName() + "을 생성합니다.");
        }

        // tempDir 변수에 "C:/Temp" 경로를 가진 File 객체 생성
        File tempDir = new File("C:/Temp");
        // tempDir 디렉토리의 파일 목록을 배열로 반환
        File[] contents = tempDir.listFiles();
        // tempDir 디렉토리 이름 출력
        System.out.println(tempDir.getName() + "의 내용을 출력합니다.");
        // contents 배열에 있는 각 파일 및 디렉토리에 대해 반복
        for (File file : contents) {
            // 파일 이름 출력
            System.out.print("\t" + file.getName());
            // 파일이 디렉토리인 경우 "<DIR>" 출력
            if (file.isDirectory()) {
                System.out.print("<DIR>");
            } else {
                // 파일인 경우 파일 크기를 "<크기>" 형식으로 출력
                System.out.print("<" + file.length() + ">");
            }
            System.out.println();
        }
    }
}
