.class Lcom/google/android/gms/internal/iu$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;Lcom/google/android/gms/internal/iv;)Ljava/util/List;
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

.field final synthetic b:Lcom/google/android/gms/internal/ij;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/internal/ij;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$7;->d:Lcom/google/android/gms/internal/iu;

    iput-object p2, p0, Lcom/google/android/gms/internal/iu$7;->a:Lcom/google/android/gms/internal/iv;

    iput-object p3, p0, Lcom/google/android/gms/internal/iu$7;->b:Lcom/google/android/gms/internal/ij;

    iput-object p4, p0, Lcom/google/android/gms/internal/iu$7;->c:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$7;->d:Lcom/google/android/gms/internal/iu;

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$7;->a:Lcom/google/android/gms/internal/iv;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$7;->b:Lcom/google/android/gms/internal/ij;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$7;->c:Ljava/util/Map;

    invoke-static {v2}, Lcom/google/android/gms/internal/ia;->b(Ljava/util/Map;)Lcom/google/android/gms/internal/ia;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/iu$7;->d:Lcom/google/android/gms/internal/iu;

    invoke-static {v3}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/iu$7;->b:Lcom/google/android/gms/internal/ij;

    invoke-interface {v3, v4, v2}, Lcom/google/android/gms/internal/jp;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    new-instance v3, Lcom/google/android/gms/internal/jg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ji;->a(Lcom/google/android/gms/internal/kf;)Lcom/google/android/gms/internal/ji;

    move-result-object v4

    invoke-direct {v3, v4, v1, v2}, Lcom/google/android/gms/internal/jg;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$7;->d:Lcom/google/android/gms/internal/iu;

    invoke-static {v1, v0, v3}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/jh;)Ljava/util/List;

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

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iu$7;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
