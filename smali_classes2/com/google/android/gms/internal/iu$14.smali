.class Lcom/google/android/gms/internal/iu$14;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->b()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/List",
        "<+",
        "Lcom/google/android/gms/internal/kc;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$14;->a:Lcom/google/android/gms/internal/iu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$14;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/jp;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$14;->a:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->c(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jb;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ju;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$14;->a:Lcom/google/android/gms/internal/iu;

    new-instance v2, Lcom/google/android/gms/internal/je;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-direct {v2, v3, v0, v4}, Lcom/google/android/gms/internal/je;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Z)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/jh;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iu$14;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
