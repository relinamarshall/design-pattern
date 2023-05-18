package com.design.pattern.template.method.example;

/**
 * TestWorker
 *
 * @author Wenzhou
 * @since 2023/5/18 10:52
 */
public class TestWorker {
    public static void main(String[] args) {
        ITWorker itWorker = new ITWorker("景彬");
        itWorker.workOneDay();
        HRWorker hrWorker = new HRWorker("莉莉姐");
        hrWorker.workOneDay();
        QAWorker qaWorker = new QAWorker("张元元");
        qaWorker.workOneDay();
        QAWorker qaWorker1 = new QAWorker("徐晨星");
        qaWorker1.workOneDay();
        CTOWorker ctoWorker = new CTOWorker("远哥");
        ctoWorker.workOneDay();
    }
}
