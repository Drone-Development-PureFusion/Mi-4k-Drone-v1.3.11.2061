.class Lcom/xiaomi/market/sdk/t;
.super Landroid/os/AsyncTask;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/xiaomi/market/sdk/t;)V
    .locals 0

    invoke-direct {p0}, Lcom/xiaomi/market/sdk/t;-><init>()V

    return-void
.end method

.method private a(Lorg/json/JSONObject;)Lcom/xiaomi/market/sdk/w;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string v1, "MarketUpdateAgent"

    const-string v2, "update info json obj null"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v0

    :cond_0
    sget-boolean v1, Lcom/xiaomi/market/sdk/s;->DEBUG:Z

    if-eqz v1, :cond_1

    const-string v1, "MarketUpdateAgent"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "updateInfo : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v1, Lcom/xiaomi/market/sdk/w;

    invoke-direct {v1}, Lcom/xiaomi/market/sdk/w;-><init>()V

    :try_start_0
    const-string v2, "host"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/xiaomi/market/sdk/w;->bi:Ljava/lang/String;

    const-string v2, "fitness"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Lcom/xiaomi/market/sdk/w;->bk:I

    const-string v2, "source"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Lcom/xiaomi/market/sdk/w;->bj:I

    const-string v2, "updateLog"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/xiaomi/market/sdk/w;->updateLog:Ljava/lang/String;

    const-string v2, "versionCode"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Lcom/xiaomi/market/sdk/w;->versionCode:I

    const-string v2, "versionName"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/xiaomi/market/sdk/w;->versionName:Ljava/lang/String;

    const-string v2, "apk"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/xiaomi/market/sdk/w;->bl:Ljava/lang/String;

    const-string v2, "apkHash"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/xiaomi/market/sdk/w;->bm:Ljava/lang/String;

    const-string v2, "apkSize"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/xiaomi/market/sdk/w;->bn:J

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->r()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "diffFile"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/xiaomi/market/sdk/w;->bo:Ljava/lang/String;

    const-string v2, "diffFileHash"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/xiaomi/market/sdk/w;->bp:Ljava/lang/String;

    const-string v2, "diffFileSize"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/xiaomi/market/sdk/w;->bq:J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    move-object v0, v1

    goto/16 :goto_0

    :catch_0
    move-exception v1

    const-string v2, "MarketUpdateAgent"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "get update info failed : "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "MarketUpdateAgent"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "original content : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method

.method private w()Ljava/lang/String;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "screenSize"

    new-instance v2, Ljava/lang/StringBuilder;

    sget v3, Lcom/xiaomi/market/sdk/a;->b:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "*"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/xiaomi/market/sdk/a;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "resolution"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "density"

    sget v2, Lcom/xiaomi/market/sdk/a;->e:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "touchScreen"

    sget v2, Lcom/xiaomi/market/sdk/a;->f:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "glEsVersion"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "feature"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "library"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "glExtension"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "sdk"

    sget v2, Lcom/xiaomi/market/sdk/a;->k:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "version"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "release"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "deviceId"

    sget-object v2, Lcom/xiaomi/market/sdk/a;->m:Ljava/lang/String;

    invoke-static {v2}, Lcom/xiaomi/market/sdk/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, ""

    goto :goto_0
.end method

