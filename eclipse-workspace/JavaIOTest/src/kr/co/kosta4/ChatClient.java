package kr.co.kosta4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) {
		String host = "localhost";
		int port = 5000;
		try(Socket socket = new Socket(host, port)) {
			BufferedReader in = new BufferedReader(
								new InputStreamReader(socket.getInputStream(), "UTF-8"));
			PrintWriter out = new PrintWriter(
								new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			
			String userInput;
			while((userInput = stdIn.readLine()) != null) {
				if(userInput.equals("끝")) {
					break;
				}
				out.println(userInput);			// 서버에 메시지 전송
				System.out.println("서버로부터의 응답 : " + in.readLine());
			}
			
			
		} catch(Exception e) {
			System.out.println("서버 연결에 실패했습니다.");
			e.printStackTrace();
		}
	}
}





