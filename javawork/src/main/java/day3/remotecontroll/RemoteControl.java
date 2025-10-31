package day3.remotecontroll;

public interface RemoteControl {
		
	//상수(final)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메서드 [public abstract] 생략 가능
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	}