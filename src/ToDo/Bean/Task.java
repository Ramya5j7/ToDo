package ToDo.Bean;

public class Task {
	private String name;
	private String Date;
	private String Time;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}
	

	@Override
	public String toString() {
		return "AddTask [name=" + name + ", Date=" + Date + ", Time=" + Time + "]";
	}

	public Task(String name, String date, String time) {
		super();
		this.name = name;
		Date = date;
		Time = time;
	}

	public Task() {
		
		// TODO Auto-generated constructor stub
	}
	
	
}
