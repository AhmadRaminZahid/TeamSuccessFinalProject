package pojos.us_14pojo;

import java.io.Serializable;

public class ActualDataUpdatePojo implements Serializable {
	private ObjectInnerPojo object;
	private String message;
	private String httpStatus;

	public ActualDataUpdatePojo() {
	}

	public ActualDataUpdatePojo(ObjectInnerPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectInnerPojo object){
		this.object = object;
	}

	public ObjectInnerPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ActualDataUpdatePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}