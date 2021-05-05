package 상속;

public class 영화에출연 {
	public static void main(String[] args) {
		수퍼맨 sMan = new 수퍼맨();
		sMan.name = "클라크"; //사람 
		sMan.age = 30000;	//사람
		sMan.speed = 1000;	//맨
		sMan.fly = true;	//수퍼맨
		
		sMan.먹다();			//사람
		sMan.달리다();		//맨
		sMan.우주를날다();		//수퍼맨
		
		원더우먼 wWoman = new 원더우먼();
		wWoman.name = "다이애나";
		wWoman.age = 20000;
		wWoman.speed = 1200;
		wWoman.fly = true;
		
		wWoman.먹다();
		wWoman.달리다();
		wWoman.우주를날다();
	}
}
