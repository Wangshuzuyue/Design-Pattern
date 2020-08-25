package com.hzw.pattern.observer;


import com.google.common.eventbus.EventBus;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/19 10:46
 * @Description:
 */
public class ObserverTest {


    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        AbstractTeacher tom = new Tom(eventBus);
        AbstractTeacher james = new James(eventBus);

        AbstractStudent student = new GPStudent(eventBus);
        Question question1 = new Question();
        question1.setQuestioner(student.getName());
        question1.setName("观察者模式难不难？");
        question1.setContent("感觉好难啊！");
        student.createQuestion(question1, "Tom");
        System.out.println("---------------");
        Question question2 = new Question();
        question2.setQuestioner(student.getName());
        question2.setName("Mybatis源码难不难？");
        question2.setContent("感觉更难啊！");
        student.createQuestion(question2, "James");
    }
}
