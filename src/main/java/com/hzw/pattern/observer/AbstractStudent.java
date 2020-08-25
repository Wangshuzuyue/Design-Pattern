package com.hzw.pattern.observer;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 10:36
 * @Description:
 */
public abstract class AbstractStudent {
    private EventBus eventBus;

    private String name;

    public AbstractStudent(EventBus eventBus, String name) {
        this.eventBus = eventBus;
        this.name = name;
        eventBus.register(this);
    }

    public String getName() {
        return name;
    }

    public void createQuestion(Question question, String teacherName){
        System.out.println("学生" + getName() + "向 " + teacherName + "老师提问题：" + question);
        QuestionCreateEvent event = new QuestionCreateEvent();
        event.setQuestion(question);
        event.setTeacherName(teacherName);
        event.setQuestioner(getName());
        eventBus.post(event);
    }

    @Subscribe
    public void receiveAnswer(QuestionAnswerEvent e) {
        if (this.name == null){
            onReceiveAnswer(e);
        }else if (this.name !=null && name.equals(e.getQuestion().getQuestioner())){
            onReceiveAnswer(e);
        }
    }

    protected abstract void onReceiveAnswer(QuestionAnswerEvent e);
}
