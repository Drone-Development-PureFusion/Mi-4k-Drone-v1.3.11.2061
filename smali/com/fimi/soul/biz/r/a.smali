.class public Lcom/fimi/soul/biz/r/a;
.super Ljava/lang/Object;


# static fields
.field private static c:Lcom/fimi/soul/biz/r/a;


# instance fields
.field private a:Lcom/fimi/soul/biz/manager/r;

.field private b:Landroid/content/Context;

.field private d:Lcom/fimi/soul/utils/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/fimi/soul/biz/r/a;->c:Lcom/fimi/soul/biz/r/a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/fimi/soul/biz/manager/r;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/r;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/r/a;->a:Lcom/fimi/soul/biz/manager/r;

    iput-object p1, p0, Lcom/fimi/soul/biz/r/a;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/fimi/soul/biz/r/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/y;->a(Landroid/content/Context;)Lcom/fimi/soul/utils/y;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/r/a;->d:Lcom/fimi/soul/utils/y;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/fimi/soul/biz/r/a;
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/r/a;->c:Lcom/fimi/soul/biz/r/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/r/a;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/r/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/fimi/soul/biz/r/a;->c:Lcom/fimi/soul/biz/r/a;

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/r/a;->c:Lcom/fimi/soul/biz/r/a;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/r/a;)Lcom/fimi/soul/utils/y;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/r/a;->d:Lcom/fimi/soul/utils/y;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/r/a;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/r/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/biz/r/a;)Lcom/fimi/soul/biz/manager/r;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/r/a;->a:Lcom/fimi/soul/biz/manager/r;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/biz/r/a$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/r/a$2;-><init>(Lcom/fimi/soul/biz/r/a;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/fimi/soul/entity/FlyModeLog;)V
    .locals 4

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "userID"

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyModeLog;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "fcVersion"

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyModeLog;->getFcVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "openType"

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyModeLog;->getOpenType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "applyTime"

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyModeLog;->getApplyTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "x2Version"

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyModeLog;->getX2Version()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "appType"

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyModeLog;->getAppType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/biz/r/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/au;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/r/a;->a:Lcom/fimi/soul/biz/manager/r;

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/biz/r/a$1;

    invoke-direct {v2, p0, p1}, Lcom/fimi/soul/biz/r/a$1;-><init>(Lcom/fimi/soul/biz/r/a;Lcom/fimi/soul/entity/FlyModeLog;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/biz/manager/r;->a(Ljava/lang/String;Lcom/fimi/soul/biz/m/k;)V

    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/r/a;->d:Lcom/fimi/soul/utils/y;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/utils/y;->a(Lcom/fimi/soul/entity/FlyModeLog;)J

    goto :goto_1
.end method
