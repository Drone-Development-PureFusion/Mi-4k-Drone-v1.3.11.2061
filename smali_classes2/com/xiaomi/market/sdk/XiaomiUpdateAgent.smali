.class public Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "MarketUpdateAgent"

.field private static aK:Lcom/xiaomi/market/sdk/w;

.field private static aL:Lcom/xiaomi/market/sdk/q;

.field private static be:Z

.field private static bf:Z

.field private static bg:Z

.field private static bh:Lcom/xiaomi/market/sdk/XiaomiUpdateListener;

.field private static mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->be:Z

    sput-boolean v1, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bf:Z

    sput-boolean v1, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bg:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/xiaomi/market/sdk/w;)V
    .locals 0

    sput-object p0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->aK:Lcom/xiaomi/market/sdk/w;

    return-void
.end method

.method static synthetic b(Lcom/xiaomi/market/sdk/q;)V
    .locals 0

    sput-object p0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->aL:Lcom/xiaomi/market/sdk/q;

    return-void
.end method

.method static synthetic g(Z)V
    .locals 0

    sput-boolean p0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bg:Z

    return-void
.end method

.method static getContext()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getSDKVersion()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic p()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static p(Landroid/content/Context;)Lcom/xiaomi/market/sdk/q;
    .locals 5

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/q;->h(Ljava/lang/String;)Lcom/xiaomi/market/sdk/q;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    :try_start_0
    iget-object v2, v0, Lcom/xiaomi/market/sdk/q;->packageName:Ljava/lang/String;

    const/16 v4, 0x40

    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_0

    iget-object v4, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v4, :cond_0

    iget-object v1, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v3, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/xiaomi/market/sdk/q;->aT:Ljava/lang/String;

    iget v1, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v1, v0, Lcom/xiaomi/market/sdk/q;->versionCode:I

    iget-object v1, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/market/sdk/q;->versionName:Ljava/lang/String;

    iget-object v1, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toChars()[C

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/xiaomi/market/sdk/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/xiaomi/market/sdk/q;->aU:Ljava/lang/String;

    iget-object v1, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iput-object v1, v0, Lcom/xiaomi/market/sdk/q;->sourceDir:Ljava/lang/String;

    new-instance v1, Ljava/io/File;

    iget-object v2, v0, Lcom/xiaomi/market/sdk/q;->sourceDir:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/xiaomi/market/sdk/b;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/xiaomi/market/sdk/q;->aV:Ljava/lang/String;

    :goto_1
    return-object v0

    :catch_0
    move-exception v2

    const-string v2, "MarketUpdateAgent"

    const-string v4, "get package info failed"

    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1
.end method

.method static synthetic q()Lcom/xiaomi/market/sdk/q;
    .locals 1

    sget-object v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->aL:Lcom/xiaomi/market/sdk/q;

    return-object v0
.end method

.method static synthetic r()Z
    .locals 1

    sget-boolean v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bg:Z

    return v0
.end method

.method static synthetic s()Z
    .locals 1

    sget-boolean v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bf:Z

    return v0
.end method

.method public static setCheckUpdateOnlyWifi(Z)V
    .locals 0

    sput-boolean p0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bf:Z

    return-void
.end method

.method public static setUpdateAutoPopup(Z)V
    .locals 0

    sput-boolean p0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->be:Z

    return-void
.end method

.method public static setUpdateListener(Lcom/xiaomi/market/sdk/XiaomiUpdateListener;)V
    .locals 0

    sput-object p0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bh:Lcom/xiaomi/market/sdk/XiaomiUpdateListener;

    return-void
.end method

.method static synthetic t()Lcom/xiaomi/market/sdk/w;
    .locals 1

    sget-object v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->aK:Lcom/xiaomi/market/sdk/w;

    return-object v0
.end method

.method static synthetic u()Z
    .locals 1

    sget-boolean v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->be:Z

    return v0
.end method

.method public static update(Landroid/content/Context;)V
    .locals 2

    if-nez p0, :cond_0

    :goto_0
    return-void

    :cond_0
    sput-object p0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/xiaomi/market/sdk/j;->k()V

    new-instance v0, Lcom/xiaomi/market/sdk/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xiaomi/market/sdk/t;-><init>(Lcom/xiaomi/market/sdk/t;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/xiaomi/market/sdk/t;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method static synthetic v()Lcom/xiaomi/market/sdk/XiaomiUpdateListener;
    .locals 1

    sget-object v0, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->bh:Lcom/xiaomi/market/sdk/XiaomiUpdateListener;

    return-object v0
.end method
