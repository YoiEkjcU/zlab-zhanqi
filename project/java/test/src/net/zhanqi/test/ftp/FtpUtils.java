package net.zhanqi.test.ftp;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ProtocolCommandEvent;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ftp.FTPClient;

public class FtpUtils {

    private static FTPClient ftp = new FTPClient();

    public static void main(String[] args) throws SocketException, IOException {
        if (!ftp.isConnected() && !ftp.isAvailable()) {
            ftp.connect("zhanqi.gotoftp.com");
            ftp.login("zhanqi", "");
        }

        ftp.addProtocolCommandListener(new ProtocolCommandListener() {
            
            @Override
            public void protocolReplyReceived(ProtocolCommandEvent event) {
                System.out.print(event.getMessage());
            }
            
            @Override
            public void protocolCommandSent(ProtocolCommandEvent event) {
                System.out.print(event.getMessage());
            }
        });

        ftp.list("/");

    }
}
