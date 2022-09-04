package cn.sharesdk.framework.authorize;

import cn.sharesdk.framework.Platform;
/* loaded from: classes.dex */
public interface AuthorizeHelper {
    AuthorizeListener getAuthorizeListener();

    String getAuthorizeUrl();

    AbstractC0787b getAuthorizeWebviewClient(C0790e c0790e);

    Platform getPlatform();

    String getRedirectUri();

    SSOListener getSSOListener();

    AbstractC0789d getSSOProcessor(C0788c c0788c);
}
