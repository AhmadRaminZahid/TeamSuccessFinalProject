package pojos.us_13_pojos;

import pojos.ObjectPojo;

import java.io.Serializable;

public class StudentPojo implements Serializable {
    private ObjectPojo object;
    private String message;
    private String httpStatus;

    public StudentPojo() {
    }

    public StudentPojo(ObjectPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
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

    public void setHttpStatus(String httpStatus){
        this.httpStatus = httpStatus;
    }

    public String getHttpStatus(){
        return httpStatus;
    }

    @Override
    public String toString(){
        return
                "StudentPojo{" +
                        "object = '" + object + '\'' +
                        ",message = '" + message + '\'' +
                        ",httpStatus = '" + httpStatus + '\'' +
                        "}";
    }
}