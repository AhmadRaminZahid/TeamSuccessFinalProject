package pojos;

import java.io.Serializable;

public class ObjectLessonProgramPojo implements Serializable {
//    "lessonProgramId": 4409,
//            "startTime": "10:00:00",
//            "stopTime": "11:00:00",
//            "lessonName": [
//    {
//        "lessonId": 4452,
//            "lessonName": "Java",
//            "creditScore": 10,
//            "compulsory": true
//    }
//    ],
//            "teachers": [],
//            "students": [],
//            "day": "WEDNESDAY"
//}
    private int lessonProgramId;
    private String startTime;
    private String stopTime;
    private String lessonName;
    private String day;

    public ObjectLessonProgramPojo() {
    }

    public ObjectLessonProgramPojo(int lessonProgramId, String startTime, String stopTime, String lessonName,String day) {
        this.lessonProgramId = lessonProgramId;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.lessonName = lessonName;
        this.day = day;
//        this.creditScore = creditScore;
//        this.compulsory = compulsory;
//        this.teachers = teachers;
//        this.students = students;
//        this.lessonId = lessonId;
    }

    public int getLessonProgramId() {return lessonProgramId;}

    public void setLessonProgramId(int lessonProgramId) {this.lessonProgramId = lessonProgramId;}

    public String getStartTime() {return startTime;}

    public void setStartTime(String startTime) {this.startTime = startTime;}

    public String getStopTime() {return stopTime;}

    public void setStopTime(String stopTime) {this.stopTime = stopTime;}

//    public int getLessonId() {return lessonId;}
//
//    public void setLessonId(int lessonId) {this.lessonId = lessonId;}

    public String getLessonName() {return lessonName;}

    public void setLessonName(String lessonName) {this.lessonName = lessonName;}
//
//    public int getCreditScore() {return creditScore;}
//
//    public void setCreditScore(int creditScore) {this.creditScore = creditScore;}
//
//    public boolean isCompulsory() {return compulsory;}
//
//    public void setCompulsory(boolean compulsory) {this.compulsory = compulsory;}

//    public Long getTeachers() {return teachers;}

//    public void setTeachers(Long teachers) {this.teachers = teachers;}
//
//
//    public Long getStudents() {return students;}


//    public void setStudents(Long students) {this.students = students;}

    public String getDay() {return day;}

    public void setDay(String day) {this.day = day;}

    @Override
    public String toString(){
        return
                "ObjectViceDeanPojo{" +
                        "lessonProgramId = '" + lessonProgramId + '\'' +
                        "startTime = '" + startTime + '\'' +
                        ",stopTime = '" + stopTime + '\'' +
//                        ",lessonId = '" + lessonId + '\'' +
                        ",lessonName = '" + lessonName + '\'' +
//                        ",creditScore = '" + creditScore + '\'' +
//                        ",compulsory = '" + compulsory + '\'' +
//                        ",teachers = '" + teachers + '\'' +
//                        ",students = '" +students  + '\'' +
                        ",day = '" + day + '\'' +
                        "}";
    }

}
