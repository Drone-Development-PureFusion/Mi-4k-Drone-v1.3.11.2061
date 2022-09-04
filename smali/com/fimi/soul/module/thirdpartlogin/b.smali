.class public Lcom/fimi/soul/module/thirdpartlogin/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field private static final a:I = 0x1

.field private static final b:I = 0x2

.field private static final c:I = 0x3


# instance fields
.field private d:Lcom/fimi/soul/module/thirdpartlogin/d;

.field private e:Ljava/lang/String;

.field private f:Landroid/content/Context;

.field private g:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->g:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/thirdpartlogin/b;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->g:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    const/4 v3, 0x1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->f:Landroid/content/Context;

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->e:Ljava/lang/String;

    invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v0, v3}, Lcn/sharesdk/framework/Platform;->removeAccount(Z)V

    sget-object v1, Lcn/sharesdk/facebook/Facebook;->NAME:Ljava/lang/String;

    iget-object v2, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->SSOSetting(Z)V

    :goto_1
    new-instance v1, Lcom/fimi/soul/module/thirdpartlogin/b$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/thirdpartlogin/b$1;-><init>(Lcom/fimi/soul/module/thirdpartlogin/b;)V

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->showUser(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v3}, Lcn/sharesdk/framework/Platform;->SSOSetting(Z)V

    goto :goto_1
.end method

.method public a(Lcom/fimi/soul/module/thirdpartlogin/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->d:Lcom/fimi/soul/module/thirdpartlogin/d;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->e:Ljava/lang/String;

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    const/4 v4, 0x0

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return v4

    :pswitch_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0b011d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->d:Lcom/fimi/soul/module/thirdpartlogin/d;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->d:Lcom/fimi/soul/module/thirdpartlogin/d;

    const-string v2, ""

    invoke-interface {v1, v2, v0}, Lcom/fimi/soul/module/thirdpartlogin/d;->a(Ljava/lang/String;Ljava/util/HashMap;)Z

    goto :goto_0

    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "caught error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "msg"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->d:Lcom/fimi/soul/module/thirdpartlogin/d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->d:Lcom/fimi/soul/module/thirdpartlogin/d;

    const-string v3, ""

    invoke-interface {v1, v3, v2}, Lcom/fimi/soul/module/thirdpartlogin/d;->a(Ljava/lang/String;Ljava/util/HashMap;)Z

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v1, v0, v4

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    check-cast v0, Ljava/util/HashMap;

    iget-object v2, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->d:Lcom/fimi/soul/module/thirdpartlogin/d;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/thirdpartlogin/b;->d:Lcom/fimi/soul/module/thirdpartlogin/d;

    invoke-interface {v2, v1, v0}, Lcom/fimi/soul/module/thirdpartlogin/d;->a(Ljava/lang/String;Ljava/util/HashMap;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
