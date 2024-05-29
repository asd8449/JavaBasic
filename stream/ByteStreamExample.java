package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		// 원본 파일명과 복사본 파일명 절대 경로로 찾아서 정의
		String orgFilename = "C:\\_Lecture\\HTMLCSSJS\\HTMLCSS\\HTML_Chap02\\img\\Curi_01.jpg";
		String copiedFilename = "C:\\_Lecture\\HTMLCSSJS\\HTMLCSS\\HTML_Chap02\\img\\Curi_01_copied.jpg";
		
		try {
			// 파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream(orgFilename);
			//파일 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream(copiedFilename);
			
			// 바이트 복사 메소드 호출
			copyEachOneByte(fis, fos);
			//copyEachKByte(fis, fos);
			
			// 출력 스트림 버퍼 비움
			fos.flush();
			// 출력 버퍼 닫음
			fos.close();
			// 입력 버퍼 닫음
			fis.close();
			
			System.out.println("복사가 완료되었습니다.");
			
		} catch (FileNotFoundException e) { // 파일이 존재하지 않을 때 메세지 출력
			System.out.println(e.getMessage());
		}	
	}

	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		int byteInput;
		while ((byteInput = fis.read()) != -1) { // 파일을 전부 읽을 떄까지 반복
			// 읽은 바이트를 출력 스트림에 write
			fos.write(byteInput);
		}
	}
	
	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		byte kbInput[] = new byte[1024];
		while (fis.read(kbInput) != -1) {
			fos.write(kbInput);
		}
	}

}
