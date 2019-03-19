package com.hzw.pattern.observer;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 11:08
 * @Description:
 */
public class QuestionAnswerEvent {

    private String teacherName;

    private Question question;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "QuestionCreateEvent{" +
                ", teacherName='" + teacherName + '\'' +
                ", question=" + question +
                '}';
    }
}
