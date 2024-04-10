package pojos.us_15_pojos;

import java.io.Serializable;

public class ActualStudentPojo implements Serializable {
	private ObjectPojo object;
	private String message;

	public ActualStudentPojo() {
	}

	public ActualStudentPojo(ObjectPojo object, String message) {
		this.object = object;
		this.message = message;
	}

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}


	@Override
 	public String toString(){
		return 
			"ActualStudentPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}