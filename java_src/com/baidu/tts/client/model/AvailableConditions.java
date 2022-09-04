package com.baidu.tts.client.model;

import com.baidu.tts.tools.StringTool;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class AvailableConditions {

    /* renamed from: a */
    private Set<String> f2620a;

    /* renamed from: b */
    private Set<String> f2621b;

    public void appendGender(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2620a == null) {
            this.f2620a = new HashSet();
        }
        this.f2620a.add(str);
    }

    public void appendSpeaker(String str) {
        if (StringTool.isEmpty(str)) {
            return;
        }
        if (this.f2621b == null) {
            this.f2621b = new HashSet();
        }
        this.f2621b.add(str);
    }

    public Set<String> getGenders() {
        return this.f2620a;
    }

    public Set<String> getSpeakers() {
        return this.f2621b;
    }

    public void setGenders(Set<String> set) {
        this.f2620a = set;
    }

    public void setSpeakers(Set<String> set) {
        this.f2621b = set;
    }
}
