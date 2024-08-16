package hw8;

import java.util.Objects;

//請設計一個Train類別,並包含以下屬性:
//- 班次 number,型別為int 
//- 車種 type,型別為String 
//- 出發地 start,型別為String
//- 目的地 dest,型別為String 
//- 票價 price,型別為double
public class Hw8_2Train implements Comparable<Hw8_2Train> {
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public void setTrain (int number,String type , String start,String dest,double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Object getTrain () {
		return number + type + start + dest + price;
	}
	
	public Hw8_2Train() {}
	
	public Hw8_2Train (int number,String type,String start,String dest,double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}



	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hw8_2Train other = (Hw8_2Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Hw8_2Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price="
				+ price + "]";
	}
	
	public int compareTo(Hw8_2Train train) {
		//物件本身與 aEmployee 相比較，如果 retrun 正值，就表示比 aEmployee 大
		if (this.number > train.number) {
			return 1;
		}else if (this.number == train.number){
			return 0;
		} else {
			return -1;
		}
	}
	
}
