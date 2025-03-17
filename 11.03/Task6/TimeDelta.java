public class TimeDelta {
	private int hour;
	private int minute;
	private int second;
	
	// public TimeDelta(int hour, int minute, int second) {
		// if (hour < 0 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
			// throw new IllegalArgumentException("Ошибка ввдоа данных");
		// }
		
		// this.hour = hour;
		// this.minute = minute;
		// this.second	= second;
	// }
	
	public TimeDelta(int hour, int minute, int second) {
		if (minute >= 60 || second >= 60) {
			throw new IllegalArgumentException("Ошибка ввода данных");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second	= second;
	}
	
	public TimeDelta add(TimeDelta time) {
		int newHour = this.hour + time.hour;
		int newMinute = this.minute + time.minute;
		int newSecond = this.second + time.second;
		
		if (newSecond >= 60) {
			newMinute += 1;
			newSecond = newSecond % 60;
		}
		
		if (newMinute >= 60) {
			newHour += 1;
			newMinute = newMinute % 60;
		}
		
		return new TimeDelta(newHour, newMinute, newSecond);
	}
	
	public TimeDelta sub(TimeDelta time) {
		// int newHour = this.hour - time.hour;
		// int newMinute = this.minute - time.minute;
		// int newSecond = this.second - time.second;
		int allTimeDelta = this.hour*3600 + this.minute*60 + this.second;
		int allTime = time.hour*3600 + time.minute*60 + time.second;
		
		int newTime= allTimeDelta - allTime;
		
		int newMinute = newTime / 60;
		int newSecond = newTime % 60;
		int newHour = newMinute / 60;
		newMinute %= 60;
		
		return new TimeDelta(newHour, newMinute, newSecond);
	}
	
	public TimeDelta mult(int n) {
		int newHour = this.hour * n;
		int newMinute = this.hour * n;
		int newSecond = this.second * n;
		
		if (newSecond >= 60) {
			while (newSecond >= 60) {
				newMinute += 1;
				newSecond %= 60;
			}
		}
		
		if (newMinute >= 60) {
			while (newMinute >= 60) {
				newHour += 1;
				newMinute %= 60;
			}
		}
		
		return new TimeDelta(newHour, newMinute, newSecond);
	}
	
	@Override
	public String toString() {
		return hour + " " + minute + " " + second;
	}
	
}	