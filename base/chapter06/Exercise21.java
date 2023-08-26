package exercise4.src.js.chapter06;

public class Exercise21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volumne = 0;
		System.out.println("CH:" + t.channel+", VOL:"+t.volumne);

		t.channelDown();
		t.volumneDown();
		System.out.println("CH:" + t.channel+", VOL:"+t.volumne);

		t.volumne = 100;
		t.channelUp();
		t.volumneUp();
		System.out.println("CH:" + t.channel+", VOL:"+t.volumne);
	}
}

class MyTv {
	boolean isPowerOn;
	int channel, volumne;

	final int MAX_VOLUMNE = 100;
	final int MIN_VOLUMNE = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	MyTv() {

	}

	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}

	void channelDown() {
		channel--;
		if(channel<MIN_CHANNEL) channel = MAX_VOLUMNE;
	}

	void channelUp() {
		channel++;
		if(channel>MAX_VOLUMNE) channel = MIN_CHANNEL;
	}

	void volumneDown() {
		volumne--;
		if(volumne<MIN_VOLUMNE) volumne = MIN_VOLUMNE;
	}

	void volumneUp() {
		volumne++;
		if(volumne>MAX_VOLUMNE) volumne = MAX_VOLUMNE;
	}
}
