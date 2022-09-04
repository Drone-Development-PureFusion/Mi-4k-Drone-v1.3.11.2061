.class Lcom/google/android/gms/internal/iu$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;)Ljava/util/List;
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
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/google/android/gms/internal/ij;

.field final synthetic c:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;Ljava/util/Map;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$3;->c:Lcom/google/android/gms/internal/iu;

    iput-object p2, p0, Lcom/google/android/gms/internal/iu$3;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/iu$3;->b:Lcom/google/android/gms/internal/ij;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$3;->a:Ljava/util/Map;

    invoke-static {v0}, Lcom/google/android/gms/internal/ia;->b(Ljava/util/Map;)Lcom/google/android/gms/internal/ia;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$3;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v1}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$3;->b:Lcom/google/android/gms/internal/ij;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/jp;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$3;->c:Lcom/google/android/gms/internal/iu;

    new-instance v2, Lcom/google/android/gms/internal/jg;

    sget-object v3, Lcom/google/android/gms/internal/ji;->b:Lcom/google/android/gms/internal/ji;

    iget-object v4, p0, Lcom/google/android/gms/internal/iu$3;->b:Lcom/google/android/gms/internal/ij;

    invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/internal/jg;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/jh;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iu$3;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
