package api;

import enums.ReportLevel;

public interface Appender {
    // ще добавя дата, левъл и месидж. Няма да връща.
    void appendMessage(String datetime, ReportLevel reportLevel, String message);

    void setReportLevel(ReportLevel reportLevel);

    //void appendMessage(String datetime, ReportLevel reportLevel, String message);

    //void append (String message);
}
