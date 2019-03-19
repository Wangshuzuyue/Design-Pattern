package com.hzw.pattern.observer;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 11:08
 * @Description:
 */
public class QuestionCreateEvent {

    private String questioner;

    private String teacherName;

    private Question question;

    public String getQuestioner() {
        return questioner;
    }

    public void setQuestioner(String questioner) {
        this.questioner = questioner;
    }

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
                "questioner='" + questioner + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", question=" + question +
                '}';
    }
}
