package java_0202;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 서버 소켓을 생성하는 클래스
class MakeServerSocket{
    ServerSocket serverSocket = null; // 서버 소켓
    Socket socket = null; // 클라이언트 소켓

    PrintWriter writer = null; // 출력스트림
    BufferedReader reader = null; // 입력스트림

    String lineStr = null; // 입력받은 문자열

    public MakeServerSocket() {
        try {
            serverSocket = new ServerSocket(2000); // 2000번 포트에서 연결 요청 대기

            while(true){
                socket = serverSocket.accept(); // 클라이언트의 연결 요청 수락
                System.out.println("클라이언트 요청");

                writer = new PrintWriter(socket.getOutputStream(),true); // 클라이언트 소켓의 출력스트림 생성
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 클라이언트 소켓의 입력스트림 생성

                // 클라이언트로부터 데이터를 받아들이고 다시 전송
                while( (lineStr = reader.readLine())   !=null    ){
                    writer.write(lineStr); // 클라이언트에게 데이터 전송
                    System.out.println("input:"+lineStr); // 받은 데이터 출력
                    if(lineStr.equals("0")) {
                    	break;                    	
                    }
                }
                
                
                writer.close(); // 출//력스트림 닫기
                reader.close(); // 입력스트림 닫기
                socket.close(); // 클라이언트 소켓 닫기
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 메인 클래스
public class MakeServerMain {
    public static void main(String[] args) {
        new MakeServerSocket(); // 서버 소켓 객체 생성
    }
}