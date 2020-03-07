package com.nt.mul;




class Factory {
	int items;

	boolean itemsInFactory;

	synchronized void produce(int items) {
       System.out.println(" 6 inside produce method");
		if(itemsInFactory) {
       System.out.println("13 inside produce if");
			try {
				System.out.println("produce before wait");
				wait();
				System.out.println("produce after wait");
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}

		}
		System.out.println(" 7 out of if produce");
        this.items=items;
       System.out.println(" 8 after produce this items");
		itemsInFactory=true;
		System.out.println("9 after boolean produce true");

		System.out.println(" 10 Produced items:"+items);

		notify();
		System.out.println(" 11 after produce method notify");
	}

	synchronized int consumer() {
		System.out.println(" 17 inside conse method");
		if(! itemsInFactory) {
			System.out.println("inside if consume");
			try {
System.out.println("wait inside consume try before ");
				wait();
				System.out.println("after wait consume");
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}

		}
         
		System.out.println(" 18 items Consumed::"+items);
		itemsInFactory=false;
System.out.println(" 19 after consume bolean  items false");
		notifyAll();
System.out.println("20 out consume notisy");
		return items;
		
	}
	
	

}
