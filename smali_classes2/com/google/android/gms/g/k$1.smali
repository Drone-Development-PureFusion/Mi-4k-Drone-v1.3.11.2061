.class Lcom/google/android/gms/g/k$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/g/k;->a(Lcom/google/android/gms/g/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/f;

.field final synthetic b:Lcom/google/android/gms/g/k;


# direct methods
.method constructor <init>(Lcom/google/android/gms/g/k;Lcom/google/android/gms/g/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    iput-object p2, p0, Lcom/google/android/gms/g/k$1;->a:Lcom/google/android/gms/g/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    invoke-static {v0}, Lcom/google/android/gms/g/k;->a(Lcom/google/android/gms/g/k;)Lcom/google/android/gms/g/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/g/k$1;->a:Lcom/google/android/gms/g/f;

    invoke-interface {v0, v1}, Lcom/google/android/gms/g/a;->a(Lcom/google/android/gms/g/f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;
    :try_end_0
    .catch Lcom/google/android/gms/g/e; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/k;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/g/e;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    invoke-static {v1}, Lcom/google/android/gms/g/k;->b(Lcom/google/android/gms/g/k;)Lcom/google/android/gms/g/q;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/g/e;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    invoke-static {v1}, Lcom/google/android/gms/g/k;->b(Lcom/google/android/gms/g/k;)Lcom/google/android/gms/g/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    invoke-static {v1}, Lcom/google/android/gms/g/k;->b(Lcom/google/android/gms/g/k;)Lcom/google/android/gms/g/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/google/android/gms/g/h;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;

    sget-object v1, Lcom/google/android/gms/g/h;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/gms/g/k$1;->b:Lcom/google/android/gms/g/k;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;

    goto :goto_0
.end method
