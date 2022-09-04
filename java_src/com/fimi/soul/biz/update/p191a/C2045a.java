package com.fimi.soul.biz.update.p191a;

import android.util.Xml;
import com.fimi.soul.biz.update.AbstractC2076h;
import com.fimi.soul.entity.FirmwareInfo;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
/* renamed from: com.fimi.soul.biz.update.a.a */
/* loaded from: classes.dex */
public class C2045a implements AbstractC2076h {
    @Override // com.fimi.soul.biz.update.AbstractC2076h
    /* renamed from: a */
    public String mo33069a(List<FirmwareInfo> list) {
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        StringWriter stringWriter = new StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument("UTF-8", true);
        newSerializer.startTag("", "firmwares");
        for (FirmwareInfo firmwareInfo : list) {
            newSerializer.startTag("", "firmware");
            newSerializer.attribute("", "sysId", firmwareInfo.getSysId() + "");
            newSerializer.startTag("", "model");
            newSerializer.text(firmwareInfo.getModel() + "");
            newSerializer.endTag("", "model");
            newSerializer.startTag("", "sysName");
            newSerializer.text(firmwareInfo.getSysName());
            newSerializer.endTag("", "sysName");
            newSerializer.startTag("", "version");
            newSerializer.text(firmwareInfo.getVersion() + "");
            newSerializer.endTag("", "version");
            newSerializer.startTag("", "isLowVersion");
            newSerializer.text(firmwareInfo.getIsLowVersion() + "");
            newSerializer.endTag("", "isLowVersion");
            newSerializer.startTag("", "inputTime");
            newSerializer.text(firmwareInfo.getInputTime() + "");
            newSerializer.endTag("", "inputTime");
            newSerializer.startTag("", "sort");
            newSerializer.text(firmwareInfo.getSort() + "");
            newSerializer.endTag("", "sort");
            newSerializer.endTag("", "firmware");
        }
        newSerializer.endTag("", "firmwares");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    @Override // com.fimi.soul.biz.update.AbstractC2076h
    /* renamed from: a */
    public List<FirmwareInfo> mo33070a(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, "UTF-8");
        ArrayList arrayList = null;
        FirmwareInfo firmwareInfo = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            switch (eventType) {
                case 0:
                    arrayList = new ArrayList();
                    break;
                case 2:
                    if (newPullParser.getName().equals("firmware")) {
                        firmwareInfo = new FirmwareInfo();
                        break;
                    } else if (newPullParser.getName().equals("sysId")) {
                        newPullParser.next();
                        firmwareInfo.setSysId(Integer.valueOf(newPullParser.getText()).intValue());
                        break;
                    } else if (newPullParser.getName().equals("model")) {
                        newPullParser.next();
                        firmwareInfo.setModel(Integer.valueOf(newPullParser.getText()).intValue());
                        break;
                    } else if (newPullParser.getName().equals("sysName")) {
                        newPullParser.next();
                        firmwareInfo.setSysName(newPullParser.getText());
                        break;
                    } else if (newPullParser.getName().equals("status")) {
                        newPullParser.next();
                        firmwareInfo.setStatus(newPullParser.getText());
                        break;
                    } else if (newPullParser.getName().equals("isLowVersion")) {
                        newPullParser.next();
                        firmwareInfo.setIsLowVersion(Integer.valueOf(newPullParser.getText()).intValue());
                        break;
                    } else if (newPullParser.getName().equals("inputTime")) {
                        newPullParser.next();
                        firmwareInfo.setInputTime(newPullParser.getText());
                        break;
                    } else if (newPullParser.getName().equals("sort")) {
                        newPullParser.next();
                        firmwareInfo.setSort(Integer.valueOf(newPullParser.getText()).intValue());
                        break;
                    } else if (newPullParser.getName().equals("version")) {
                        newPullParser.next();
                        firmwareInfo.setVersion(newPullParser.getText());
                        break;
                    } else if (newPullParser.getName().equals("fileName")) {
                        newPullParser.next();
                        firmwareInfo.setFileName(newPullParser.getText());
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (newPullParser.getName().equals("firmware")) {
                        arrayList.add(firmwareInfo);
                        firmwareInfo = null;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return arrayList;
    }
}
