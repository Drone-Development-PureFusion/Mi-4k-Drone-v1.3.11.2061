package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1950p;
import com.fimi.soul.entity.CityInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.WeatherInfo;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.t */
/* loaded from: classes.dex */
public class C1934t implements AbstractC1950p {
    public C1934t(Context context) {
    }

    /* renamed from: a */
    private CityInfo m33508a(Context context) {
        return null;
    }

    /* renamed from: b */
    private PlaneMsg m33507b(CityInfo cityInfo, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getweatherIDbyCity"));
        arrayList.add(new BasicNameValuePair("city", cityInfo.getCity()));
        arrayList.add(new BasicNameValuePair("town", cityInfo.getTown()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((CityInfo) C3083ak.m29323b(CityInfo.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            }
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1950p
    /* renamed from: a */
    public PlaneMsg mo33450a(Context context, CityInfo cityInfo) {
        if (cityInfo != null) {
            return mo33449a(cityInfo, context);
        }
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1950p
    /* renamed from: a */
    public PlaneMsg mo33449a(CityInfo cityInfo, Context context) {
        PlaneMsg planeMsg = new PlaneMsg();
        PlaneMsg m33507b = m33507b(cityInfo, context);
        if (m33507b.isSuccess()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("source", "fimi"));
            arrayList.add(new BasicNameValuePair("cityId", ((CityInfo) m33507b.getData()).getWeatherID()));
            String m29410a = NetUtil.m29410a("http://weatherapi.market.xiaomi.com/wtr-v2/weather", arrayList, context, true);
            if (m29410a != null) {
                try {
                    if (!"".equalsIgnoreCase(m29410a)) {
                        JSONObject jSONObject = new JSONObject(m29410a);
                        WeatherInfo weatherInfo = null;
                        if (!jSONObject.isNull("forecast")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("forecast");
                            weatherInfo = new WeatherInfo();
                            weatherInfo.setCity(cityInfo.getCity());
                            weatherInfo.setWD(jSONObject2.getString("fx1"));
                            weatherInfo.setWS(jSONObject2.getString("fl1"));
                            weatherInfo.setWeather(jSONObject2.getString("weather1"));
                            weatherInfo.setTemp(jSONObject2.getString("temp1"));
                            weatherInfo.setIndex_tr(jSONObject2.getString("index_ls"));
                        }
                        planeMsg.setData(weatherInfo);
                        planeMsg.setSuccess(true);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            planeMsg.setSuccess(false);
            planeMsg.setErrorMessage("天气无法获取");
        } else {
            planeMsg.setSuccess(false);
        }
        return planeMsg;
    }
}
