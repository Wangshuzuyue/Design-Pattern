package com.hzw.pattern.observer;


import com.google.common.eventbus.EventBus;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 10:46
 * @Description:
 */
public class ObserverTest {
    public static void main(String[] args) {
        //Guava API 可以用EventBus对象完全取代Gper对象
        EventBus eventBus = new EventBus();
        Teacher tom = new Tom(eventBus);
        Teacher james = new James(eventBus);

        Student student = new HZW(eventBus);
        Question question1 = new Question();
        question1.setQuestioner("hzw");
        question1.setName("观察者模式难不难？");
        question1.setContent("感觉好难啊！");
        student.createQuestion(question1, "Tom");
        Question question2 = new Question();
        question2.setQuestioner("hzw");
        question2.setName("Mybatis源码难不难？");
        question2.setContent("感觉更难啊！");
        student.createQuestion(question2, "James");
    }
}
