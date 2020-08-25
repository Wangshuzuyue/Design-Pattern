package com.hzw.pattern.observer;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;



/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 10:35
 * @Description:
 */
public abstract class AbstractTeacher {

    private String name;
    private EventBus eventBus;
    public AbstractTeacher(EventBus eventBus, String name) {
        this.name = name;
        this.eventBus = eventBus;
        eventBus.register(this);
    }

    @Subscribe
    public void receiveQuestion(QuestionCreateEvent e) {
        if (this.name == null){
            onReceiveQuestion(e);
        }else if (this.name !=null && name.equals(e.getTeacherName())){
            onReceiveQuestion(e);
        }
    }

    protected abstract void onReceiveQuestion(QuestionCreateEvent e);

    protected void questionAnswer(Question question, String answer){
        QuestionAnswerEvent event = new QuestionAnswerEvent();
        question.setAnswer(answer);
        event.setQuestion(question);
        event.setTeacherName(getName());
        eventBus.post(event);
    }

    public String getName() {
        return name;
    }
}
