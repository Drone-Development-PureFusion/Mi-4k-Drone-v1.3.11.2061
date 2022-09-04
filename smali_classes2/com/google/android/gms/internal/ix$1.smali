.class Lcom/google/android/gms/internal/ix$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ix;-><init>(Ljava/util/concurrent/ThreadFactory;Lcom/google/android/gms/internal/iw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/ThreadFactory;

.field final synthetic b:Lcom/google/android/gms/internal/iw;

.field final synthetic c:Lcom/google/android/gms/internal/ix;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ix;Ljava/util/concurrent/ThreadFactory;Lcom/google/android/gms/internal/iw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ix$1;->c:Lcom/google/android/gms/internal/ix;

    iput-object p2, p0, Lcom/google/android/gms/internal/ix$1;->a:Ljava/util/concurrent/ThreadFactory;

    iput-object p3, p0, Lcom/google/android/gms/internal/ix$1;->b:Lcom/google/android/gms/internal/iw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ix$1;->a:Ljava/util/concurrent/ThreadFactory;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ix$1;->b:Lcom/google/android/gms/internal/iw;

    const-string v2, "FirebaseDatabaseEventTarget"

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/iw;->a(Ljava/lang/Thread;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ix$1;->b:Lcom/google/android/gms/internal/iw;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/iw;->a(Ljava/lang/Thread;Z)V

    return-object v0
.end method
