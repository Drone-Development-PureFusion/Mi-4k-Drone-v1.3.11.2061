package com.fimi.soul.entity;
/* loaded from: classes.dex */
public class FmMenuItem {
    private int iconId;

    /* renamed from: id */
    private int f7782id;
    private String mark;
    private String text;

    public FmMenuItem() {
    }

    public FmMenuItem(int i, String str) {
        this.f7782id = i;
        this.text = str;
    }

    public FmMenuItem(String str) {
        this.text = str;
    }

    public int getIconId() {
        return this.iconId;
    }

    public int getId() {
        return this.f7782id;
    }

    public String getMark() {
        return this.mark;
    }

    public String getText() {
        return this.text;
    }

    public void setIconId(int i) {
        this.iconId = i;
    }

    public void setId(int i) {
        this.f7782id = i;
    }

    public void setMark(String str) {
        this.mark = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
