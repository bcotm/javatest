package com.test;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.net.Socket;

public class FiddlerManager {
	private String host;
	private int port;
	private boolean running;
	private Socket socket;
	public static final String MSG_TEST_ALIVE = "Test Fiddler Alive";
	public static final String MSG_SAVE_FILE = "Fiddler Save File";

	FiddlerManager(){
		this("127.0.0.1", 8888);
	}

	FiddlerManager(String host, int port){
		this.host = host;
		this.port = port;
	}

	public boolean init(){
		try{
			// System.setProperty("http.proxySet", "true");
			// System.setProperty("http.proxyHost", "127.0.0.1");
			// System.setProperty("http.proxyPort", "8888");
			socket = new Socket(host, port);
			socket.setSoTimeout(30000);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public String send(String message){
		try {
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			writer.write(message);
			System.out.println("send msg: " + message);
			writer.flush();

			
			String response = reader.readLine();
			System.out.println("receive msg: " + response);
			return response;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Wow";
	}

	public static void main(String[] args){
		FiddlerManager fm = new FiddlerManager();
		if(fm.init()){
			String responseMsg = fm.send(MSG_TEST_ALIVE);
			System.out.print(responseMsg);
		}
	}
}