package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장 {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		try {
			// 해당 폴더와 스트림(연결통로)을 만든다.
			// 스트림의 특징은 한방향!
			FileWriter f = new FileWriter("C:/data/" + s1 + ".txt");
			// 절대 경로를 이용해서 저장이 될 곳을 지정해준다.
			// 상대 경로는 현재 위치를 기준으로해서 상대적으로 써주는 경로
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			f.close(); // 스트림을 다쓰고 나서는 반드시 지원을 해제!
		} catch (IOException e) {
			System.out.println("파일로 저장하는 중 에러가 발생함!");
			System.out.println("에러정보 >> " + e.getMessage());
		}
	}
}
