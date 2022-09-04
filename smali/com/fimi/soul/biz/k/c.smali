.class public Lcom/fimi/soul/biz/k/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;


# static fields
.field private static final a:I = 0x3d0900

.field private static final q:I = 0xf4240

.field private static final t:I = 0xa

.field private static final u:I = 0x14

.field private static final v:I = 0x1e


# instance fields
.field private b:Lcom/google/android/gms/maps/model/LatLng;

.field private c:Lcom/google/android/gms/maps/model/CircleOptions;

.field private d:Lcom/google/android/gms/maps/model/CircleOptions;

.field private e:Lcom/google/android/gms/maps/model/CircleOptions;

.field private f:Lcom/google/android/gms/maps/model/CircleOptions;

.field private g:Lcom/google/android/gms/maps/c;

.field private h:Lcom/fimi/soul/drone/a;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/fimi/soul/biz/k/h;

.field private p:I

.field private r:I

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private w:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/c;Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->i:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->j:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->k:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->l:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->m:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->n:Ljava/util/List;

    const/4 v0, 0x3

    iput v0, p0, Lcom/fimi/soul/biz/k/c;->r:I

    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->s:Ljava/util/List;

    new-instance v0, Lcom/fimi/soul/biz/k/c$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/k/c$2;-><init>(Lcom/fimi/soul/biz/k/c;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->w:Landroid/os/Handler;

    iput-object p1, p0, Lcom/fimi/soul/biz/k/c;->g:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/fimi/soul/biz/k/c;->h:Lcom/fimi/soul/drone/a;

    invoke-virtual {p2, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    invoke-static {}, Lcom/fimi/soul/biz/k/h;->a()Lcom/fimi/soul/biz/k/h;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->o:Lcom/fimi/soul/biz/k/h;

    invoke-direct {p0}, Lcom/fimi/soul/biz/k/c;->e()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/k/c;->p:I

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/biz/k/c;->p:I

    return p1
.end method

.method private a(DD)Lcom/google/android/gms/maps/model/LatLng;
    .locals 7

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2, p3, p4}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;DD)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fimi/soul/biz/k/c;->a(DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/k/c;->b:Lcom/google/android/gms/maps/model/LatLng;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;Lcom/fimi/soul/entity/DynamicDYZ_Entity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/entity/DynamicDYZ_Entity;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/fimi/soul/biz/k/c;->a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fimi/soul/biz/k/c;->a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;Z)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/c;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/biz/k/c;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/entity/DynamicDYZ_Entity;)V
    .locals 2

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0xa

    iput v1, v0, Landroid/os/Message;->what:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->w:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method private a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->g:Lcom/google/android/gms/maps/c;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    int-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;Z)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->g:Lcom/google/android/gms/maps/c;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    int-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->n:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->n:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->s:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->s:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/fimi/soul/biz/k/b;->a()Lcom/fimi/soul/biz/k/b;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/k/b;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_1
    if-eqz p4, :cond_2

    invoke-static {}, Lcom/fimi/soul/biz/k/a;->a()Lcom/fimi/soul/biz/k/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/k/a;->a(Lcom/google/android/gms/maps/model/c;)V

    :cond_2
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->b:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/biz/k/c;->b()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    iget-object v2, p0, Lcom/fimi/soul/biz/k/c;->b:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLogitude()D

    move-result-wide v6

    invoke-direct {p0, v4, v5, v6, v7}, Lcom/fimi/soul/biz/k/c;->a(DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v2

    const-wide v4, 0x414e848000000000L    # 4000000.0

    cmpg-double v2, v2, v4

    if-gtz v2, :cond_0

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/entity/DynamicDYZ_Entity;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/biz/k/c;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/k/c;->r:I

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/fimi/soul/biz/k/c;->b(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/biz/k/c;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/biz/k/c;->c(Ljava/util/List;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->g:Lcom/google/android/gms/maps/c;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    int-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->s:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c;->s:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/fimi/soul/biz/k/b;->a()Lcom/fimi/soul/biz/k/b;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/k/b;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_1
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/fimi/soul/biz/k/c;->b()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getDistance()D

    move-result-wide v2

    double-to-int v2, v2

    const v3, 0x3d0900

    if-gt v2, v3, :cond_0

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/entity/DynamicDYZ_Entity;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/biz/k/c;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->w:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    iget-object v2, p0, Lcom/fimi/soul/biz/k/c;->s:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/biz/k/c;->s:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/fimi/soul/biz/k/b;->a()Lcom/fimi/soul/biz/k/b;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/biz/k/b;->c(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->e:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->d:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method

.method private e()V
    .locals 8

    const/16 v7, 0x1f40

    const/4 v6, 0x0

    const/16 v5, 0xff

    const/16 v4, 0x63

    const/4 v3, 0x0

    const/16 v0, 0x4f

    invoke-static {v4, v5, v0, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x1a

    const/16 v2, 0x24

    invoke-static {v1, v5, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x64

    invoke-static {v7, v0, v1, v6, v2}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->c:Lcom/google/android/gms/maps/model/CircleOptions;

    const/16 v0, 0x4f

    invoke-static {v4, v5, v0, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x1a

    const/16 v2, 0x24

    invoke-static {v1, v5, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x64

    invoke-static {v7, v0, v1, v6, v2}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->d:Lcom/google/android/gms/maps/model/CircleOptions;

    const/16 v0, 0xe2

    const/16 v1, 0x76

    invoke-static {v4, v0, v1, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x1a

    const/16 v2, 0x8a

    invoke-static {v1, v5, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x64

    invoke-static {v7, v0, v1, v6, v2}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->e:Lcom/google/android/gms/maps/model/CircleOptions;

    const/16 v0, 0x1b

    const/16 v1, 0xf2

    const/16 v2, 0x7c

    invoke-static {v4, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x1b

    const/16 v2, 0xf2

    const/16 v3, 0x7c

    invoke-static {v4, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x3e8

    invoke-static {v7, v0, v1, v6, v2}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/c;->f:Lcom/google/android/gms/maps/model/CircleOptions;

    return-void
.end method

.method static synthetic f(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->f:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method

.method private f()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/biz/k/c$4;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/k/c$4;-><init>(Lcom/fimi/soul/biz/k/c;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic g(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->c:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->n:Ljava/util/List;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->l:Ljava/util/List;

    return-object v0
.end method

.method static synthetic j(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic k(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic l(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->j:Ljava/util/List;

    return-object v0
.end method

.method static synthetic m(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->k:Ljava/util/List;

    return-object v0
.end method

.method static synthetic n(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->g:Lcom/google/android/gms/maps/c;

    return-object v0
.end method

.method static synthetic o(Lcom/fimi/soul/biz/k/c;)Lcom/fimi/soul/biz/k/h;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->o:Lcom/fimi/soul/biz/k/h;

    return-object v0
.end method

.method static synthetic p(Lcom/fimi/soul/biz/k/c;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->h:Lcom/fimi/soul/drone/a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/biz/k/c$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/k/c$1;-><init>(Lcom/fimi/soul/biz/k/c;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->w:Landroid/os/Handler;

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/k/c;->p:I

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/k/c$5;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    new-instance v0, Lcom/fimi/soul/biz/k/c$3;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/k/c$3;-><init>(Lcom/fimi/soul/biz/k/c;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Lcom/fimi/soul/biz/k/c;->f()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lcom/fimi/soul/biz/k/c;->b()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
