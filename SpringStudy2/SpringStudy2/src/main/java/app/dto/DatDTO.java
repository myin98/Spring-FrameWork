package app.dto;

public class DatDTO {

	private int num;
	private String msg;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "DatDTO [num=" + num + ", msg=" + msg + "]";
	}
	
	
	
}
