package com.xiaomi.infra.galaxy.fds.android.auth;

import com.google.gson.Gson;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.StorageAccessToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
/* loaded from: classes2.dex */
public class OAuthCredential implements GalaxyFDSCredential {
    private static final String APP_ID = "appId";
    private static final String OAUTH_ACCESS_TOKEN = "oauthAccessToken";
    private static final String OAUTH_APPID = "oauthAppId";
    private static final String OAUTH_MAC_ALGORITHM = "oauthMacAlgorithm";
    private static final String OAUTH_MAC_KEY = "oauthMacKey";
    private static final String OAUTH_PROVIDER = "oauthProvider";
    private static final String STORAGE_ACCESS_TOKEN = "storageAccessToken";
    private final String HEADER_VALUE = "OAuth";
    private final String appId;
    private final StorageAccessToken storageAccessToken;

    public OAuthCredential(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.appId = str2;
        this.storageAccessToken = getStorageAccessToken(str, str2, str3, str4, str5, str6, str7);
    }

    private StorageAccessToken getStorageAccessToken(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(str + "/?" + STORAGE_ACCESS_TOKEN + "&" + APP_ID + "=" + str2 + "&" + OAUTH_APPID + "=" + str3 + "&" + OAUTH_ACCESS_TOKEN + "=" + str4 + "&" + OAUTH_PROVIDER + "=" + str5 + "&" + OAUTH_MAC_ALGORITHM + "=" + str7 + "&" + OAUTH_MAC_KEY + "=" + str6);
            httpGet.setHeader("Authorization", "OAuth");
            HttpResponse execute = defaultHttpClient.execute(httpGet);
            if (execute.getStatusLine().getStatusCode() != 200) {
                throw new GalaxyFDSClientException("Failed to get the storage access token from FDS server. URI:" + httpGet.getURI().toString() + ".Reason:" + execute.getStatusLine().toString());
            }
            InputStream content = execute.getEntity().getContent();
            StorageAccessToken storageAccessToken = (StorageAccessToken) new Gson().fromJson((Reader) new InputStreamReader(content), (Class<Object>) StorageAccessToken.class);
            content.close();
            return storageAccessToken;
        } catch (IOException e) {
            throw new GalaxyFDSClientException("Failed to get the storage access token", e);
        }
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public void addHeader(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("Authorization", "OAuth");
    }

    @Override // com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential
    public String addParam(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) == -1) {
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(APP_ID);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.appId);
        sb.append('&');
        sb.append(STORAGE_ACCESS_TOKEN);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.storageAccessToken.getToken());
        return sb.toString();
    }
}
