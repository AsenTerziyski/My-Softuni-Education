package model.appenders;

import api.File;
import api.Layout;
import model.files.LogFile;

public class FileAppender extends BaseAppender {
    private File file;
    public FileAppender(Layout layout) {
        super(layout);
        this.setFile(new LogFile());
        //this.file = new LogFile();
    }
    public void setFile (File file) {
        this.file = file;
    }

    @Override
    public void append(String message) {
        this.file.write(message);
    }

    @Override
    public String toString() {
        String.format("%s, File size: %d", super.toString(), this.file.getSize());
        return super.toString();
    }
}
