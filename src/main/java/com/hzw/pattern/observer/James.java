package com.hzw.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 11:23
 * @Description:
 */
public class James extends AbstractTeacher {
    public James(EventBus eventBus) {
        super(eventBus, "James");
    }

    @Override
    protected void onReceiveQuestion(QuestionCreateEvent e) {
        System.out.println(getName() + "老师收到消息：" + e);
        questionAnswer(e.getQuestion(),"只要用心学就肯定能学会");
    }
}
