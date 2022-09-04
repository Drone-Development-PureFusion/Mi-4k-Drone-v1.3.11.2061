.class Lcom/google/android/gms/internal/iu$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Ljava/util/List;
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
.field final synthetic a:Lcom/google/android/gms/internal/ij;

.field final synthetic b:Lcom/google/android/gms/internal/lh;

.field final synthetic c:Lcom/google/android/gms/internal/iu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$2;->c:Lcom/google/android/gms/internal/iu;

    iput-object p2, p0, Lcom/google/android/gms/internal/iu$2;->a:Lcom/google/android/gms/internal/ij;

    iput-object p3, p0, Lcom/google/android/gms/internal/iu$2;->b:Lcom/google/android/gms/internal/lh;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$2;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$2;->a:Lcom/google/android/gms/internal/ij;

    invoke-static {v1}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$2;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/lh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$2;->c:Lcom/google/android/gms/internal/iu;

    new-instance v1, Lcom/google/android/gms/internal/jj;

    sget-object v2, Lcom/google/android/gms/internal/ji;->b:Lcom/google/android/gms/internal/ji;

    iget-object v3, p0, Lcom/google/android/gms/internal/iu$2;->a:Lcom/google/android/gms/internal/ij;

    iget-object v4, p0, Lcom/google/android/gms/internal/iu$2;->b:Lcom/google/android/gms/internal/lh;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/jj;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/jh;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iu$2;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
