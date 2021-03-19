package model.layouts;

import api.Layout;

public class XmlLayout implements Layout {
    //<log>
    //<date>3/31/2015 5:33:07 PM</date>
    //<level>ERROR</level>
    //<message>Error parsing request</message>
    //</log>
    @Override
    public String getLayout() {
        StringBuilder sb = new StringBuilder();
        sb.append("<log>")
                .append(System.lineSeparator())
                .append("<date>%s</date>")
                .append(System.lineSeparator())
                .append("<level>%s</level>")
                .append(System.lineSeparator())
                .append("<message>%s</message>")
                .append(System.lineSeparator())
                .append("</log>");
        return sb.toString();
    }
}
