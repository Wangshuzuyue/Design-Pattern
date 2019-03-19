package com.hzw.pattern.observer;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 10:53
 * @Description:
 */
public class Question {
    private String questioner;
    private String name;
    private String content;
    private String answer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestioner() {
        return questioner;
    }

    public void setQuestioner(String questioner) {
        this.questioner = questioner;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questioner='" + questioner + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
