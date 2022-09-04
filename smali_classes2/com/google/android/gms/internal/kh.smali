.class public Lcom/google/android/gms/internal/kh;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/kh$a;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Lcom/google/android/gms/internal/kg;

.field private final c:Lcom/google/android/gms/internal/kj;

.field private d:Lcom/google/android/gms/internal/ki;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ie;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/google/android/gms/internal/kd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/kh;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/kh;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/ki;)V
    .locals 8

    const/4 v7, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/kh;->b:Lcom/google/android/gms/internal/kg;

    new-instance v0, Lcom/google/android/gms/internal/kl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/kl;-><init>(Lcom/google/android/gms/internal/lb;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kf;->q()Lcom/google/android/gms/internal/ko;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/kj;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/kj;-><init>(Lcom/google/android/gms/internal/ko;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/kh;->c:Lcom/google/android/gms/internal/kj;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ki;->c()Lcom/google/android/gms/internal/jy;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ki;->a()Lcom/google/android/gms/internal/jy;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/jy;->d()Lcom/google/android/gms/internal/lc;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v7}, Lcom/google/android/gms/internal/kl;->a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;

    move-result-object v5

    invoke-virtual {v3}, Lcom/google/android/gms/internal/jy;->d()Lcom/google/android/gms/internal/lc;

    move-result-object v6

    invoke-interface {v1, v4, v6, v7}, Lcom/google/android/gms/internal/ko;->a(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kk;)Lcom/google/android/gms/internal/lc;

    move-result-object v4

    new-instance v6, Lcom/google/android/gms/internal/jy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kl;->c()Z

    move-result v0

    invoke-direct {v6, v5, v2, v0}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    new-instance v0, Lcom/google/android/gms/internal/jy;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v2

    invoke-interface {v1}, Lcom/google/android/gms/internal/ko;->c()Z

    move-result v1

    invoke-direct {v0, v4, v2, v1}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    new-instance v1, Lcom/google/android/gms/internal/ki;

    invoke-direct {v1, v0, v6}, Lcom/google/android/gms/internal/ki;-><init>(Lcom/google/android/gms/internal/jy;Lcom/google/android/gms/internal/jy;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/kd;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/kd;-><init>(Lcom/google/android/gms/internal/kg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/kh;->f:Lcom/google/android/gms/internal/kd;

    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/ie;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ka;",
            ">;",
            "Lcom/google/android/gms/internal/lc;",
            "Lcom/google/android/gms/internal/ie;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kb;",
            ">;"
        }
    .end annotation

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/kh;->f:Lcom/google/android/gms/internal/kd;

    invoke-virtual {v1, p1, p2, v0}, Lcom/google/android/gms/internal/kd;->a(Ljava/util/List;Lcom/google/android/gms/internal/lc;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/ie;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/kg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->b:Lcom/google/android/gms/internal/kg;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/kh$a;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jh;->e()Lcom/google/android/gms/internal/jh$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/jh$a;->b:Lcom/google/android/gms/internal/jh$a;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jh;->d()Lcom/google/android/gms/internal/ji;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ji;->d()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/google/android/gms/internal/kh;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should always have a full cache before handling merges"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/kh;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing event cache, even though we have a server cache"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    iget-object v1, p0, Lcom/google/android/gms/internal/kh;->c:Lcom/google/android/gms/internal/kj;

    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/google/android/gms/internal/kj;->a(Lcom/google/android/gms/internal/ki;Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/kj$a;

    move-result-object v1

    sget-boolean v2, Lcom/google/android/gms/internal/kh;->a:Z

    if-nez v2, :cond_2

    iget-object v2, v1, Lcom/google/android/gms/internal/kj$a;->a:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ki;->c()Lcom/google/android/gms/internal/jy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->c()Lcom/google/android/gms/internal/jy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Once a server snap is complete, it should never go back"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v0, v1, Lcom/google/android/gms/internal/kj$a;->a:Lcom/google/android/gms/internal/ki;

    iput-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    iget-object v0, v1, Lcom/google/android/gms/internal/kj$a;->b:Ljava/util/List;

    iget-object v2, v1, Lcom/google/android/gms/internal/kj$a;->a:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ki;->a()Lcom/google/android/gms/internal/jy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/jy;->d()Lcom/google/android/gms/internal/lc;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, v0, v2, v3}, Lcom/google/android/gms/internal/kh;->a(Ljava/util/List;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/kh$a;

    iget-object v1, v1, Lcom/google/android/gms/internal/kj$a;->b:Ljava/util/List;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/kh$a;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/kh;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ie;",
            "Lcom/google/firebase/database/c;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    const/4 v3, -0x1

    if-eqz p2, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v0, Lcom/google/android/gms/internal/kh;->a:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "A cancel should cancel all event registrations"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ie;

    new-instance v5, Lcom/google/android/gms/internal/jz;

    invoke-direct {v5, v0, p2, v2}, Lcom/google/android/gms/internal/jz;-><init>(Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;Lcom/google/android/gms/internal/ij;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz p1, :cond_6

    const/4 v0, 0x0

    move v1, v0

    move v2, v3

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ie;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ie;->a(Lcom/google/android/gms/internal/ie;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_3
    if-eq v1, v3, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ie;

    iget-object v2, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->b()V

    :cond_2
    :goto_4
    return-object v4

    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_4
    move v2, v1

    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ie;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->b()V

    goto :goto_5

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_4

    :cond_8
    move v1, v2

    goto :goto_3
.end method

.method public a(Lcom/google/android/gms/internal/ie;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->c()Lcom/google/android/gms/internal/jy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ie;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ie;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kb;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->a()Lcom/google/android/gms/internal/jy;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/jy;->d()Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/jy;->d()Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-direct {p0, v2, v0, p1}, Lcom/google/android/gms/internal/kh;->a(Ljava/util/List;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->d:Lcom/google/android/gms/internal/ki;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ki;->a()Lcom/google/android/gms/internal/jy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method
