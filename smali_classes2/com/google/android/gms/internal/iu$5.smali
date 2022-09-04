.class Lcom/google/android/gms/internal/iu$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iv;)Ljava/util/List;
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
.field final synthetic a:Lcom/google/android/gms/internal/iv;

.field final synthetic b:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$5;->b:Lcom/google/android/gms/internal/iu;

    iput-object p2, p0, Lcom/google/android/gms/internal/iu$5;->a:Lcom/google/android/gms/internal/iv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$5;->b:Lcom/google/android/gms/internal/iu;

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$5;->a:Lcom/google/android/gms/internal/iv;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$5;->b:Lcom/google/android/gms/internal/iu;

    invoke-static {v1}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/jp;->d(Lcom/google/android/gms/internal/kg;)V

    new-instance v1, Lcom/google/android/gms/internal/jf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ji;->a(Lcom/google/android/gms/internal/kf;)Lcom/google/android/gms/internal/ji;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/jf;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$5;->b:Lcom/google/android/gms/internal/iu;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/jh;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iu$5;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
