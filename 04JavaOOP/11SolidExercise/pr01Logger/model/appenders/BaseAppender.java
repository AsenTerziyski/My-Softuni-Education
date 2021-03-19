package model.appenders;

import api.Appender;
import api.Layout;
import enums.ReportLevel;

public abstract class BaseAppender implements Appender {
    private Layout layout;
    private ReportLevel reportLevel;
    private int messagesAppendedCount;


    protected BaseAppender(Layout layout) {
        this.layout = layout;
        this.reportLevel = ReportLevel.INFO;
        this.messagesAppendedCount = 0;
    }

//    protected Layout getLayout () {
//        return this.layout;
//    }

//    @Override
//    public void appendMessage(String datetime, String reportLevel, String message) {
//
//    }

    @Override
    public void appendMessage(String datetime, ReportLevel reportLevel, String message) {
        //System.out.println(String.format(this.layout.getLayout(), datetime, reportLevel, message));
        if (reportLevel.ordinal() >= this.reportLevel.ordinal()) {
            String result = String.format(this.layout.getLayout(), datetime, reportLevel, message);
            this.append(result);
            this.messagesAppendedCount++;
        }

    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    protected abstract void append(String result);

    @Override
    public String toString() {
        //Appender type: ConsoleAppender, Layout type: SimpleLayout, Report level: CRITICAL, Messages appended: 2
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d"
                , this.getClass().getSimpleName()
                , this.layout.getClass().getSimpleName()
                , this.reportLevel.name()
                , this.messagesAppendedCount);
    }
}
