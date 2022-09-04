.class Lcom/google/android/gms/internal/apy$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/apy;->a(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aow;

.field final synthetic b:Lcom/google/android/gms/internal/apy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/apy;Lcom/google/android/gms/internal/aow;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/apy$2;->b:Lcom/google/android/gms/internal/apy;

    iput-object p2, p0, Lcom/google/android/gms/internal/apy$2;->a:Lcom/google/android/gms/internal/aow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/apy$2;->b:Lcom/google/android/gms/internal/apy;

    invoke-static {v0}, Lcom/google/android/gms/internal/apy;->a(Lcom/google/android/gms/internal/apy;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "TagManagerBackend emit called without loaded container."

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->a(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/apy$2;->b:Lcom/google/android/gms/internal/apy;

    invoke-static {v0}, Lcom/google/android/gms/internal/apy;->a(Lcom/google/android/gms/internal/apy;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aoq;

    iget-object v2, p0, Lcom/google/android/gms/internal/apy$2;->a:Lcom/google/android/gms/internal/aow;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aow;)V

    goto :goto_0
.end method
