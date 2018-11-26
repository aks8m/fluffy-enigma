package com.github.aks8m.plugin;

public class MendeleyDocument {

    private final String id;
    private final String title;

    public MendeleyDocument(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
