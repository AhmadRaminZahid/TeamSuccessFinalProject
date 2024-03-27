package pojos;

import java.io.Serializable;

public class LessonProgramPostPojo implements Serializable {

    private String day;
    private int educationTermId;
    private int lessonIdList;
    private String  startTime;
    private String stopTime;

    public LessonProgramPostPojo() {
    }

    public LessonProgramPostPojo(String day, int educationTermId, int lessonIdList, String startTime, String stopTime) {
        this.day = day;
        this.educationTermId = educationTermId;
        this.lessonIdList = lessonIdList;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public String getDay() {return day;}

    public void setDay(String day) {this.day = day;}

    public int getEducationTermId() {return educationTermId;}

    public void setEducationTermId(int educationTermId) {this.educationTermId = educationTermId;}

    public int getLessonIdList() {return lessonIdList;}

    public void setLessonIdList(int lessonIdList) {this.lessonIdList = lessonIdList;}

    public String getStartTime() {return startTime;}

    public void setStartTime(String startTime) {this.startTime = startTime;}

    public String getStopTime() {return stopTime;}

    public void setStopTime(String stopTime) {this.stopTime = stopTime;}

    @Override
    public String toString(){
        return
                "ViceDeanPostPojo{" +
                        "day = '" + day + '\'' +
                        ",educationTermId = '" + educationTermId + '\'' +
                        ",lessonIdList = '" + lessonIdList + '\'' +
                        ",startTime = '" + startTime + '\'' +
                        ",stopTime = '" + stopTime + '\'' +
                        "}";

    }
}
