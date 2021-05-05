package 컬렉션;

import java.util.HashSet;

public class Quiz01 {

	public static void main(String[] args) {
		// 한 명씩만 필요하기 때문에 중복이 허용되지 않는 set을 이용
		HashSet<String> team = new HashSet<String>();
		
		// 팀원을 등록
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		
		// 출력
		System.out.println(team);
		
	}

}
