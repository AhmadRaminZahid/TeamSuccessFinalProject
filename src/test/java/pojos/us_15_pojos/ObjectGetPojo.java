package pojos.us_15_pojos;

import java.io.Serializable;

public class ObjectGetPojo implements Serializable {
	private ObjectPojo object;
	private String message;

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

	public ObjectGetPojo(ObjectPojo object, String message) {
		this.object = object;
		this.message = message;
	}

	@Override
 	public String toString(){
		return 
			"ObjectGetPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}