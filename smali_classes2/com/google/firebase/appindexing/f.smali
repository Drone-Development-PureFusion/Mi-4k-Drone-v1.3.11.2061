.class public abstract Lcom/google/firebase/appindexing/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String; = "FirebaseUserActions"

.field private static b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/firebase/appindexing/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lcom/google/firebase/appindexing/f;
    .locals 3

    const-class v1, Lcom/google/firebase/appindexing/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/appindexing/f;->b:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/appindexing/internal/e;

    invoke-static {}, Lcom/google/firebase/b;->d()Lcom/google/firebase/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/firebase/appindexing/internal/e;-><init>(Landroid/content/Context;)V

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Lcom/google/firebase/appindexing/f;->b:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    return-object v0

    :cond_1
    :try_start_1
    sget-object v0, Lcom/google/firebase/appindexing/f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/appindexing/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public abstract a(Lcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/appindexing/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lcom/google/firebase/appindexing/a;)Lcom/google/android/gms/g/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/appindexing/a;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method
