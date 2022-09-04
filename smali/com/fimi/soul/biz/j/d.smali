.class public Lcom/fimi/soul/biz/j/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/j/d$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:F

.field private c:F

.field private d:I

.field private e:I

.field private f:Lcom/google/android/gms/maps/model/c;

.field private volatile g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private volatile h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/google/android/gms/maps/model/i;

.field private j:I

.field private k:F

.field private volatile l:Lcom/fimi/soul/entity/FlyActionBean;

.field private volatile m:Lcom/fimi/soul/entity/FlyActionBean;

.field private volatile n:Lcom/fimi/soul/entity/FlyActionBean;

.field private volatile o:F

.field private p:Lcom/google/android/gms/maps/model/g;

.field private q:Z

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/g;",
            ">;"
        }
    .end annotation
.end field

.field private volatile s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/high16 v1, 0x40800000    # 4.0f

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/biz/j/d;->a:I

    iput v1, p0, Lcom/fimi/soul/biz/j/d;->b:F

    iput v1, p0, Lcom/fimi/soul/biz/j/d;->c:F

    const/4 v0, 0x4

    iput v0, p0, Lcom/fimi/soul/biz/j/d;->d:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/d;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/d;->h:Ljava/util/List;

    const/16 v0, 0x14

    iput v0, p0, Lcom/fimi/soul/biz/j/d;->j:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/fimi/soul/biz/j/d;->k:F

    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lcom/fimi/soul/biz/j/d;->o:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/d;->r:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/d;->s:Ljava/util/List;

    return-void
.end method

.method public static p()Lcom/fimi/soul/biz/j/d;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/j/d$a;->a:Lcom/fimi/soul/biz/j/d;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->e:I

    return v0
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/biz/j/d;->k:F

    return-void
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/biz/j/d;->e:I

    return-void
.end method

.method public a(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/d;->m:Lcom/fimi/soul/entity/FlyActionBean;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/d;->f:Lcom/google/android/gms/maps/model/c;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/g;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/d;->p:Lcom/google/android/gms/maps/model/g;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/i;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/d;->i:Lcom/google/android/gms/maps/model/i;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/biz/j/d;->s:Ljava/util/List;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/biz/j/d;->q:Z

    return-void
.end method

.method public b()Lcom/google/android/gms/maps/model/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->f:Lcom/google/android/gms/maps/model/c;

    return-object v0
.end method

.method public b(F)V
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->a:I

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->a:I

    int-to-float p1, v0

    :cond_0
    iput p1, p0, Lcom/fimi/soul/biz/j/d;->o:F

    return-void
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/biz/j/d;->j:I

    return-void
.end method

.method public b(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/d;->l:Lcom/fimi/soul/entity/FlyActionBean;

    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->g:Ljava/util/List;

    return-object v0
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/biz/j/d;->b:F

    return-void
.end method

.method public c(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/d;->n:Lcom/fimi/soul/entity/FlyActionBean;

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->j:I

    return v0
.end method

.method public d(F)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/biz/j/d;->c:F

    return-void
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->k:F

    return v0
.end method

.method public f()Lcom/fimi/soul/entity/FlyActionBean;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->m:Lcom/fimi/soul/entity/FlyActionBean;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/maps/model/g;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->p:Lcom/google/android/gms/maps/model/g;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/d;->q:Z

    return v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->r:Ljava/util/List;

    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->s:Ljava/util/List;

    return-object v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->o:F

    return v0
.end method

.method public l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->h:Ljava/util/List;

    return-object v0
.end method

.method public m()Lcom/google/android/gms/maps/model/i;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->i:Lcom/google/android/gms/maps/model/i;

    return-object v0
.end method

.method public n()Lcom/fimi/soul/entity/FlyActionBean;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->l:Lcom/fimi/soul/entity/FlyActionBean;

    return-object v0
.end method

.method public o()Lcom/fimi/soul/entity/FlyActionBean;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->n:Lcom/fimi/soul/entity/FlyActionBean;

    return-object v0
.end method

.method public q()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->b:F

    return v0
.end method

.method public r()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/d;->c:F

    return v0
.end method

.method public s()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->r:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->i:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->i:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/d;->i:Lcom/google/android/gms/maps/model/i;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/d;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
