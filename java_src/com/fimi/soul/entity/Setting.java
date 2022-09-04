package com.fimi.soul.entity;

import com.fimi.soul.module.setting.C2932i;
import java.util.Observable;
/* loaded from: classes.dex */
public class Setting extends Observable {
    private String content;

    /* renamed from: id */
    private int f7785id;
    private boolean isCheckedButton;
    private C2932i.EnumC2937d mSettingAdaptState;
    private int newHandModel;
    private Boolean isOPen = false;
    private boolean displayTv = false;

    public String getContent() {
        return this.content;
    }

    public int getId() {
        return this.f7785id;
    }

    public Boolean getIsOPen() {
        return this.isOPen;
    }

    public int getNewHandModel() {
        return this.newHandModel;
    }

    public C2932i.EnumC2937d getSettingAdaptState() {
        return this.mSettingAdaptState;
    }

    public boolean isCheckedButton() {
        return this.isCheckedButton;
    }

    public boolean isDisplayTv() {
        return this.displayTv;
    }

    public void setCheckedButton(boolean z) {
        this.isCheckedButton = z;
    }

    public void setContent(String str) {
        this.content = str;
        setChanged();
        notifyObservers();
    }

    public void setDisplayTv(boolean z) {
        this.displayTv = z;
    }

    public void setId(int i) {
        this.f7785id = i;
    }

    public void setIsOPen(Boolean bool) {
        if (this.isOPen != null) {
            if ((!bool.booleanValue()) != this.isOPen.booleanValue()) {
                return;
            }
            setChanged();
            notifyObservers();
            this.isOPen = bool;
        }
    }

    public void setNewHandModel(int i) {
        this.newHandModel = i;
    }

    public void setSettingAdaptState(C2932i.EnumC2937d enumC2937d) {
        this.mSettingAdaptState = enumC2937d;
    }
}
