package com.proyek.rahmanjai.eatit.Model;

/**
 * Created by Rishabh Gupta on 29-03-2019
 */

public class DetailResult {
    String status;
    DetailSinglePlace result;

    public DetailResult() {
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DetailSinglePlace getResult() {
        return result;
    }

    public void setResult(DetailSinglePlace result) {
        this.result = result;
    }
}
