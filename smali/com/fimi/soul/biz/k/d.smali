.class public Lcom/fimi/soul/biz/k/d;
.super Ljava/lang/Object;


# instance fields
.field a:Landroid/os/Handler;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/database/sqlite/SQLiteDatabase;

.field private f:Lcom/google/android/gms/maps/c;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/google/android/gms/maps/model/CircleOptions;

.field private j:Lcom/google/android/gms/maps/model/CircleOptions;

.field private k:Lcom/google/android/gms/maps/model/CircleOptions;

.field private l:Lcom/google/android/gms/maps/model/CircleOptions;

.field private m:Ljava/util/concurrent/ExecutorService;

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;"
        }
    .end annotation
.end field

.field private o:Landroid/content/Context;

.field private p:I

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private final r:I

.field private final s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/biz/k/d;->p:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/biz/k/d;->r:I

    const/16 v0, 0xc8

    iput v0, p0, Lcom/fimi/soul/biz/k/d;->s:I

    new-instance v0, Lcom/fimi/soul/biz/k/d$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/k/d$1;-><init>(Lcom/fimi/soul/biz/k/d;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->a:Landroid/os/Handler;

    iput-object p1, p0, Lcom/fimi/soul/biz/k/d;->o:Landroid/content/Context;

    iput-object p2, p0, Lcom/fimi/soul/biz/k/d;->f:Lcom/google/android/gms/maps/c;

    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->g:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/fimi/soul/biz/k/d;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/fimi/kernel/utils/x;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->m:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Lcom/fimi/soul/biz/k/d;->f()V

    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->e()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->f:Lcom/google/android/gms/maps/c;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Lcom/fimi/soul/utils/au;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->e:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/d;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/fimi/soul/biz/k/d;->b(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/d;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/biz/k/d;->a(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    int-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/d;->g:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/d;->g:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/fimi/soul/biz/k/b;->a()Lcom/fimi/soul/biz/k/b;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/biz/k/b;->b(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/biz/k/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/biz/k/d;->d()V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/biz/k/d;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/fimi/soul/biz/k/d;->a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    int-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->g:Ljava/util/List;

    return-object v0
.end method

.method private c(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->f:Lcom/google/android/gms/maps/c;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    int-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->b:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-static {}, Lcom/fimi/soul/biz/k/b;->a()Lcom/fimi/soul/biz/k/b;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/biz/k/b;->b(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method private d(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 0

    return-void
.end method

.method static synthetic e(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    return-object v0
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method static synthetic f(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->c:Ljava/util/List;

    return-object v0
.end method

.method private f()V
    .locals 9

    const/16 v8, 0x63

    const/16 v7, 0x1a

    const/4 v6, 0x0

    const/16 v5, 0xff

    const/4 v4, 0x0

    const/16 v0, 0x1f40

    const/16 v1, 0x4f

    invoke-static {v8, v5, v1, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x24

    invoke-static {v7, v5, v2, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {v0, v1, v2, v6, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->i:Lcom/google/android/gms/maps/model/CircleOptions;

    const/16 v0, 0x1f40

    const/16 v1, 0x4f

    invoke-static {v8, v5, v1, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x24

    invoke-static {v7, v5, v2, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {v0, v1, v2, v6, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->j:Lcom/google/android/gms/maps/model/CircleOptions;

    const/16 v0, 0x1f40

    const/16 v1, 0xe2

    const/16 v2, 0x76

    invoke-static {v8, v1, v2, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x8a

    invoke-static {v7, v5, v2, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {v0, v1, v2, v6, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->k:Lcom/google/android/gms/maps/model/CircleOptions;

    const/16 v0, 0x1f40

    const/16 v1, 0xe2

    const/16 v2, 0x76

    invoke-static {v8, v1, v2, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v2, 0x8a

    invoke-static {v7, v5, v2, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {v0, v1, v2, v6, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/d;->l:Lcom/google/android/gms/maps/model/CircleOptions;

    return-void
.end method

.method static synthetic g(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->h:Ljava/util/List;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/biz/k/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/biz/k/d;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->e:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method static synthetic j(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->j:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method

.method static synthetic k(Lcom/fimi/soul/biz/k/d;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->i:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    const/16 v1, 0x64

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->a:Landroid/os/Handler;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/biz/k/d;->n:Ljava/util/List;

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->e:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->e:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->e:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 4

    invoke-direct {p0}, Lcom/fimi/soul/biz/k/d;->e()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/d;->a:Landroid/os/Handler;

    const/16 v1, 0xc8

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
