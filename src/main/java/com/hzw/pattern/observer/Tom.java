package com.hzw.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 11:23
 * @Description:
 */
public class Tom extends Teacher{
    public Tom(EventBus eventBus) {
        super(eventBus, "Tom");
    }

    @Override
    protected void onReceiveQuestion(QuestionCreateEvent e) {
        System.out.println(getName() + "老师收到问题：" + e);
        questionAnswer(e.getQuestion(),"观察者模式其实很简单");
    }
}
