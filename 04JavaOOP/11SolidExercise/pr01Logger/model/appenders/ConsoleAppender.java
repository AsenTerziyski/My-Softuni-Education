package model.appenders;

import api.Appender;
import api.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

//    @Override
//    public void appendMessage(String datetime, String reportLevel, String message) {
//        System.out.println(String.format(super.getLayout().getLayout(), datetime, reportLevel, message));
//
//    }

    @Override
    public void append(String message) {
        System.out.println(message);
    }
}
