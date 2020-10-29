package com.gxl.ftp;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.Socket;

/**
 * 处理客户端传输过来的文件线程类
 * @author 郭小龙
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
			// 文件名和长度
			String fileName = dis.readUTF();
			long fileLength = dis.readLong();
			File directory = new File("D:\\FTCache");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
