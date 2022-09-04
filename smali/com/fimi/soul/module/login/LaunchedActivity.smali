.class public Lcom/fimi/soul/module/login/LaunchedActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field private static final e:I = 0x2

.field private static final f:I = 0x3


# instance fields
.field a:Z

.field b:Landroid/content/Intent;

.field c:Lcom/fimi/kernel/utils/v;

.field private final d:I

.field private g:Landroid/content/Context;

.field private h:Lcom/fimi/soul/biz/manager/y;

.field private i:Landroid/os/Handler;

.field private j:Z

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->d:I

    iput-boolean v1, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->j:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->a:Z

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LaunchedActivity;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LaunchedActivity;Lcom/fimi/soul/biz/manager/y;)Lcom/fimi/soul/biz/manager/y;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->h:Lcom/fimi/soul/biz/manager/y;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LaunchedActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/login/LaunchedActivity;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 4

    iput-boolean p1, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->j:Z

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    iget-boolean v1, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->i:Landroid/os/Handler;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/login/LaunchedActivity;)Lcom/fimi/soul/biz/manager/y;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->h:Lcom/fimi/soul/biz/manager/y;

    return-object v0
.end method

.method private b(Z)V
    .locals 6

    const/4 v3, 0x3

    const/4 v2, 0x2

    const/4 v5, 0x1

    iget-boolean v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->a:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {p0}, Lcom/fimi/soul/utils/au;->k(Landroid/content/Context;)V

    iput-boolean v5, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->a:Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->i:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->i:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-eqz p1, :cond_2

    const-string v1, "select_corresponding_view"

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :goto_1
    const-string v1, "islaunchexit"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LaunchedActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "launchBundle"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "redirectURL"

    const-string v4, "redirectURL"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "islaunch"

    invoke-virtual {v2, v1, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "launchBundle"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_1
    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LaunchedActivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LaunchedActivity;->finish()V

    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/login/LaunchedActivity;->overridePendingTransition(II)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->r()I

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "select_corresponding_view"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_1

    :cond_3
    const-string v1, "select_corresponding_view"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_1
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/login/LaunchedActivity;->b(Z)V

    const/4 v0, 0x0

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LaunchedActivity;->isTaskRoot()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LaunchedActivity;->finish()V

    :goto_0
    return-void

    :cond_0
    const v0, 0x7f040035

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LaunchedActivity;->setContentView(I)V

    invoke-static {}, Lcom/fimi/soul/utils/ad;->d()V

    invoke-static {p0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->c:Lcom/fimi/kernel/utils/v;

    const-string v0, "is_setting_enter"

    iget-object v3, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->c:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v3}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->i:Landroid/os/Handler;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->mTintManager:Lcom/fimi/kernel/utils/w;

    invoke-virtual {v0, v1, p0}, Lcom/fimi/kernel/utils/w;->a(ZLandroid/app/Activity;)V

    iput-object p0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->g:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    const-class v3, Lcom/fimi/soul/service/InitAppService;

    invoke-direct {v0, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->b:Landroid/content/Intent;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->b:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LaunchedActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    new-instance v3, Landroid/os/Message;

    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->c:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v4, "isfirstloading"

    invoke-interface {v0, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, v3, Landroid/os/Message;->what:I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->i:Landroid/os/Handler;

    const-wide/16 v4, 0x7d0

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    const v0, 0x7f100175

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LaunchedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f100176

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LaunchedActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LaunchedActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/view/View;

    iget-object v4, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->k:Landroid/widget/TextView;

    aput-object v4, v3, v2

    iget-object v2, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->l:Landroid/widget/TextView;

    aput-object v2, v3, v1

    invoke-static {v0, v3}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/MyLocationManager;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/MyLocationManager;

    goto/16 :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->a:Z

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onResume()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LaunchedActivity;->a:Z

    new-instance v0, Lcom/fimi/soul/module/login/LaunchedActivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/LaunchedActivity$1;-><init>(Lcom/fimi/soul/module/login/LaunchedActivity;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->a(Ljava/lang/Runnable;)V

    return-void
.end method
