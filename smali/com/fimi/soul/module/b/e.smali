.class public abstract Lcom/fimi/soul/module/b/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lcn/sharesdk/framework/PlatformActionListener;


# instance fields
.field protected a:Z

.field protected b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected c:Z

.field protected d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fimi/soul/module/b/a;",
            ">;"
        }
    .end annotation
.end field

.field protected e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected f:Lcn/sharesdk/framework/PlatformActionListener;

.field protected g:Lcom/fimi/soul/module/b/f;

.field protected h:Z

.field protected i:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/fimi/soul/module/b/e;->f:Lcn/sharesdk/framework/PlatformActionListener;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/fimi/soul/module/b/e$1;

    invoke-direct {v1, p0, p1}, Lcom/fimi/soul/module/b/e$1;-><init>(Lcom/fimi/soul/module/b/e;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/mob/tools/utils/UIHandler;->sendEmptyMessage(ILandroid/os/Handler$Callback;)Z

    return-void
.end method

.method private e(Lcn/sharesdk/framework/Platform;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/e;->c(Lcn/sharesdk/framework/Platform;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/e;->d(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcn/sharesdk/framework/ShareSDK;->logDemoEvent(ILcn/sharesdk/framework/Platform;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->g:Lcom/fimi/soul/module/b/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->g:Lcom/fimi/soul/module/b/f;

    invoke-interface {v1, p1, v0}, Lcom/fimi/soul/module/b/f;->a(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    invoke-virtual {p0, v1, p1, v0}, Lcom/fimi/soul/module/b/e;->a(Landroid/content/Context;Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/b/e;->h:Z

    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 4

    iput-object p1, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v1, "platform"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v1, "platform"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object v0

    instance-of v1, v0, Lcn/sharesdk/framework/CustomPlatform;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Lcn/sharesdk/framework/Platform;)Z

    move-result v2

    iget-boolean v3, p0, Lcom/fimi/soul/module/b/e;->c:Z

    if-nez v3, :cond_0

    if-nez v1, :cond_0

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/b/e;->b(Lcn/sharesdk/framework/Platform;)V

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->e(Lcn/sharesdk/framework/Platform;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/e;->b(Landroid/content/Context;)V

    goto :goto_0
.end method

.method protected abstract a(Landroid/content/Context;Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V
.end method

.method public final a(Lcn/sharesdk/framework/PlatformActionListener;)V
    .locals 0

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    iput-object p1, p0, Lcom/fimi/soul/module/b/e;->f:Lcn/sharesdk/framework/PlatformActionListener;

    return-void
.end method

.method public final a(Lcom/fimi/soul/module/b/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/e;->g:Lcom/fimi/soul/module/b/f;

    return-void
.end method

.method public final a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fimi/soul/module/b/a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/module/b/e;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public final a(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    return-void
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/b/e;->a:Z

    return-void
.end method

.method final a(Lcn/sharesdk/framework/Platform;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Wechat"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "WechatMoments"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "WechatFavorite"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "ShortMessage"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Email"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Qzone"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "QQ"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Pinterest"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Instagram"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Yixin"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "YixinMoments"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "QZone"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Mingdao"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Line"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "KakaoStory"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "KakaoTalk"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Bluetooth"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "WhatsApp"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "BaiduTieba"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Laiwang"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "LaiwangMoments"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Alipay"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "AlipayMoments"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "FacebookMessenger"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "GooglePlus"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const-string v3, "Evernote"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v2, "true"

    const-string v3, "ShareByAppClient"

    invoke-virtual {p1, v3}, Lcn/sharesdk/framework/Platform;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    const-string v3, "SinaWeibo"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "true"

    const-string v3, "ShareByAppClient"

    invoke-virtual {p1, v3}, Lcn/sharesdk/framework/Platform;->getDevinfo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.sina.weibo"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "image/*"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    if-nez v2, :cond_4

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.sina.weibog3"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "image/*"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v2

    :cond_4
    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method protected abstract b(Landroid/content/Context;)V
.end method

.method final b(Lcn/sharesdk/framework/Platform;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/e;->c(Lcn/sharesdk/framework/Platform;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/e;->d(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "ssdk_oks_sharing"

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->g:Lcom/fimi/soul/module/b/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->g:Lcom/fimi/soul/module/b/f;

    invoke-interface {v1, p1, v0}, Lcom/fimi/soul/module/b/f;->a(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    :cond_0
    iget-boolean v1, p0, Lcom/fimi/soul/module/b/e;->h:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/fimi/soul/module/b/e;->h:Z

    invoke-virtual {p1, v1}, Lcn/sharesdk/framework/Platform;->SSOSetting(Z)V

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->f:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-virtual {p1, v1}, Lcn/sharesdk/framework/Platform;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V

    invoke-virtual {p1, v0}, Lcn/sharesdk/framework/Platform;->share(Lcn/sharesdk/framework/Platform$ShareParams;)V

    :cond_2
    return-void
.end method

.method public final b(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/module/b/e;->e:Ljava/util/HashMap;

    return-void
.end method

.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/b/e;->c:Z

    return-void
.end method

.method final c(Lcn/sharesdk/framework/Platform;)Z
    .locals 8

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v0, 0x0

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v5, "Alipay"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "AlipayMoments"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_0
    move v5, v4

    :goto_0
    if-eqz v5, :cond_3

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_3

    const-string v1, "ssdk_alipay_client_inavailable"

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move v4, v0

    :cond_1
    :goto_1
    return v4

    :cond_2
    move v5, v0

    goto :goto_0

    :cond_3
    const-string v5, "KakaoTalk"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_4

    const-string v1, "ssdk_kakaotalk_client_inavailable"

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move v4, v0

    goto :goto_1

    :cond_4
    const-string v5, "KakaoStory"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_5

    const-string v1, "ssdk_kakaostory_client_inavailable"

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move v4, v0

    goto :goto_1

    :cond_5
    const-string v5, "Line"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_6

    const-string v1, "ssdk_line_client_inavailable"

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move v4, v0

    goto :goto_1

    :cond_6
    const-string v5, "WhatsApp"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_7

    const-string v1, "ssdk_whatsapp_client_inavailable"

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move v4, v0

    goto :goto_1

    :cond_7
    const-string v5, "Pinterest"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_8

    move v4, v0

    goto :goto_1

    :cond_8
    const-string v5, "Instagram"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_9

    move v4, v0

    goto :goto_1

    :cond_9
    const-string v5, "QZone"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_a

    move v4, v0

    goto/16 :goto_1

    :cond_a
    const-string v5, "Laiwang"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v7, "LaiwangMoments"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v5, :cond_b

    if-eqz v7, :cond_c

    :cond_b
    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_c

    move v4, v0

    goto/16 :goto_1

    :cond_c
    const-string v5, "YixinMoments"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    const-string v5, "Yixin"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    :cond_d
    move v5, v4

    :goto_2
    if-eqz v5, :cond_f

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v5

    if-nez v5, :cond_f

    move v4, v0

    goto/16 :goto_1

    :cond_e
    move v5, v0

    goto :goto_2

    :cond_f
    const-string v5, "WechatFavorite"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    const-string v5, "Wechat"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    const-string v5, "WechatMoments"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    :cond_10
    move v5, v4

    :goto_3
    if-eqz v5, :cond_12

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v7

    if-nez v7, :cond_12

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    const-string v2, "no_install_apk"

    invoke-static {v1, v2}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move v4, v0

    goto/16 :goto_1

    :cond_11
    move v5, v0

    goto :goto_3

    :cond_12
    const-string v7, "FacebookMessenger"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->isClientValid()Z

    move-result v6

    if-nez v6, :cond_13

    move v4, v0

    goto/16 :goto_1

    :cond_13
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "shareType"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "imagePath"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_15

    const-string v6, ".gif"

    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    if-eqz v5, :cond_14

    const/16 v0, 0x9

    :goto_4
    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v2, "shareType"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_14
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v3, "musicUrl"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v3, "musicUrl"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    if-eqz v5, :cond_18

    move v0, v1

    goto :goto_4

    :cond_15
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "viewToShare"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v3, "musicUrl"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v3, "musicUrl"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    if-eqz v5, :cond_18

    move v0, v1

    goto/16 :goto_4

    :cond_16
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "imageUrl"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1a

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v6, ".gif"

    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    if-eqz v5, :cond_17

    const/16 v0, 0x9

    goto/16 :goto_4

    :cond_17
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v6, "url"

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v3, "musicUrl"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v3, "musicUrl"

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    if-eqz v5, :cond_18

    move v0, v1

    goto/16 :goto_4

    :cond_18
    move v0, v2

    goto/16 :goto_4

    :cond_19
    move v0, v3

    goto/16 :goto_4

    :cond_1a
    move v0, v4

    goto/16 :goto_4
.end method

.method final d(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;
    .locals 8

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "ssdk_oks_share_failed"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move-object v0, v2

    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v1, "imagePath"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v3, "viewToShare"

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "screenshot"

    invoke-static {v0, v3}, Lcom/mob/tools/utils/R;->getCachePath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x64

    invoke-virtual {v1, v4, v5, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    const-string v1, "imagePath"

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    new-instance v0, Lcn/sharesdk/framework/Platform$ShareParams;

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->b:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;-><init>(Ljava/util/HashMap;)V

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v0, "ssdk_oks_share_failed"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    move-object v0, v2

    goto/16 :goto_0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    const-string v1, "ssdk_oks_share_completed"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WechatClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "WechatTimelineNotSupportedException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "WechatFavoriteNotSupportedException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    const-string v1, "no_install_apk"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v1, "GooglePlusClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "ssdk_google_plus_client_inavailable"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v1, "QQClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v0, "ssdk_qq_client_inavailable"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string v1, "YixinClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "YixinTimelineNotSupportedException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    const-string v0, "ssdk_yixin_client_inavailable"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    const-string v1, "KakaoTalkClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v0, "ssdk_kakaotalk_client_inavailable"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    const-string v1, "KakaoStoryClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v0, "ssdk_kakaostory_client_inavailable"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    const-string v1, "WhatsAppClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v0, "ssdk_whatsapp_client_inavailable"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_9
    const-string v1, "FacebookMessengerClientNotExistException"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "ssdk_facebookmessenger_client_inavailable"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_a
    const-string v0, "ssdk_oks_share_failed"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_2
    const-string v0, "ssdk_oks_share_canceled"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final onCancel(Lcn/sharesdk/framework/Platform;I)V
    .locals 2

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->arg1:I

    iput p2, v0, Landroid/os/Message;->arg2:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, p0}, Lcom/mob/tools/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z

    const/4 v0, 0x5

    invoke-static {v0, p1}, Lcn/sharesdk/framework/ShareSDK;->logDemoEvent(ILcn/sharesdk/framework/Platform;)V

    return-void
.end method

.method public final onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/Platform;",
            "I",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->arg1:I

    iput p2, v0, Landroid/os/Message;->arg2:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, p0}, Lcom/mob/tools/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z

    return-void
.end method

.method public final onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->arg1:I

    iput p2, v0, Landroid/os/Message;->arg2:I

    iput-object p3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, p0}, Lcom/mob/tools/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z

    const/4 v0, 0x4

    invoke-static {v0, p1}, Lcn/sharesdk/framework/ShareSDK;->logDemoEvent(ILcn/sharesdk/framework/Platform;)V

    return-void
.end method
