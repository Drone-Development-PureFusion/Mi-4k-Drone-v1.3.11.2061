.class public Lcom/fimi/soul/biz/j/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/j/a;


# instance fields
.field a:Landroid/os/Handler;

.field private b:Lcom/google/android/gms/maps/c;

.field private c:Landroid/content/Context;

.field private volatile d:Lcom/google/android/gms/maps/model/i;

.field private e:Lcom/fimi/soul/biz/j/d;

.field private f:Lcom/fimi/soul/drone/a;

.field private volatile g:Lcom/google/android/gms/maps/model/i;

.field private h:Lcom/google/android/gms/maps/model/g;

.field private i:Lcom/fimi/soul/entity/FlyActionBean;

.field private j:I

.field private k:Z

.field private l:I

.field private m:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/c;Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/fimi/soul/biz/j/o$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/j/o$1;-><init>(Lcom/fimi/soul/biz/j/o;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/biz/j/o;->j:I

    const/16 v0, 0xc8

    iput v0, p0, Lcom/fimi/soul/biz/j/o;->l:I

    iput-object p3, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iput-object p1, p0, Lcom/fimi/soul/biz/j/o;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/fimi/soul/biz/j/o;->c:Landroid/content/Context;

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/j/o;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/o;->j:I

    return v0
.end method

.method private a(Lcom/google/android/gms/maps/model/g;Z)V
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/o;->m:Z

    if-nez v0, :cond_1

    iget-wide v0, v4, Lcom/google/android/gms/maps/model/LatLng;->a:D

    iget-wide v2, v4, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    if-eqz p2, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/fimi/soul/biz/j/o;->m:Z

    :cond_0
    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/o;->m:Z

    if-eqz v0, :cond_2

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    iget-wide v2, v4, Lcom/google/android/gms/maps/model/LatLng;->a:D

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/utils/af;->a(DDD)Lcom/fimi/soul/utils/al;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/fimi/soul/biz/j/o;->m:Z

    goto :goto_0

    :cond_2
    move-object v0, v4

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/j/o;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/biz/j/o;->k:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/biz/j/o;)Lcom/google/android/gms/maps/model/g;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->h:Lcom/google/android/gms/maps/model/g;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/biz/j/o;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/o;->k:Z

    return v0
.end method

.method static synthetic d(Lcom/fimi/soul/biz/j/o;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/biz/j/o;)Lcom/fimi/soul/entity/FlyActionBean;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->i:Lcom/fimi/soul/entity/FlyActionBean;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/biz/j/o;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/o;->l:I

    return v0
.end method

