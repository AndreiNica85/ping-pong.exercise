package inteliij.pingpong.exercise.model;

import java.net.URL;
import java.time.LocalDate;

public class Note {

    private int id;
    private String descr;
    private String text;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate estmDate;
    private URL link;
    private int priority;

    public Note(int id, String descr, String text, LocalDate startDate, LocalDate endDate, LocalDate estmDate, URL link, int priority) {
        super();
        this.id = id;
        this.descr = descr;
        this.text = text;
        this.startDate = startDate;
        this.endDate = endDate;
        this.estmDate = estmDate;
        this.link = link;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEstmDate() {
        return estmDate;
    }

    public void setEstmDate(LocalDate estmDate) {
        this.estmDate = estmDate;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Note [id=" + id + ", descr=" + descr + ", text=" + text + ", startDate=" + startDate + ", endDate="
                + endDate + ", estmDate=" + estmDate + ", link=" + link + ", priority=" + priority + "]";
    }

}
