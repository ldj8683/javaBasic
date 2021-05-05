package 네트워크;

import java.net.Socket;

public class TCP클라이언트1 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) {
			Socket socket = new Socket("localhost", 9000);
			System.out.println(i + "번: 클라이언트가 서버 9000 서버에 연결을 요청함");
		}
	}

}
