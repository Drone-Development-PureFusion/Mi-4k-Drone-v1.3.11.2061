.class Lcom/google/android/gms/internal/me$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/me;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/me;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/me;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/me$a;->a:Lcom/google/android/gms/internal/me;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/me;Lcom/google/android/gms/internal/me$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/me$a;-><init>(Lcom/google/android/gms/internal/me;)V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/me$a;->a:Lcom/google/android/gms/internal/me;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/me;->a()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/me$a;->a:Lcom/google/android/gms/internal/me;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/me;->b()Lcom/google/android/gms/internal/iw;

    move-result-object v1

    const-string v2, "FirebaseDatabaseWorker"

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/iw;->a(Ljava/lang/Thread;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/iw;->a(Ljava/lang/Thread;Z)V

    new-instance v2, Lcom/google/android/gms/internal/me$a$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/me$a$1;-><init>(Lcom/google/android/gms/internal/me$a;)V

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/iw;->a(Ljava/lang/Thread;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-object v0
.end method
