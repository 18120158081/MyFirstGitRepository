package com.gxl.ftp;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.Socket;

/**
 * ����ͻ��˴���������ļ��߳���
 * @author ��С��
 *
 */
public class Task implements Runnable {
	private Socket socket;
	
	private DataInputStream dis;
	
	private FileOutputStream fos;
	
	public Task(Socket socket) {
		this.socket = socket;		
	}
	
	
	@Override
	public void run() {
		try {
			dis = new DataInputStream(socket.getInputStream());
			// �ļ����ͳ���
			String fileName = dis.readUTF();
			long fileLength = dis.readLong();
			File directory = new File("D:\\FTCache");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
