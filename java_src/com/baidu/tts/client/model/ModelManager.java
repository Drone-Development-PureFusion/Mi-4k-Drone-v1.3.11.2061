package com.baidu.tts.client.model;

import android.content.Context;
import com.baidu.tts.p098d.C1143b;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p112l.C1202a;
import java.util.Set;
/* loaded from: classes.dex */
public class ModelManager {

    /* renamed from: a */
    private C1202a f2664a;

    public ModelManager(Context context) {
        this.f2664a = new C1202a(context);
    }

    /* renamed from: a */
    private Conditions m36515a() {
        Conditions conditions = new Conditions();
        LibEngineParams engineParams = getEngineParams();
        conditions.setVersion(engineParams.getVersion());
        conditions.setDomains(engineParams.getDomain());
        conditions.setLanguages(engineParams.getLanguage());
        conditions.setQualitys(engineParams.getQuality());
        return conditions;
    }

    /* renamed from: a */
    private Conditions m36514a(AvailableConditions availableConditions) {
        Conditions m36515a = m36515a();
        if (m36515a != null && availableConditions != null) {
            m36515a.setSpeakers(availableConditions.getSpeakers());
            m36515a.setGenders(availableConditions.getGenders());
        }
        return m36515a;
    }

    public DownloadHandler download(String str, OnDownloadListener onDownloadListener) {
        C1143b c1143b = new C1143b();
        c1143b.m36477a(str);
        c1143b.m36478a(onDownloadListener);
        return this.f2664a.m36241a(c1143b);
    }

    public LibEngineParams getEngineParams() {
        return this.f2664a.m36245a();
    }

    public BasicHandler<ModelFileBags> getLocalModelFileInfos(Set<String> set) {
        return this.f2664a.m36234b(set);
    }

    public BasicHandler<ModelBags> getLocalModels(Conditions conditions) {
        return this.f2664a.m36242a(conditions, false);
    }

    public BasicHandler<ModelBags> getLocalModelsAvailable(AvailableConditions availableConditions) {
        return this.f2664a.m36242a(m36514a(availableConditions), true);
    }

    public BasicHandler<ModelBags> getServerDefaultModels() {
        return this.f2664a.m36236b();
    }

    public BasicHandler<ModelFileBags> getServerModelFileInfos(Set<String> set) {
        return this.f2664a.m36237a(set);
    }

    public BasicHandler<ModelBags> getServerModels(Conditions conditions) {
        return this.f2664a.m36243a(conditions);
    }

    public BasicHandler<ModelBags> getServerModelsAvailable(AvailableConditions availableConditions) {
        return getServerModels(m36514a(availableConditions));
    }

    public String getSpeechModelFileAbsPath(String str) {
        return this.f2664a.m36239a(EnumC1175g.SPEECH_DATA_ID.m36317b(), str);
    }

    public String getTextModelFileAbsPath(String str) {
        return this.f2664a.m36239a(EnumC1175g.TEXT_DATA_ID.m36317b(), str);
    }

    public boolean isModelFileValid(String str) {
        return this.f2664a.m36240a(str);
    }

    public boolean isModelValid(String str) {
        return this.f2664a.m36235b(str);
    }

    public int stop() {
        this.f2664a.m36233c();
        return 0;
    }
}
