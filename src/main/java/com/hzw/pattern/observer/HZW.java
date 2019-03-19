package com.hzw.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 14:19
 * @Description:
 */
public class HZW extends Student{
    public HZW(EventBus eventBus) {
        super(eventBus, "hzw");
    }

    @Override
    protected void onReceiveAnswer(QuestionAnswerEvent e) {
        System.out.println(getName() + "同学的问题收到来自"
                + e.getTeacherName() + "老师的回答：" + e.getQuestion().getAnswer());
    }
}
