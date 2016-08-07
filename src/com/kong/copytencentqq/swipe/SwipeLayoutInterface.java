package com.kong.copytencentqq.swipe;

import com.kong.copytencentqq.swipe.SwipeLayout.Status;

public interface SwipeLayoutInterface {

	Status getCurrentStatus();
	
	void close();
	
	void open();
}
