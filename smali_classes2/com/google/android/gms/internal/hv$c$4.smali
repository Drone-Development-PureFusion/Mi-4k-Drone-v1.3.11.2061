.class Lcom/google/android/gms/internal/hv$c$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/hv$c;->a(Lcom/google/android/gms/internal/lu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/lu;

.field final synthetic b:Lcom/google/android/gms/internal/hv$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hv$c;Lcom/google/android/gms/internal/lu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hv$c$4;->b:Lcom/google/android/gms/internal/hv$c;

    iput-object p2, p0, Lcom/google/android/gms/internal/hv$c$4;->a:Lcom/google/android/gms/internal/lu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c$4;->a:Lcom/google/android/gms/internal/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lu;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c$4;->a:Lcom/google/android/gms/internal/lu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lu;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/io/EOFException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c$4;->b:Lcom/google/android/gms/internal/hv$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    const-string v1, "WebSocket reached EOF."

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c$4;->b:Lcom/google/android/gms/internal/hv$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->e(Lcom/google/android/gms/internal/hv;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c$4;->b:Lcom/google/android/gms/internal/hv$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    const-string v1, "WebSocket error."

    iget-object v2, p0, Lcom/google/android/gms/internal/hv$c$4;->a:Lcom/google/android/gms/internal/lu;

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    goto :goto_0
.end method
