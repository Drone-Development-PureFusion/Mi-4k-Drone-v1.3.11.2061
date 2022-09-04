.class public Lcn/sharesdk/facebook/e;
.super Lcom/mob/tools/FakeActivity;


# instance fields
.field private a:Lcn/sharesdk/framework/PlatformActionListener;

.field private b:Lcn/sharesdk/framework/Platform;

.field private c:Lcn/sharesdk/framework/Platform$ShareParams;

.field private d:Ljava/lang/String;

.field private e:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/mob/tools/FakeActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Intent;
    .locals 9

    const/4 v0, 0x0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.facebook.platform.PLATFORM_ACTIVITY"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "com.facebook.katana"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.category.DEFAULT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "DATA_FAILURES_FATAL"

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v4, "TITLE"

    iget-object v5, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v5}, Lcn/sharesdk/framework/Platform$ShareParams;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v4}, Lcn/sharesdk/framework/Platform$ShareParams;->getShareType()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Lcn/sharesdk/facebook/e;->a:Lcn/sharesdk/framework/PlatformActionListener;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "shareType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcn/sharesdk/facebook/e;->a:Lcn/sharesdk/framework/PlatformActionListener;

    iget-object v2, p0, Lcn/sharesdk/facebook/e;->b:Lcn/sharesdk/framework/Platform;

    const/16 v3, 0x9

    invoke-interface {v1, v2, v3, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v6}, Lcn/sharesdk/framework/Platform$ShareParams;->getImagePath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v6}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageArray()[Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    array-length v7, v6

    if-lez v7, :cond_1

    :goto_1
    array-length v7, v6

    if-ge v0, v7, :cond_1

    aget-object v7, v6, v0

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "PHOTOS"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "DESCRIPTION"

    iget-object v4, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v4}, Lcn/sharesdk/framework/Platform$ShareParams;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "NAME"

    iget-object v4, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v4}, Lcn/sharesdk/framework/Platform$ShareParams;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    const-string v0, "com.facebook.platform.protocol.METHOD_ARGS"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v0, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    const v3, 0x1339f47

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "com.facebook.platform.extra.APPLICATION_ID"

    iget-object v3, p0, Lcn/sharesdk/facebook/e;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.facebook.platform.protocol.PROTOCOL_ACTION"

    const-string v3, "com.facebook.platform.action.request.FEED_DIALOG"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v3, "action_id"

    const-string v4, "cf61947c-a8fe-4fa3-aa7c-fbeb7f291352"

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "com.facebook.platform.protocol.BRIDGE_ARGS"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-object v0, v1

    goto/16 :goto_0

    :pswitch_2
    iget-object v4, p0, Lcn/sharesdk/facebook/e;->b:Lcn/sharesdk/framework/Platform;

    iget-object v5, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v5}, Lcn/sharesdk/framework/Platform$ShareParams;->getUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Lcn/sharesdk/framework/Platform;->getShortLintk(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    const-string v4, "LINK"

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "type"

    const-string v4, "LINK"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :pswitch_3
    iget-object v0, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform$ShareParams;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/io/File;

    iget-object v4, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v4}, Lcn/sharesdk/framework/Platform$ShareParams;->getFilePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    const-string v4, "VIDEO"

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "type"

    const-string v4, "VIDEO"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "DESCRIPTION"

    iget-object v4, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v4}, Lcn/sharesdk/framework/Platform$ShareParams;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "TITLE"

    iget-object v4, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v4}, Lcn/sharesdk/framework/Platform$ShareParams;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public a(Lcn/sharesdk/framework/PlatformActionListener;Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcn/sharesdk/facebook/e;->a:Lcn/sharesdk/framework/PlatformActionListener;

    iput-object p2, p0, Lcn/sharesdk/facebook/e;->b:Lcn/sharesdk/framework/Platform;

    iput-object p3, p0, Lcn/sharesdk/facebook/e;->c:Lcn/sharesdk/framework/Platform$ShareParams;

    iput-object p4, p0, Lcn/sharesdk/facebook/e;->d:Ljava/lang/String;

    iput-object p5, p0, Lcn/sharesdk/facebook/e;->e:[Ljava/lang/String;

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    invoke-virtual {p0}, Lcn/sharesdk/facebook/e;->finish()V

    iget-object v0, p0, Lcn/sharesdk/facebook/e;->a:Lcn/sharesdk/framework/PlatformActionListener;

    iget-object v1, p0, Lcn/sharesdk/facebook/e;->b:Lcn/sharesdk/framework/Platform;

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V

    return-void
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Lcom/mob/tools/FakeActivity;->onCreate()V

    :try_start_0
    invoke-virtual {p0}, Lcn/sharesdk/facebook/e;->a()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcn/sharesdk/facebook/e;->activity:Landroid/app/Activity;

    invoke-virtual {p0}, Lcn/sharesdk/facebook/e;->a()Landroid/content/Intent;

    move-result-object v1

    const v2, 0xface

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcn/sharesdk/facebook/e;->finish()V

    iget-object v1, p0, Lcn/sharesdk/facebook/e;->a:Lcn/sharesdk/framework/PlatformActionListener;

    iget-object v2, p0, Lcn/sharesdk/facebook/e;->b:Lcn/sharesdk/framework/Platform;

    const/16 v3, 0x9

    invoke-interface {v1, v2, v3, v0}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    goto :goto_0
.end method
