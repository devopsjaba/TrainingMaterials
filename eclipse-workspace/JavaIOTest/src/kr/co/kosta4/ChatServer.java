package kr.co.kosta4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		int port  = 5000;		// 포트 설정
		try(ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("서버가 시작되었습니다. 포트 번호 : " + port);
			
			while(true) {
				System.out.println("클라이언트 연결을 기다리고 있습니다....");
				try(Socket clientSocker = serverSocket.accept();
						BufferedReader in = new BufferedReader(
								new InputStreamReader(clientSocker.getInputStream(), "UTF-8"));
						PrintWriter out = new PrintWriter(
								new OutputStreamWriter(clientSocker.getOutputStream(), "UTF-8"), true)
					) {
					System.out.println("클라이언트가 연결되었습니다: " + clientSocker.getRemoteSocketAddress());
					String inputLine;
					while((inputLine = in.readLine()) != null) {
						System.out.println("클라이언트로부터 받은 메시지: " + inputLine);
						out.println(inputLine);		// 받은 메시지를 그대로 클라이언트에게 메아리 전송 
					}
				} catch (IOException e) {
					System.out.println("클라이언트와의 연결 문제가 발생했습니다.");
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			System.out.println("서버 소켓을 열 수 없습니다.");
			e.printStackTrace();
		}
	}
}










