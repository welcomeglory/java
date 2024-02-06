package java_0202;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 클라이언트 소켓을 생성하는 클래스
class MakeClientSocket{
    ServerSocket serverSocket = null; // 서버 소켓
    Socket socket = null; // 클라이언트 소켓

    PrintWriter writer = null; // 출력스트림
    BufferedReader reader = null; // 입력스트림

    String lineStr = null; // 입력받은 문자열

    public MakeClientSocket() {
        try {
            // 로컬 서버(localhost)의 2000번 포트에 연결
            socket = new Socket("localhost", 2000);
            writer = new PrintWriter(socket.getOutputStream(),true); // 클라이언트 소켓의 출력스트림 생성
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 클라이언트 소켓의 입력스트림 생성

            String  str = null;
            int num=0;
            BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력을 받기 위한 입력스트림 생성

            
            // 사용자로부터 입력을 받아 서버로 전송
            while( (str = sReader.readLine())!=null){
                writer.println(str); // 서버로 문자열 전송
                System.out.println("output:"+str); // 전송한 문자열 출력
                if(str.equals("0")) {
                	break;                    	
                }
            }            
            
            
            writer.close(); // 출력스트림 닫기
            reader.close(); // 입력스트림 닫기
            sReader.close(); // 입력스트림 닫기
            socket.close(); // 클라이언트 소켓 닫기
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

// 메인 클래스
public class MakeClientMain {
    public static void main(String[] args) {
        new MakeClientSocket(); // 클라이언트 소켓 객체 생성
    }
}