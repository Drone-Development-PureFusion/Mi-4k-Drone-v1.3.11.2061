.class public Lcom/google/android/gms/internal/jc;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ij;

.field private final b:Lcom/google/android/gms/internal/jb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    iput-object p2, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jc;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/jc;

    iget-object v1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/jc;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jb;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lg;ZLcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lg;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    iget-object v1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lg;ZLcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lg;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    iget-object v1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jb;->b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    iget-object v1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/jy;)Lcom/google/android/gms/internal/lh;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    iget-object v1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/jy;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/lh;Ljava/util/List;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;Ljava/util/List;)Lcom/google/android/gms/internal/lh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/lh;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/lh;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/lh;Ljava/util/List;Z)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;Ljava/util/List;Z)Lcom/google/android/gms/internal/lh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/lh;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;Z)",
            "Lcom/google/android/gms/internal/lh;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    iget-object v1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Ljava/util/List;Z)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jc;->b:Lcom/google/android/gms/internal/jb;

    iget-object v1, p0, Lcom/google/android/gms/internal/jc;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method
