.class public Lcom/fimi/soul/module/dronemanage/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;


# instance fields
.field private A:F

.field private B:Z

.field a:Lcom/google/android/gms/maps/model/PolylineOptions;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/drone/i/bk;",
            ">;"
        }
    .end annotation
.end field

.field c:Lcom/fimi/soul/module/droneFragment/g;

.field d:Lcom/google/android/gms/maps/model/PolylineOptions;

.field e:I

.field private f:Lcom/google/android/gms/maps/c;

.field private g:Landroid/content/Context;

.field private h:Lcom/fimi/soul/drone/a;

.field private i:Lcom/google/android/gms/maps/model/LatLng;

.field private j:Lcom/google/android/gms/maps/model/LatLng;

.field private k:I

.field private l:Z

.field private m:Lcom/google/android/gms/maps/model/g;

.field private n:F

.field private o:I

.field private p:Z

.field private q:I

.field private r:I

.field private s:Lcom/fimi/kernel/utils/v;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private final v:I

.field private w:Landroid/os/Handler;

.field private x:Lcom/google/android/gms/maps/model/i;

.field private y:Lcom/google/android/gms/maps/model/i;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/c;Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    const/16 v0, 0x14

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/d;->l:Z

    const-string v0, "DRONELATITUDE"

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->t:Ljava/lang/String;

    const-string v0, "DRONELONGITUDE"

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->u:Ljava/lang/String;

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->v:I

    new-instance v0, Lcom/fimi/soul/module/dronemanage/d$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/dronemanage/d$1;-><init>(Lcom/fimi/soul/module/dronemanage/d;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->w:Landroid/os/Handler;

    iput-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->d:Lcom/google/android/gms/maps/model/PolylineOptions;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->z:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->A:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->e:I

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    iput-object p3, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/g;->a()Lcom/fimi/soul/module/droneFragment/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->c:Lcom/fimi/soul/module/droneFragment/g;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/d;->a()V

    return-void
.end method

.method private a(Lcom/google/android/gms/maps/model/g;Lcom/fimi/soul/drone/i/bk;Lcom/google/android/gms/maps/model/LatLng;)D
    .locals 6

    const v4, 0x7f0b01a0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/i/bk;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v0

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0b0234

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v3}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0b0316

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/dronemanage/d;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method private a(Lcom/fimi/soul/drone/i/ah;)V
    .locals 6

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->c:Lcom/fimi/soul/module/droneFragment/g;

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {v1, v2, v0}, Lcom/fimi/soul/module/droneFragment/g;->a(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/model/LatLng;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->c:Lcom/fimi/soul/module/droneFragment/g;

    const-string v1, "homename"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/g;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/dronemanage/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/dronemanage/d;->l:Z

    return p1
.end method

.method private b(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/h;->a(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v1

    iget v2, v1, Landroid/graphics/Point;->y:I

    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    if-gt v2, v3, :cond_0

    iget v2, v1, Landroid/graphics/Point;->y:I

    if-ltz v2, :cond_0

    iget v2, v1, Landroid/graphics/Point;->x:I

    if-ltz v2, :cond_0

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    if-le v1, v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aW:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->t()Lcom/fimi/soul/drone/i/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ag;->a()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    iget v1, p0, Lcom/fimi/soul/module/dronemanage/d;->A:F

    invoke-static {p1, v1}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aX:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0
.end method

.method private c(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/dronemanage/d;->h(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/dronemanage/d;->g(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Lcom/fimi/soul/module/dronemanage/d;->f(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/dronemanage/d;->e(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/dronemanage/d;->d(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    goto :goto_0
.end method

.method private d(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 3

    const/4 v2, 0x6

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->o:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->o:I

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->b:Ljava/util/List;

    iget v1, p0, Lcom/fimi/soul/module/dronemanage/d;->o:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/i/bk;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-direct {p0, v1, v0, p1}, Lcom/fimi/soul/module/dronemanage/d;->a(Lcom/google/android/gms/maps/model/g;Lcom/fimi/soul/drone/i/bk;Lcom/google/android/gms/maps/model/LatLng;)D

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/i/bk;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-direct {p0, v1, v0, p1}, Lcom/fimi/soul/module/dronemanage/d;->a(Lcom/google/android/gms/maps/model/g;Lcom/fimi/soul/drone/i/bk;Lcom/google/android/gms/maps/model/LatLng;)D

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/c;->d()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    goto :goto_0
.end method

.method private e()V
    .locals 8

    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds$a;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->b()Landroid/location/Location;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    :cond_0
    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->ae()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ae()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    const/high16 v2, 0x41900000    # 18.0f

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/model/CameraPosition;->a(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->b(Lcom/google/android/gms/maps/a;)V

    :goto_0
    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    sget-object v1, Lcom/fimi/soul/biz/n/a$a;->b:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/n/a;->a(Lcom/fimi/soul/biz/n/a$a;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/dronemanage/d;->a(Lcom/google/android/gms/maps/model/LatLngBounds;)V

    goto :goto_0
.end method

.method private e(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 4

    const/high16 v3, 0x3f000000    # 0.5f

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/c;->c()Lcom/fimi/soul/module/droneFragment/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/c;->a(Lcom/fimi/soul/drone/a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, v3, v3}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    const/high16 v1, 0x43b40000    # 360.0f

    add-float/2addr v0, v1

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    iget v1, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/d;->g()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const v2, 0x7f0202cc

    invoke-static {v2}, Lcom/google/android/gms/maps/model/b;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    goto :goto_0
.end method

.method private f()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/g;->a()Lcom/fimi/soul/module/droneFragment/g;

    move-result-object v0

    const-string v1, "dronename"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/g;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    :cond_2
    invoke-static {}, Lcom/fimi/soul/module/droneFragment/g;->a()Lcom/fimi/soul/module/droneFragment/g;

    move-result-object v0

    const-string v1, "homename"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/g;->b(Ljava/lang/String;)V

    :cond_3
    :goto_0
    invoke-static {}, Lcom/fimi/soul/module/droneFragment/c;->f()V

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->h()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/i;->b(Z)V

    goto :goto_0
.end method

.method private f(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 10

    const/4 v9, 0x1

    const/4 v4, 0x0

    const/high16 v8, 0x41900000    # 18.0f

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->b:F

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->A:F

    :cond_0
    iget-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/d;->l:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->a:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->d()B

    move-result v0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->e:I

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, v9}, Lcom/fimi/soul/drone/a;->g(Z)V

    iput v8, p0, Lcom/fimi/soul/module/dronemanage/d;->A:F

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-nez v0, :cond_2

    iput-boolean v4, p0, Lcom/fimi/soul/module/dronemanage/d;->l:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/dronemanage/d;->B:Z

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    iget v2, p0, Lcom/fimi/soul/module/dronemanage/d;->A:F

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->b(Lcom/google/android/gms/maps/a;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/d;->B:Z

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds$a;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->b()Landroid/location/Location;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    if-eqz v1, :cond_3

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    :cond_3
    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    :cond_4
    if-nez v1, :cond_5

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v1, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v1, v8}, Lcom/google/android/gms/maps/model/CameraPosition;->a(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->b(Lcom/google/android/gms/maps/a;)V

    :goto_1
    iput-boolean v9, p0, Lcom/fimi/soul/module/dronemanage/d;->B:Z

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/dronemanage/d;->a(Lcom/google/android/gms/maps/model/LatLngBounds;)V

    goto :goto_1
.end method

.method private declared-synchronized g()F
    .locals 2

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v0, v1, Lcom/google/android/gms/maps/model/CameraPosition;->d:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private g(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 5

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->z:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->d:Lcom/google/android/gms/maps/model/PolylineOptions;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->d:Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->d:Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0f0081

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->g()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/model/i;->a(Z)V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_3
    return-void

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->d:Lcom/google/android/gms/maps/model/PolylineOptions;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/maps/model/LatLng;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget-object v3, p0, Lcom/fimi/soul/module/dronemanage/d;->i:Lcom/google/android/gms/maps/model/LatLng;

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->a([Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    goto :goto_0
.end method

.method private h(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/dronemanage/d;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->b(Z)Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0xa

    if-lt v1, v2, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    return-object v0
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/c;->c()Lcom/fimi/soul/module/droneFragment/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/c;->e()V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 4

    const/high16 v3, 0x42480000    # 50.0f

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->f:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v1, v3}, Lcom/fimi/soul/utils/i;->a(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->h:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v2, v3}, Lcom/fimi/soul/utils/i;->a(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/maps/a;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/dronemanage/d$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/dronemanage/d$2;-><init>(Lcom/fimi/soul/module/dronemanage/d;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;Lcom/google/android/gms/maps/c$a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/g;)V
    .locals 6

    const v5, 0x7f0b01a0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v0

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0b0234

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_0
    return-void

    :cond_1
    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v0, v1, v4}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0b0316

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/d;->l:Z

    return-void
.end method

.method public c()V
    .locals 2

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/c;->c()Lcom/fimi/soul/module/droneFragment/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/c;->b(I)V

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/c;->c()Lcom/fimi/soul/module/droneFragment/c;

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/c;->f()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    :cond_0
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 6

    const/4 v3, 0x3

    const/4 v2, 0x0

    const/16 v4, 0x64

    sget-object v0, Lcom/fimi/soul/module/dronemanage/d$3;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->x:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/d;->f()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->d()B

    move-result v0

    if-le v0, v3, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->f()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->e()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iput-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->d()B

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->j:Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/d;->c(Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_0

    :pswitch_3
    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/d;->f()V

    goto :goto_0

    :pswitch_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ah;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/dronemanage/d;->a(Lcom/fimi/soul/drone/i/ah;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/d;->p:Z

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->b()B

    move-result v0

    if-ne v0, v3, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/d;->p:Z

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->s:Lcom/fimi/kernel/utils/v;

    const-string v0, "DRONELATITUDE"

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->t:Ljava/lang/String;

    const-string v0, "DRONELONGITUDE"

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->u:Ljava/lang/String;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->t:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/d;->u:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->w:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->w:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->w:Landroid/os/Handler;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/d;->e()V

    invoke-static {}, Lcom/fimi/soul/biz/h/j;->a()Lcom/fimi/soul/biz/h/j;

    move-result-object v0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/fimi/soul/biz/h/j;->b(D)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/fimi/soul/biz/h/j;->a(D)V

    :cond_3
    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->r:I

    iget v1, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    if-eq v0, v1, :cond_4

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->r:I

    :cond_4
    :goto_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ah;->e()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->o:I

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->q:I

    iget v1, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->q:I

    goto/16 :goto_0

    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/d;->p:Z

    invoke-static {}, Lcom/fimi/soul/module/droneFragment/g;->a()Lcom/fimi/soul/module/droneFragment/g;

    move-result-object v0

    const-string v1, "homename"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/dronemanage/d;->y:Lcom/google/android/gms/maps/model/i;

    goto :goto_1

    :pswitch_5
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->t()Lcom/fimi/soul/drone/i/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ag;->k()D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->k:I

    goto/16 :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    const/high16 v1, 0x43b40000    # 360.0f

    add-float/2addr v0, v1

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/d;->m:Lcom/google/android/gms/maps/model/g;

    iget v1, p0, Lcom/fimi/soul/module/dronemanage/d;->n:F

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ap()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method
