package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassExample {

	public static void main(String[] args) throws IOException {
		// 원본 파일명과 복사본 파일명 절대 경로로 찾아서 정의
		String orgFilename = "D1_Student.txt";
		String copiedFilename = "D1_StudentD1_Student_copied.txt";

		try {
			// 파일 클래스로 파일 객체 생성
			File inFile = new File(orgFilename);
			File outFile = new File(copiedFilename);

			// 파일 Reader와 Writer 참조변수 생성
			FileReader fr;
			FileWriter fw;

			if (inFile.exists()) { // 파일이 존재할 경우 FileReader 생성
				fr = new FileReader(inFile);
			} else { // 파일을 찾을 수 없을 때
				System.out.println(orgFilename + "을 찾을 수 없습니다.");
				return;
			}

			if (!outFile.exists()) { // 출력할 파일이 없는 경우, 복사한 파일 새로 생성
				outFile.createNewFile();

			} else { // 이미 존재하는 경우 바꾸기
				System.out.println(copiedFilename + "이 존재합니다. 기존 내용이 삭제됩니다");
			}

			// FileWriter 객체 생성
			fw = new FileWriter(outFile);

			// char 복사 메소드 호출
			copyCharData(fr, fw);
			// copyCharArrData(fr, fw);

			// 출력 스트림 버퍼 비움
			fw.flush();
			// 출력 버퍼 닫음
			fw.close();
			// 입력 버퍼 닫음
			fr.close();
			System.out.println();
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) { // 파일이 존재하지 않을 때 메세지 출력
			System.out.println(e.getMessage());
		}
	}

	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		int charData;
		while ((charData = fr.read()) != -1) { // 파일을 전부 읽을 떄까지 반복
			// 읽은 char 출력
			System.out.print((char) charData);
			// 읽은 char 출력 스트림에 write
			fw.write(charData);
		}
	}

}
