.class public Lcom/google/android/gms/wearable/internal/ar;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/wearable/internal/y;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ExecutorService;

.field private final e:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Lcom/google/android/gms/wearable/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/google/android/gms/wearable/internal/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/wearable/internal/z",
            "<",
            "Lcom/google/android/gms/wearable/a$c;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/google/android/gms/common/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;)V
    .locals 8

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    invoke-static {p1}, Lcom/google/android/gms/common/m;->a(Landroid/content/Context;)Lcom/google/android/gms/common/m;

    move-result-object v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/wearable/internal/ar;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;Ljava/util/concurrent/ExecutorService;Lcom/google/android/gms/common/m;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;Ljava/util/concurrent/ExecutorService;Lcom/google/android/gms/common/m;)V
    .locals 7

    const/16 v3, 0xe

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p5

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->e:Lcom/google/android/gms/wearable/internal/z;

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->f:Lcom/google/android/gms/wearable/internal/z;

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->g:Lcom/google/android/gms/wearable/internal/z;

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->h:Lcom/google/android/gms/wearable/internal/z;

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->i:Lcom/google/android/gms/wearable/internal/z;

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->j:Lcom/google/android/gms/wearable/internal/z;

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->k:Lcom/google/android/gms/wearable/internal/z;

    new-instance v0, Lcom/google/android/gms/wearable/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/z;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->l:Lcom/google/android/gms/wearable/internal/z;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->a:Ljava/util/concurrent/ExecutorService;

    iput-object p7, p0, Lcom/google/android/gms/wearable/internal/ar;->m:Lcom/google/android/gms/common/m;

    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.wearable.app.cn"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "market://details"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "id"

    const-string v2, "com.google.android.wearable.app.cn"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0
.end method