.method private k()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->l()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    :cond_1
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    :cond_2
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 8

    const/4 v7, 0x1

    const/4 v1, 0x0

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    iget-object v4, p0, Lcom/fimi/soul/biz/j/o;->b:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    const v6, 0x7f020306

    invoke-static {v5, v6}, Lcom/fimi/soul/biz/j/i;->a(Lcom/google/android/gms/maps/model/LatLng;I)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/Object;)V

    const/high16 v0, 0x3f000000    # 0.5f

    const v5, 0x3f6147ae    # 0.88f

    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    invoke-virtual {v4}, Lcom/google/android/gms/maps/model/g;->i()V

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    if-eqz v3, :cond_4

    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v7, :cond_4

    move v2, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v2, v4, :cond_3

    const v4, 0x7f0202fe

    invoke-static {v4}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setCanclick(Z)V

    const v4, 0x7f0202fe

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setDrawableRes(I)V

    const v4, 0x3dcccccd    # 0.1f

    const v5, 0x3f666666    # 0.9f

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    :goto_2
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setModelType(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setCanclick(Z)V

    const v4, 0x7f020306

    invoke-static {v4}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    const v4, 0x7f020306

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setDrawableRes(I)V

    const/high16 v4, 0x3f000000    # 0.5f

    const v5, 0x3f333333    # 0.7f

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    goto :goto_2

    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    const v2, 0x7f0202fe

    invoke-static {v2}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setCanclick(Z)V

    const v2, 0x7f0202fe

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setDrawableRes(I)V

    const v1, 0x3dcccccd    # 0.1f

    const v2, 0x3f666666    # 0.9f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->l()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_6

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->b:Lcom/google/android/gms/maps/c;

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/biz/j/o;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f0116

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-static {v0, v2, v3}, Lcom/fimi/soul/biz/j/i;->a(Ljava/util/List;II)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    :goto_3
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/d;->a(Lcom/google/android/gms/maps/model/i;)V

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    :cond_7
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_8
    monitor-exit p0

    return-void

    :cond_9
    :try_start_2
    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3
.end method

.method public a(I)V
    .locals 7

    const/4 v4, 0x1

    const/4 v2, 0x0

    const v6, 0x3f333333    # 0.7f

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, v4, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-gt p1, v0, :cond_3

    if-lt p1, v4, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_1

    add-int/lit8 v0, p1, -0x1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->h:Lcom/google/android/gms/maps/model/g;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1, v6}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->i:Lcom/fimi/soul/entity/FlyActionBean;

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    iget v4, p0, Lcom/fimi/soul/biz/j/o;->l:I

    int-to-long v4, v4

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    :goto_0
    const/4 v0, 0x2

    if-lt p1, v0, :cond_3

    move v1, v2

    :goto_1
    add-int/lit8 v0, p1, -0x1

    if-ge v1, v0, :cond_3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    const v2, 0x7f020309

    invoke-static {v2}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    const v2, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v2, v6}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    iget-object v4, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v4, v4, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v5, 0x7f0202fe

    invoke-virtual {v1}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v4, v5, v1, v2}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    const v1, 0x3e19999a    # 0.15f

    const v4, 0x3f666666    # 0.9f

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public a(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 8

    const v7, 0x7f0202d4

    const/4 v0, 0x0

    const/4 v6, 0x1

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->g()Lcom/google/android/gms/maps/model/g;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/j/d;->a(Lcom/google/android/gms/maps/model/g;)V

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/j/d;->a(Z)V

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->l()Ljava/util/List;

    move-result-object v2

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v3

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v4

    if-eqz p1, :cond_1

    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v3, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    invoke-interface {v3, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_1
    move v1, v0

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    :cond_2
    :goto_0
    if-eqz v4, :cond_4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    invoke-interface {v4, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, v6, :cond_8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-gt v1, v0, :cond_8

    if-lez v1, :cond_8

    iget-object v2, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    add-int/lit8 v0, v1, -0x1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/biz/j/d;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, v6, :cond_9

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gt v1, v0, :cond_9

    if-lez v1, :cond_9

    add-int/lit8 v0, v1, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v7, v2, v6}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    :cond_6
    :goto_2
    return-void

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    sget-object v2, Lcom/fimi/soul/drone/d$a;->bh:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :cond_8
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, v6, :cond_5

    iget-object v2, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/biz/j/d;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    goto :goto_1

    :cond_9
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, v6, :cond_6

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v7, v2, v6}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    goto :goto_2
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 5

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->b:Lcom/google/android/gms/maps/c;

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/biz/j/o;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f0082

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-static {v0, v2, v3}, Lcom/fimi/soul/biz/j/i;->a(Ljava/util/List;II)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v2, 0x42480000    # 50.0f

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->b(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;I)V
    .locals 13

    const/16 v12, 0xbb8

    const/4 v9, 0x0

    const-wide v10, 0x407f400000000000L    # 500.0

    const/4 v8, 0x1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->l()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x14

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0518

    invoke-static {v0, v1, v12}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iput-boolean v8, p0, Lcom/fimi/soul/biz/j/o;->m:Z

    :goto_1
    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/fimi/soul/biz/k/a;->a()Lcom/fimi/soul/biz/k/a;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/fimi/soul/biz/k/a;->a(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-static {v4, p1}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v6

    cmpg-double v0, v4, v6

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b022f

    invoke-static {v0, v1, v12}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_3
    iput-boolean v9, p0, Lcom/fimi/soul/biz/j/o;->m:Z

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v4

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v6

    invoke-direct {v0, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {p1, v0}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v0

    cmpl-double v4, v0, v10

    if-lez v4, :cond_5

    cmpl-double v0, v0, v10

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->c:Landroid/content/Context;

    const v1, 0x7f0b037e

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    :cond_5
    new-instance v4, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-direct {v4}, Lcom/fimi/soul/entity/FlyActionBean;-><init>()V

    invoke-virtual {v4, p1}, Lcom/fimi/soul/entity/FlyActionBean;->setLatLng(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v4, p2}, Lcom/fimi/soul/entity/FlyActionBean;->setDrawableRes(I)V

    invoke-virtual {v4, v8}, Lcom/fimi/soul/entity/FlyActionBean;->setCanclick(Z)V

    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/fimi/soul/entity/FlyActionBean;->setType(I)V

    invoke-virtual {v4, v8}, Lcom/fimi/soul/entity/FlyActionBean;->setModelType(I)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->k()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(F)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->r()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/fimi/soul/entity/FlyActionBean;->setSpeek(F)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->b:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iget-object v5, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v5}, Lcom/fimi/soul/biz/j/d;->k()F

    move-result v5

    invoke-static {p1, v1, v5, v8, p2}, Lcom/fimi/soul/biz/j/i;->a(Lcom/google/android/gms/maps/model/LatLng;Landroid/content/Context;FZI)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v5

    const/high16 v0, 0x3f000000    # 0.5f

    const v1, 0x3f6147ae    # 0.88f

    invoke-virtual {v5, v0, v1}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    invoke-virtual {v5, v4}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/Object;)V

    const/high16 v0, 0x447a0000    # 1000.0f

    invoke-virtual {v5, v0}, Lcom/google/android/gms/maps/model/g;->a(F)V

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/fimi/soul/biz/j/d;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/biz/j/d;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    if-eqz v3, :cond_7

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    iget-object v7, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v7, v7, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v8, 0x7f0202d3

    invoke-virtual {v1}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v7, v8, v1, v9}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    goto :goto_2

    :cond_6
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bg:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    if-eqz v2, :cond_0

    invoke-interface {v2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->b:Lcom/google/android/gms/maps/c;

    const/4 v1, 0x4

    iget-object v3, p0, Lcom/fimi/soul/biz/j/o;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f0116

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-static {v2, v1, v3}, Lcom/fimi/soul/biz/j/i;->a(Ljava/util/List;II)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    :goto_3
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/d;->a(Lcom/google/android/gms/maps/model/i;)V

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    goto :goto_3
.end method

.method public b()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/biz/j/o;->g:Lcom/google/android/gms/maps/model/i;

    :cond_2
    return-void
.end method

.method public c()V
    .locals 5

    const v4, 0x7f0b01cb

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->l()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/ah;->e()I

    move-result v2

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v2, v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const/16 v2, 0xbb8

    invoke-static {v1, v4, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    const v1, 0x7f0202ff

    invoke-static {v1}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/j/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bm:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 4

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->d:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public e()V
    .locals 4

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/biz/j/o;->j:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/fimi/soul/entity/FlyActionBean;->getModelType()I

    move-result v2

    if-ne v2, v3, :cond_1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    invoke-virtual {v1, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setCanExcute(Z)V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_1
    return-void
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/fimi/soul/entity/FlyActionBean;->getModelType()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_0
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setCanExcute(Z)V

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o;->f:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0b0182

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_1
    return-void
.end method

.method public g()V
    .locals 4

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/fimi/soul/entity/FlyActionBean;->getModelType()I

    move-result v2

    if-ne v2, v3, :cond_0

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    invoke-virtual {v1, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setCanExcute(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 5

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o;->e:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    move v1, v2

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne v1, v4, :cond_0

    const/4 v4, 0x1

    invoke-direct {p0, v0, v4}, Lcom/fimi/soul/biz/j/o;->a(Lcom/google/android/gms/maps/model/g;Z)V

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/biz/j/o;->a(Lcom/google/android/gms/maps/model/g;Z)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/fimi/soul/biz/j/o;->k()V

    :cond_2
    return-void
.end method

.method public j()V
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/o;->m:Z

    :cond_0
    return-void
.end method
