package engine;

import api.Appender;
import api.Layout;
import api.Logger;
import enums.ReportLevel;
import model.appenders.ConsoleAppender;
import model.layouts.SimpleLayout;
import model.loggers.MessageLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Engine implements Runnable {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int appendersCount = Integer.parseInt(reader.readLine());
            Appender[] appenders = new Appender[appendersCount];
            for (int i = 0; i < appendersCount; i++) {
                String[] tokens = reader.readLine().split("\\s+");
                String appenderType = tokens[0];
                String layoutType = tokens[1];
                ReportLevel reportLevel = tokens.length == 3 ? ReportLevel.valueOf(tokens[2]) : ReportLevel.INFO;

                Layout layout = this.getLayout(layoutType);
                Appender appender = this.getAppender(appenderType, layout);
                appender.setReportLevel(reportLevel);
                appenders[i] = appender;
            }

            Logger logger = new MessageLogger(appenders);
            String command = reader.readLine();
            while (!"END".equals(command)) {
                String[] tokens = command.split("\\|");
                ReportLevel reportLevel = ReportLevel.valueOf(tokens[0]);
                String dateTime = tokens[1];
                String message = tokens[2];
                this.logMessage(logger, reportLevel, dateTime, message);

                command = reader.readLine();
            }
            System.out.println(logger.getLogInfo());

        } catch (IOException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }


//
//        Layout simpleLayout = new SimpleLayout();
//        Appender consoleAppender = new ConsoleAppender(simpleLayout);
//        consoleAppender.setReportLevel(ReportLevel.ERROR);
//
//        Logger logger = new MessageLogger(consoleAppender);
//
//        logger.logInfo("3/31/2015 5:33:07 PM", "Everything seems fine");
//        logger.logWarning("3/31/2015 5:33:07 PM", "Warning: ping is too high - disconnect imminent");
//        logger.logError("3/31/2015 5:33:07 PM", "Error parsing request");
//        logger.logCritical("3/31/2015 5:33:07 PM", "No connection string found in App.config");
//        logger.logFatal("3/31/2015 5:33:07 PM", "mscorlib.dll does not respond");


    }

    private void logMessage(Logger logger, ReportLevel reportLevel, String dateTime, String message) throws InvocationTargetException, IllegalAccessException {
        Class loggerClass = logger.getClass();
        Method method = Arrays.stream(loggerClass.getMethods()).filter(m-> m.getName().equalsIgnoreCase("log" + reportLevel))
                .findFirst().orElseThrow();
        method.invoke(logger,dateTime, message);
    }

    private Appender getAppender(String appenderType, Layout layout) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("model.appenders." + appenderType);
        return (Appender) clazz.getConstructor(Layout.class).newInstance(layout);
    }

    private Layout getLayout(String layoutType) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("model.layouts." + layoutType);

        return (Layout) clazz.getConstructor().newInstance();
    }
}
