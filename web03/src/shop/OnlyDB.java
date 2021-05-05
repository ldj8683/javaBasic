package shop;

import javax.swing.JOptionPane;

public class OnlyDB {
	// CRUD 기능을 구현해 주어야한다.
	// 기능하나당 메서드 하나
	// 회원 정보

	// 회원 가입 시
	public void create() {
		// 1. db에 접속
		JOptionPane.showMessageDialog(null, "DB에 회원가입을 완료함.");
		// 2. sql문을 생성 -> insert
		// 3. sql문을 db로 전송
	}

	// 회원 정보 보기
	public void read() {
		// 1. db에 접속
		// 2. sql문을 생성 -> select
		// 3. sql문을 db로 전송
	}

	// 회원 정보 수정
	public void update() {
		// 1. db에 접속
		// 2. sql문을 생성 -> update
		// 3. sql문을 db로 전송
	}

	// 회원 탈퇴
	public void delete() {
		// 1. db에 접속
		// 2. sql문을 생성 -> delete
		// 3. sql문을 db로 전송
	}
}
