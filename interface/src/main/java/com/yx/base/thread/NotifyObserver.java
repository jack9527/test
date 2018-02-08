package com.yx.base.thread;

import java.util.Observable;
import java.util.Observer;

public class NotifyObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		/*
		//when notify thread exception to renew thread 
		NotifyProcessor notify=new NotifyProcessor();
		notify.addObserver(this);
		new Thread(notify).start();
		*/
		System.out.println("notify thread occur exception.");
	}

}
