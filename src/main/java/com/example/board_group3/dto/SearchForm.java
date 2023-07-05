package com.example.board_group3.dto;
public class SearchForm {
    private String keywords;
    //private String category;
    //private String author;
    private String additionalField1;
    private int additionalField2;

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
/*
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
 */

    public String getAdditionalField1() {
        return additionalField1;
    }

    public void setAdditionalField1(String additionalField1) {
        this.additionalField1 = additionalField1;
    }

    public int getAdditionalField2() {
        return additionalField2;
    }

    public void setAdditionalField2(int additionalField2) {
        this.additionalField2 = additionalField2;
    }
}
