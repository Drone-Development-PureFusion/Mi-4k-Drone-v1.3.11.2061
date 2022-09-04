.class public Lcom/google/android/gms/internal/kp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ko;


# instance fields
.field private final a:Lcom/google/android/gms/internal/kl;

.field private final b:Lcom/google/android/gms/internal/lb;

.field private final c:Lcom/google/android/gms/internal/lg;

.field private final d:Lcom/google/android/gms/internal/lg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/kf;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/kl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/kl;-><init>(Lcom/google/android/gms/internal/lb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/kp;->a:Lcom/google/android/gms/internal/kl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kp;->b:Lcom/google/android/gms/internal/lb;

    invoke-static {p1}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/internal/kf;)Lcom/google/android/gms/internal/lg;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kp;->c:Lcom/google/android/gms/internal/lg;

    invoke-static {p1}, Lcom/google/android/gms/internal/kp;->b(Lcom/google/android/gms/internal/kf;)Lcom/google/android/gms/internal/lg;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kp;->d:Lcom/google/android/gms/internal/lg;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/kf;)Lcom/google/android/gms/internal/lg;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/lb;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lg;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lb;->a()Lcom/google/android/gms/internal/lg;

    move-result-object v0

    goto :goto_0
.end method

.method private static b(Lcom/google/android/gms/internal/kf;)Lcom/google/android/gms/internal/lg;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->f()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->e()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/lb;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lg;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lb;->b()Lcom/google/android/gms/internal/lg;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ko;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->a:Lcom/google/android/gms/internal/kl;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ko$a;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/lg;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/internal/lg;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v3

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->a:Lcom/google/android/gms/internal/kl;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/kl;->a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ko$a;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v3, p3

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;
    .locals 4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/kp;->b:Lcom/google/android/gms/internal/lb;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->a:Lcom/google/android/gms/internal/kl;

    invoke-virtual {v0, p1, v1, p3}, Lcom/google/android/gms/internal/kl;->a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ll;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/lc;->b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lc;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/internal/lg;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    :goto_1
    move-object v1, v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;
    .locals 0

    return-object p1
.end method

.method public a(Lcom/google/android/gms/internal/lg;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->b:Lcom/google/android/gms/internal/lb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kp;->d()Lcom/google/android/gms/internal/lg;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/lb;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->b:Lcom/google/android/gms/internal/lb;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kp;->e()Lcom/google/android/gms/internal/lg;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/lb;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/internal/lb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->b:Lcom/google/android/gms/internal/lb;

    return-object v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d()Lcom/google/android/gms/internal/lg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->c:Lcom/google/android/gms/internal/lg;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/internal/lg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kp;->d:Lcom/google/android/gms/internal/lg;

    return-object v0
.end method
