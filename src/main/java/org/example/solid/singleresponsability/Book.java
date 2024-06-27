package org.example.solid.singleresponsability;

import java.util.Date;

public class Book {
    private String title;
    private String autor;
    private Date publishDate;

    public Book(String title, String autor, Date publishDate) {
        this.title = title;
        this.autor = autor;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
