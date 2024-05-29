package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

	public static void main(String[] args) throws IOException {
		// 원본 파일명과 복사본 파일명 절대 경로로 찾아서 정의
		String orgFilename = "D1_Student.txt";
		String copiedFilename = "D1_StudentD1_Student_copied.txt";
		
		try {
			// 파일 입력 스트림 생성
			FileReader fr = new FileReader(orgFilename);
			//파일 출력 스트림 생성
			FileWriter fw =new FileWriter(copiedFilename);
			
			// char 복사 메소드 호출
			copyCharData(fr, fw);
			//copyCharArrData(fr, fw);
			
			// 출력 스트림 버퍼 비움
			fw.flush();
			// 출력 버퍼 닫음
			fw.close();
			// 입력 버퍼 닫음
			fr.close();
			
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
		} catch (FileNotFoundException e) { // 파일이 존재하지 않을 때 메세지 출력
			System.out.println(e.getMessage());
		}

	}

	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		char[] charArrData = new char[100];
		while (fr.read(charArrData) != -1) { // 파일을 전부 읽을 떄까지 반복
			// 읽은 char 출력
			System.out.print(charArrData);
			// 읽은 char 출력 스트림에 write
			fw.write(charArrData);
		}
		
	}

	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		int charData;
		while ((charData = fr.read()) != -1) {
			System.out.print((char)charData);
			fw.write(charData);
		}
	}

}
