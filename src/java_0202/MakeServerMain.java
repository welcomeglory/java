package java_0202;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// ���� ������ �����ϴ� Ŭ����
class MakeServerSocket{
    ServerSocket serverSocket = null; // ���� ����
    Socket socket = null; // Ŭ���̾�Ʈ ����

    PrintWriter writer = null; // ��½�Ʈ��
    BufferedReader reader = null; // �Է½�Ʈ��

    String lineStr = null; // �Է¹��� ���ڿ�

    public MakeServerSocket() {
        try {
            serverSocket = new ServerSocket(2000); // 2000�� ��Ʈ���� ���� ��û ���

            while(true){
                socket = serverSocket.accept(); // Ŭ���̾�Ʈ�� ���� ��û ����
                System.out.println("Ŭ���̾�Ʈ ��û");

                writer = new PrintWriter(socket.getOutputStream(),true); // Ŭ���̾�Ʈ ������ ��½�Ʈ�� ����
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ ������ �Է½�Ʈ�� ����

                // Ŭ���̾�Ʈ�κ��� �����͸� �޾Ƶ��̰� �ٽ� ����
                while( (lineStr = reader.readLine())   !=null    ){
                    writer.write(lineStr); // Ŭ���̾�Ʈ���� ������ ����
                    System.out.println("input:"+lineStr); // ���� ������ ���
                    if(lineStr.equals("0")) {
                    	break;                    	
                    }
                }
                
                
                writer.close(); // ��//�½�Ʈ�� �ݱ�
                reader.close(); // �Է½�Ʈ�� �ݱ�
                socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// ���� Ŭ����
public class MakeServerMain {
    public static void main(String[] args) {
        new MakeServerSocket(); // ���� ���� ��ü ����
    }
}