.method private static x()V
    .locals 8

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v5, 0x0

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MarketUpdateAgent"

    const-string v1, "activity not running!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "string"

    const-string v4, "xiaomi_update_dialog_title"

    invoke-static {v2, v3, v4}, Lcom/xiaomi/market/sdk/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->q()Lcom/xiaomi/market/sdk/q;

    move-result-object v4

    iget-object v4, v4, Lcom/xiaomi/market/sdk/q;->aT:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v0

    iget-object v0, v0, Lcom/xiaomi/market/sdk/w;->bo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "string"

    const-string v4, "xiaomi_update_dialog_message"

    invoke-static {v2, v3, v4}, Lcom/xiaomi/market/sdk/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v4

    iget-object v4, v4, Lcom/xiaomi/market/sdk/w;->versionName:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v4

    iget-wide v4, v4, Lcom/xiaomi/market/sdk/w;->bn:J

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/xiaomi/market/sdk/s;->a(JLandroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/high16 v1, 0x1040000

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/xiaomi/market/sdk/u;

    invoke-direct {v2}, Lcom/xiaomi/market/sdk/u;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "string"

    const-string v4, "xiaomi_update_dialog_message_diff"

    invoke-static {v2, v3, v4}, Lcom/xiaomi/market/sdk/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v4

    iget-object v4, v4, Lcom/xiaomi/market/sdk/w;->versionName:Ljava/lang/String;

    aput-object v4, v3, v5

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v4

    iget-wide v4, v4, Lcom/xiaomi/market/sdk/w;->bq:J

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/xiaomi/market/sdk/s;->a(JLandroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method static synthetic y()V
    .locals 0

    invoke-static {}, Lcom/xiaomi/market/sdk/t;->x()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 5

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/s;->m(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/s;->n(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->p(Landroid/content/Context;)Lcom/xiaomi/market/sdk/q;

    move-result-object v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->b(Lcom/xiaomi/market/sdk/q;)V

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->q()Lcom/xiaomi/market/sdk/q;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/xiaomi/market/sdk/c;

    sget-object v1, Lcom/xiaomi/market/sdk/j;->V:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/xiaomi/market/sdk/c;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/xiaomi/market/sdk/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v0}, Lcom/xiaomi/market/sdk/h;-><init>(Lcom/xiaomi/market/sdk/c;)V

    const-string v2, "info"

    invoke-direct {p0}, Lcom/xiaomi/market/sdk/t;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "packageName"

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->q()Lcom/xiaomi/market/sdk/q;

    move-result-object v3

    iget-object v3, v3, Lcom/xiaomi/market/sdk/q;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "versionCode"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->q()Lcom/xiaomi/market/sdk/q;

    move-result-object v4

    iget v4, v4, Lcom/xiaomi/market/sdk/q;->versionCode:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "apkHash"

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->q()Lcom/xiaomi/market/sdk/q;

    move-result-object v3

    iget-object v3, v3, Lcom/xiaomi/market/sdk/q;->aV:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "signature"

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->q()Lcom/xiaomi/market/sdk/q;

    move-result-object v3

    iget-object v3, v3, Lcom/xiaomi/market/sdk/q;->aU:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "clientId"

    sget-object v3, Lcom/xiaomi/market/sdk/a;->n:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "sdk"

    sget v3, Lcom/xiaomi/market/sdk/a;->k:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "os"

    sget-object v3, Lcom/xiaomi/market/sdk/a;->l:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "la"

    sget-object v3, Lcom/xiaomi/market/sdk/a;->LANGUAGE:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "co"

    sget-object v3, Lcom/xiaomi/market/sdk/a;->COUNTRY:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    const-string v2, "xiaomiSDKVersion"

    const-string v3, "0"

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/market/sdk/h;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/market/sdk/h;

    sget-object v1, Lcom/xiaomi/market/sdk/g;->I:Lcom/xiaomi/market/sdk/g;

    invoke-virtual {v0}, Lcom/xiaomi/market/sdk/c;->h()Lcom/xiaomi/market/sdk/g;

    move-result-object v2

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Lcom/xiaomi/market/sdk/c;->e()Lorg/json/JSONObject;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xiaomi/market/sdk/t;->a(Lorg/json/JSONObject;)Lcom/xiaomi/market/sdk/w;

    move-result-object v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->a(Lcom/xiaomi/market/sdk/w;)V

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v0, "MarketUpdateAgent"

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v1

    invoke-virtual {v1}, Lcom/xiaomi/market/sdk/w;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v0

    iget v0, v0, Lcom/xiaomi/market/sdk/w;->bk:I

    if-nez v0, :cond_3

    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_0
.end method

.method protected a(Ljava/lang/Integer;)V
    .locals 3

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->u()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/xiaomi/market/sdk/UpdateResponse;

    invoke-direct {v0}, Lcom/xiaomi/market/sdk/UpdateResponse;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v1

    iget-object v1, v1, Lcom/xiaomi/market/sdk/w;->updateLog:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/market/sdk/UpdateResponse;->updateLog:Ljava/lang/String;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v1

    iget v1, v1, Lcom/xiaomi/market/sdk/w;->versionCode:I

    iput v1, v0, Lcom/xiaomi/market/sdk/UpdateResponse;->versionCode:I

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v1

    iget-object v1, v1, Lcom/xiaomi/market/sdk/w;->versionName:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/market/sdk/UpdateResponse;->versionName:Ljava/lang/String;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v1

    iget-object v1, v1, Lcom/xiaomi/market/sdk/w;->bi:Ljava/lang/String;

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->t()Lcom/xiaomi/market/sdk/w;

    move-result-object v2

    iget-object v2, v2, Lcom/xiaomi/market/sdk/w;->bl:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/xiaomi/market/sdk/c;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/xiaomi/market/sdk/UpdateResponse;->path:Ljava/lang/String;

    :cond_0
    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->v()Lcom/xiaomi/market/sdk/XiaomiUpdateListener;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->v()Lcom/xiaomi/market/sdk/XiaomiUpdateListener;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateListener;->onUpdateReturned(ILcom/xiaomi/market/sdk/UpdateResponse;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance v0, Lcom/xiaomi/market/sdk/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xiaomi/market/sdk/v;-><init>(Lcom/xiaomi/market/sdk/v;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/xiaomi/market/sdk/v;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method protected varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/xiaomi/market/sdk/t;->a([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/xiaomi/market/sdk/t;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    const-string v0, "MarketUpdateAgent"

    const-string v1, "start to check update"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->r()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/xiaomi/market/sdk/Patcher;->o()Z

    move-result v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->g(Z)V

    :cond_0
    return-void
.end method
