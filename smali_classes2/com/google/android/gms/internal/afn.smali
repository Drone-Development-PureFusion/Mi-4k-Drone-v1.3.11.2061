.class public abstract Lcom/google/android/gms/internal/afn;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/afn$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Landroid/net/Uri;",
        "Ljava/lang/Long;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private final b:Lcom/google/android/gms/internal/afo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "FetchBitmapTask"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/afn;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 11

    const/4 v3, 0x0

    const-wide/32 v6, 0x200000

    const/4 v8, 0x5

    const/16 v9, 0x14d

    const/16 v10, 0x2710

    move-object v1, p0

    move-object v2, p1

    move v4, v3

    move v5, v3

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/internal/afn;-><init>(Landroid/content/Context;IIZJIII)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIZJIII)V
    .locals 11

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/afn$a;

    const/4 v1, 0x0

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/afn$a;-><init>(Lcom/google/android/gms/internal/afn;Lcom/google/android/gms/internal/afn$1;)V

    move-object v1, p0

    move v3, p2

    move v4, p3

    move v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/afc;->a(Landroid/content/Context;Landroid/os/AsyncTask;Lcom/google/android/gms/internal/afp;IIZJIII)Lcom/google/android/gms/internal/afo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/afn;->b:Lcom/google/android/gms/internal/afo;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/afn;[Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/afn;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 8

    const/4 v0, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    array-length v1, p1

    if-ne v1, v7, :cond_0

    aget-object v1, p1, v6

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/afn;->b:Lcom/google/android/gms/internal/afo;

    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/afo;->a(Landroid/net/Uri;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lcom/google/android/gms/internal/afn;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v3, "Unable to call %s on %s."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "doFetch"

    aput-object v5, v4, v6

    const-class v5, Lcom/google/android/gms/internal/afo;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v7

    invoke-virtual {v2, v1, v3, v4}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Landroid/net/Uri;)Landroid/os/AsyncTask;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Landroid/os/AsyncTask",
            "<",
            "Landroid/net/Uri;",
            "Ljava/lang/Long;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const/4 v3, 0x1

    const/4 v2, 0x0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v3, [Landroid/net/Uri;

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/afn;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-array v0, v3, [Landroid/net/Uri;

    aput-object p1, v0, v2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/afn;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v0

    goto :goto_0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/afn;->a([Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
