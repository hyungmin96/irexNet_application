package com.example.irexnet;

public class dataClass {

    String _title;
    String _date;

    public dataClass(String _title, String _date){
        this._title = _title;
        this._date = _date;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

}
