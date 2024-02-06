package java_0202;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// Ŭ���̾�Ʈ ������ �����ϴ� Ŭ����
class MakeClientSocket{
    ServerSocket serverSocket = null; // ���� ����
    Socket socket = null; // Ŭ���̾�Ʈ ����

    PrintWriter writer = null; // ��½�Ʈ��
    BufferedReader reader = null; // �Է½�Ʈ��

    String lineStr = null; // �Է¹��� ���ڿ�

    public MakeClientSocket() {
        try {
            // ���� ����(localhost)�� 2000�� ��Ʈ�� ����
            socket = new Socket("localhost", 2000);
            writer = new PrintWriter(socket.getOutputStream(),true); // Ŭ���̾�Ʈ ������ ��½�Ʈ�� ����
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ ������ �Է½�Ʈ�� ����

            String  str = null;
            int num=0;
            BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in)); // Ű���� �Է��� �ޱ� ���� �Է½�Ʈ�� ����

            
            // ����ڷκ��� �Է��� �޾� ������ ����
            while( (str = sReader.readLine())!=null){
                writer.println(str); // ������ ���ڿ� ����
                System.out.println("output:"+str); // ������ ���ڿ� ���
                if(str.equals("0")) {
                	break;                    	
                }
            }            
            
            
            writer.close(); // ��½�Ʈ�� �ݱ�
            reader.close(); // �Է½�Ʈ�� �ݱ�
            sReader.close(); // �Է½�Ʈ�� �ݱ�
            socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

// ���� Ŭ����
public class MakeClientMain {
    public static void main(String[] args) {
        new MakeClientSocket(); // Ŭ���̾�Ʈ ���� ��ü ����
    }
}