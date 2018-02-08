package com.yx.base.thread;

import java.util.Observable;

import org.springframework.stereotype.Service;

import com.yx.base.service.chat.MsgStoreAndNotify;

@Service
public class NotifyProcessor extends Observable implements Runnable {
	public static boolean isRun=true;

	public NotifyProcessor(){
		NotifyObserver ob=new NotifyObserver();
		this.addObserver(ob);
	}
	
	public void run() {
		MsgStoreAndNotify chatService=new MsgStoreAndNotify();
		while (isRun) {
			try {
				chatService.notifyImServer();
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
				this.notifyObservers();
			}
		}
	}
}
