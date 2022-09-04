.class public Lcom/google/android/gms/internal/afc;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "CastDynamiteModule"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/afc;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/IBinder;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/app/Service;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;Lcom/google/android/gms/cast/framework/media/CastMediaOptions;)Lcom/google/android/gms/cast/framework/media/f;
    .locals 6

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/aff;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;Lcom/google/android/gms/cast/framework/media/CastMediaOptions;)Lcom/google/android/gms/cast/framework/media/f;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/afc;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "newMediaNotificationServiceImpl"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/internal/aff;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/internal/afh;Ljava/util/Map;)Lcom/google/android/gms/cast/framework/t;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/cast/framework/CastOptions;",
            "Lcom/google/android/gms/internal/afh;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid/os/IBinder;",
            ">;)",
            "Lcom/google/android/gms/cast/framework/t;"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/aff;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/internal/afh;Ljava/util/Map;)Lcom/google/android/gms/cast/framework/t;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/afc;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "newCastContextImpl"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/internal/aff;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/c/e;Lcom/google/android/gms/cast/framework/s;)Lcom/google/android/gms/cast/framework/u;
    .locals 6

    invoke-static {p0}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    :try_start_0
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/aff;->a(Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/c/e;Lcom/google/android/gms/cast/framework/s;)Lcom/google/android/gms/cast/framework/u;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/afc;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "newCastSessionImpl"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/internal/aff;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/app/Service;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/cast/framework/y;
    .locals 6

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    :try_start_0
    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/internal/aff;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/cast/framework/y;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/afc;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "newReconnectionServiceImpl"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/internal/aff;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/framework/ad;)Lcom/google/android/gms/cast/framework/z;
    .locals 6

    invoke-static {p0}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    :try_start_0
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/aff;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/framework/ad;)Lcom/google/android/gms/cast/framework/z;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/afc;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "newSessionImpl"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/internal/aff;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/afc;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/afc;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/akb;->a:Lcom/google/android/gms/internal/akb$b;

    const-string v1, "com.google.android.gms.cast.framework.dynamite"

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/akb;->a(Landroid/content/Context;Lcom/google/android/gms/internal/akb$b;Ljava/lang/String;)Lcom/google/android/gms/internal/akb;

    move-result-object v0

    const-string v1, "com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aff$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aff;
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Landroid/content/Context;Landroid/os/AsyncTask;Lcom/google/android/gms/internal/afp;IIZJIII)Lcom/google/android/gms/internal/afo;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/AsyncTask",
            "<",
            "Landroid/net/Uri;",
            "Ljava/lang/Long;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/google/android/gms/internal/afp;",
            "IIZJIII)",
            "Lcom/google/android/gms/internal/afo;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    move-object v2, p2

    move v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-wide/from16 v6, p6

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-interface/range {v0 .. v10}, Lcom/google/android/gms/internal/aff;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/internal/afp;IIZJIII)Lcom/google/android/gms/internal/afo;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/afc;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "newFetchBitmapTaskImpl"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/internal/aff;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static b(Landroid/content/Context;)Lcom/google/android/gms/internal/aff;
    .locals 1

    const-string v0, "com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl"

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aff$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aff;

    move-result-object v0

    return-object v0
.end method