.method private a(Landroid/os/ParcelFileDescriptor;[B)Ljava/util/concurrent/FutureTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelFileDescriptor;",
            "[B)",
            "Ljava/util/concurrent/FutureTask",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lcom/google/android/gms/wearable/internal/ar$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/ar$1;-><init>(Lcom/google/android/gms/wearable/internal/ar;Landroid/os/ParcelFileDescriptor;[B)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method private b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Landroid/net/Uri;JJ)Ljava/lang/Runnable;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "JJ)",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "startOffset is negative: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    const-wide/16 v0, -0x1

    cmp-long v0, p6, v0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    const-string v1, "invalid length: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static/range {p6 .. p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/gms/wearable/internal/ar$3;

    move-object v2, p0

    move-object v3, p3

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p4

    move-wide/from16 v8, p6

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/wearable/internal/ar$3;-><init>(Lcom/google/android/gms/wearable/internal/ar;Landroid/net/Uri;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;JJ)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Landroid/net/Uri;Z)Ljava/lang/Runnable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Z)",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/wearable/internal/ar$2;

    move-object v1, p0

    move-object v2, p3

    move-object v3, p1

    move v4, p4

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/internal/ar$2;-><init>(Lcom/google/android/gms/wearable/internal/ar;Landroid/net/Uri;Lcom/google/android/gms/internal/ahl$b;ZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/y;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/wearable/internal/y$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/y;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.wearable.BIND"

    return-object v0
.end method

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 3

    const-string v0, "WearableClient"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "WearableClient"

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "onPostInitHandler: statusCode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->e:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->f:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->g:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->h:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->i:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->j:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->k:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->l:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Landroid/os/IBinder;)V

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/common/internal/w;->a(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/internal/p$f;)V
    .locals 6
    .param p1    # Lcom/google/android/gms/common/internal/p$f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->w()Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.google.android.wearable.app.cn"

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    const-string v0, "com.google.android.wearable.api.version"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    :cond_0
    sget v1, Lcom/google/android/gms/common/j;->c:I

    if-ge v0, v1, :cond_1

    const-string v1, "WearableClient"

    sget v2, Lcom/google/android/gms/common/j;->c:I

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x50

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Android Wear out of date. Requires API version "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " but found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/4 v1, 0x6

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->B()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->B()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/wearable/internal/ar;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/common/internal/p$f;Lcom/google/android/gms/common/ConnectionResult;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/common/internal/p$f;Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/gms/common/internal/w;->a(Lcom/google/android/gms/common/internal/p$f;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/j;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$l;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$l;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/internal/y;->b(Lcom/google/android/gms/wearable/internal/w;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/a$d;",
            ">;I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$f;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$f;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Landroid/net/Uri;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/e$a;",
            ">;",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$k;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$k;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Landroid/net/Uri;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Landroid/net/Uri;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/j;",
            ">;",
            "Landroid/net/Uri;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$l;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$l;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Landroid/net/Uri;I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/Asset;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/e$e;",
            ">;",
            "Lcom/google/android/gms/wearable/Asset;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$m;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$m;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Lcom/google/android/gms/wearable/Asset;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/PutDataRequest;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/e$a;",
            ">;",
            "Lcom/google/android/gms/wearable/PutDataRequest;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/Asset;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->a()[B

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->c()Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->d()Landroid/net/Uri;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->a()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x21

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Put for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " contains invalid asset: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->a(Landroid/net/Uri;)Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->b()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/wearable/PutDataRequest;->a([B)Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/wearable/PutDataRequest;->g()Lcom/google/android/gms/wearable/PutDataRequest;

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/wearable/Asset;

    invoke-virtual {v1}, Lcom/google/android/gms/wearable/Asset;->a()[B

    move-result-object v5

    if-eqz v5, :cond_4

    :try_start_0
    invoke-static {}, Landroid/os/ParcelFileDescriptor;->createPipe()[Landroid/os/ParcelFileDescriptor;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    const-string v6, "WearableClient"

    const/4 v7, 0x3

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "WearableClient"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aget-object v8, v5, v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    aget-object v9, v5, v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    add-int/lit8 v11, v11, 0x3d

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    add-int/2addr v11, v12

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    add-int/2addr v11, v12

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v11, "processAssets: replacing data with FD in asset: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v10, " read:"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " write:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v6, 0x0

    aget-object v6, v5, v6

    invoke-static {v6}, Lcom/google/android/gms/wearable/Asset;->a(Landroid/os/ParcelFileDescriptor;)Lcom/google/android/gms/wearable/Asset;

    move-result-object v6

    invoke-virtual {v2, v0, v6}, Lcom/google/android/gms/wearable/PutDataRequest;->a(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;

    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-virtual {v1}, Lcom/google/android/gms/wearable/Asset;->a()[B

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/wearable/internal/ar;->a(Landroid/os/ParcelFileDescriptor;[B)Ljava/util/concurrent/FutureTask;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ar;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x3c

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unable to create ParcelFileDescriptor for asset in request: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    invoke-virtual {v1}, Lcom/google/android/gms/wearable/Asset;->d()Landroid/net/Uri;

    move-result-object v5

    if-eqz v5, :cond_5

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->B()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-virtual {v1}, Lcom/google/android/gms/wearable/Asset;->d()Landroid/net/Uri;

    move-result-object v6

    const-string v7, "r"

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/wearable/Asset;->a(Landroid/os/ParcelFileDescriptor;)Lcom/google/android/gms/wearable/Asset;

    move-result-object v5

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0, v5}, Lcom/google/android/gms/wearable/PutDataRequest;->a(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    new-instance v0, Lcom/google/android/gms/wearable/internal/aq$q;

    invoke-direct {v0, p1, v3}, Lcom/google/android/gms/wearable/internal/aq$q;-><init>(Lcom/google/android/gms/internal/ahl$b;Ljava/util/List;)V

    new-instance v2, Lcom/google/android/gms/wearable/internal/PutDataResponse;

    const/16 v3, 0xfa5

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/wearable/internal/PutDataResponse;-><init>(ILcom/google/android/gms/wearable/internal/DataItemParcelable;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/wearable/internal/aq$q;->a(Lcom/google/android/gms/wearable/internal/PutDataResponse;)V

    const-string v0, "WearableClient"

    invoke-virtual {v1}, Lcom/google/android/gms/wearable/Asset;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1c

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Couldn\'t resolve asset URI: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void

    :cond_5
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/wearable/PutDataRequest;->a(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;

    goto/16 :goto_0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$q;

    invoke-direct {v1, p1, v3}, Lcom/google/android/gms/wearable/internal/aq$q;-><init>(Lcom/google/android/gms/internal/ahl$b;Ljava/util/List;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Lcom/google/android/gms/wearable/PutDataRequest;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/a$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/a$c;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->l:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/a$c;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/a$c;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/a$c;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->l:Lcom/google/android/gms/wearable/internal/z;

    invoke-static {p3, p4}, Lcom/google/android/gms/wearable/internal/as;->e(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;

    move-result-object v1

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/wearable/internal/as;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/c$a;Lcom/google/android/gms/internal/ail;Ljava/lang/String;[Landroid/content/IntentFilter;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/c$a;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;",
            "Ljava/lang/String;",
            "[",
            "Landroid/content/IntentFilter;",
            ")V"
        }
    .end annotation

    if-nez p4, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->g:Lcom/google/android/gms/wearable/internal/z;

    invoke-static {p3, p5}, Lcom/google/android/gms/wearable/internal/as;->d(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;

    move-result-object v1

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/wearable/internal/as;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/wearable/internal/al;

    invoke-direct {v0, p4, p2}, Lcom/google/android/gms/wearable/internal/al;-><init>(Ljava/lang/String;Lcom/google/android/gms/wearable/c$a;)V

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ar;->g:Lcom/google/android/gms/wearable/internal/z;

    invoke-static {p3, p4, p5}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;Ljava/lang/String;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;

    move-result-object v2

    invoke-virtual {v1, p0, p1, v0, v2}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/wearable/internal/as;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/c$a;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/c$a;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->g:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/wearable/internal/al;

    invoke-direct {v0, p3, p2}, Lcom/google/android/gms/wearable/internal/al;-><init>(Ljava/lang/String;Lcom/google/android/gms/wearable/c$a;)V

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ar;->g:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v1, p0, p1, v0}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/e$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/e$b;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->h:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/e$b;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/e$b;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/e$b;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->h:Lcom/google/android/gms/wearable/internal/z;

    invoke-static {p3, p4}, Lcom/google/android/gms/wearable/internal/as;->a(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;

    move-result-object v1

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/wearable/internal/as;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/e$e;",
            ">;",
            "Lcom/google/android/gms/wearable/i;",
            ")V"
        }
    .end annotation

    invoke-interface {p2}, Lcom/google/android/gms/wearable/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/wearable/Asset;->a(Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/Asset;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/m$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/m$b;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->i:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/m$b;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/m$b;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/m$b;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->i:Lcom/google/android/gms/wearable/internal/z;

    invoke-static {p3, p4}, Lcom/google/android/gms/wearable/internal/as;->b(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;

    move-result-object v1

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/wearable/internal/as;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/p$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/p$c;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->j:Lcom/google/android/gms/wearable/internal/z;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/p$c;Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/p$c;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;[",
            "Landroid/content/IntentFilter;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->j:Lcom/google/android/gms/wearable/internal/z;

    invoke-static {p3, p4}, Lcom/google/android/gms/wearable/internal/as;->c(Lcom/google/android/gms/internal/ail;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/as;

    move-result-object v1

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/z;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/wearable/internal/as;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/a$a;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$a;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$a;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->d(Lcom/google/android/gms/wearable/internal/w;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/a$e;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$g;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Ljava/lang/String;I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Landroid/net/Uri;JJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "JJ)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->a:Ljava/util/concurrent/ExecutorService;

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/wearable/internal/ar;->b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Landroid/net/Uri;JJ)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ahl$b;->c(Lcom/google/android/gms/common/api/Status;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Landroid/net/Uri;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->a:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/ar;->b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Landroid/net/Uri;Z)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ahl$b;->c(Lcom/google/android/gms/common/api/Status;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/c$c;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$p;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$p;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/m$c;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[B)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$t;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$t;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ar;->a(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/y;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.wearable.internal.IWearableService"

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/p$b;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$n;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$n;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/internal/y;->c(Lcom/google/android/gms/wearable/internal/w;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/ahl$b;Landroid/net/Uri;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/e$c;",
            ">;",
            "Landroid/net/Uri;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$e;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$e;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/wearable/internal/y;->b(Lcom/google/android/gms/wearable/internal/w;Landroid/net/Uri;I)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/a$g;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$s;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$s;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->e(Lcom/google/android/gms/wearable/internal/w;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$d;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$d;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/wearable/internal/y;->b(Lcom/google/android/gms/wearable/internal/w;Ljava/lang/String;I)V

    return-void
.end method

.method public c(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/p$a;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$j;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$j;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/internal/y;->d(Lcom/google/android/gms/wearable/internal/w;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v1, Lcom/google/android/gms/wearable/internal/aq$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/wearable/internal/aq$c;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->f(Lcom/google/android/gms/wearable/internal/w;Ljava/lang/String;)V

    return-void
.end method

.method public d(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/Channel$a;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/bl;

    invoke-direct {v1}, Lcom/google/android/gms/wearable/internal/bl;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v2, Lcom/google/android/gms/wearable/internal/aq$h;

    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/wearable/internal/aq$h;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/internal/bl;)V

    invoke-interface {v0, v2, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->a(Lcom/google/android/gms/wearable/internal/w;Lcom/google/android/gms/wearable/internal/v;Ljava/lang/String;)V

    return-void
.end method

.method public e(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/Channel$b;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/wearable/internal/bl;

    invoke-direct {v1}, Lcom/google/android/gms/wearable/internal/bl;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/y;

    new-instance v2, Lcom/google/android/gms/wearable/internal/aq$i;

    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/wearable/internal/aq$i;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/internal/bl;)V

    invoke-interface {v0, v2, v1, p2}, Lcom/google/android/gms/wearable/internal/y;->b(Lcom/google/android/gms/wearable/internal/w;Lcom/google/android/gms/wearable/internal/v;Ljava/lang/String;)V

    return-void
.end method

.method public w()Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->m:Lcom/google/android/gms/common/m;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.google.android.wearable.app.cn"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/m;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected y()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ar;->m:Lcom/google/android/gms/common/m;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/ar;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.google.android.wearable.app.cn"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/m;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "com.google.android.wearable.app.cn"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms"

    goto :goto_0
.end method
