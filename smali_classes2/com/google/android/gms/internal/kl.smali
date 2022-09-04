.class public Lcom/google/android/gms/internal/kl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ko;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Lcom/google/android/gms/internal/lb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/kl;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/kl;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/lb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/kl;->b:Lcom/google/android/gms/internal/lb;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ko;
    .locals 0

    return-object p0
.end method

.method public a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ko$a;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;
    .locals 4

    sget-boolean v0, Lcom/google/android/gms/internal/kl;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kl;->b:Lcom/google/android/gms/internal/lb;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lb;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "The index must match the filter"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-interface {v1, p4}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-interface {p3, p4}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v2

    invoke-interface {p3}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v3

    if-ne v2, v3, :cond_2

    :cond_1
    :goto_0
    return-object p1

    :cond_2
    if-eqz p6, :cond_3

    invoke-interface {p3}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/ka;->b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;

    move-result-object v1

    invoke-virtual {p6, v1}, Lcom/google/android/gms/internal/kk;->a(Lcom/google/android/gms/internal/ka;)V

    :cond_3
    :goto_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p3}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_4
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object p1

    goto :goto_0

    :cond_5
    sget-boolean v1, Lcom/google/android/gms/internal/kl;->a:Z

    if-nez v1, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "A child remove without an old child only makes sense on a leaf node"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_6
    invoke-interface {v1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;

    move-result-object v1

    invoke-virtual {p6, v1}, Lcom/google/android/gms/internal/kk;->a(Lcom/google/android/gms/internal/ka;)V

    goto :goto_1

    :cond_7
    invoke-static {p2, p3, v1}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;

    move-result-object v1

    invoke-virtual {p6, v1}, Lcom/google/android/gms/internal/kk;->a(Lcom/google/android/gms/internal/ka;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;
    .locals 4

    sget-boolean v0, Lcom/google/android/gms/internal/kl;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kl;->b:Lcom/google/android/gms/internal/lb;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lb;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Can\'t use IndexedNode that doesn\'t have filter\'s index"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    if-eqz p3, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ka;->b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/kk;->a(Lcom/google/android/gms/internal/ka;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v3, v0, v2}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/kk;->a(Lcom/google/android/gms/internal/ka;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/kk;->a(Lcom/google/android/gms/internal/ka;)V

    goto :goto_1

    :cond_5
    return-object p2
.end method

.method public a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/lc;->b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object p1

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/internal/lb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kl;->b:Lcom/google/android/gms/internal/lb;

    return-object v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
