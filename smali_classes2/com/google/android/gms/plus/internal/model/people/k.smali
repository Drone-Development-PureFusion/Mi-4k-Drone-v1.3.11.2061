.class public final Lcom/google/android/gms/plus/internal/model/people/k;
.super Lcom/google/android/gms/common/data/j;

# interfaces
.implements Lcom/google/android/gms/plus/a/a/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/j;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-void
.end method


# virtual methods
.method public A()Lcom/google/android/gms/plus/a/a/a$d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

    const-string v1, "image"

    invoke-virtual {p0, v1}, Lcom/google/android/gms/plus/internal/model/people/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public B()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public F()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public G()Lcom/google/android/gms/plus/a/a/a$e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public H()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public K()I
    .locals 1

    const-string v0, "objectType"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$a;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public synthetic M()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->d()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public N()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public synthetic O()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->e()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public P()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public Q()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public R()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public S()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public U()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public W()Ljava/lang/String;
    .locals 1

    const-string v0, "url"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public X()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public synthetic Y()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->f()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public Z()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->ac()Lcom/google/android/gms/plus/a/a/a;

    move-result-object v0

    return-object v0
.end method

.method public aa()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ab()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ac()Lcom/google/android/gms/plus/a/a/a;
    .locals 6

    new-instance v0, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->A()Lcom/google/android/gms/plus/a/a/a$d;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->K()I

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/people/k;->W()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;ILjava/lang/String;)V

    return-object v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/plus/a/a/a$g;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/plus/a/a/a$h;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/plus/a/a/a$j;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i()Lcom/google/android/gms/plus/a/a/a$a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q()Lcom/google/android/gms/plus/a/a/a$b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public t()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    const-string v0, "displayName"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public w()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    const-string v0, "personId"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/people/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
