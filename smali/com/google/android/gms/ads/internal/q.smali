.class public Lcom/google/android/gms/ads/internal/q;
.super Lcom/google/android/gms/ads/internal/b;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private l:Lcom/google/android/gms/internal/acy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/d;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/b;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/d;)V

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/xu;)Lcom/google/android/gms/ads/internal/formats/d;
    .locals 14

    const/4 v10, 0x0

    new-instance v0, Lcom/google/android/gms/ads/internal/formats/d;

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->d()Lcom/google/android/gms/internal/uu;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->d()Lcom/google/android/gms/internal/uu;

    move-result-object v4

    :goto_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->f()D

    move-result-wide v6

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->g()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->h()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->l()Landroid/os/Bundle;

    move-result-object v11

    invoke-interface {p0}, Lcom/google/android/gms/internal/xu;->m()Lcom/google/android/gms/ads/internal/client/c;

    move-result-object v12

    move-object v13, v10

    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/ads/internal/formats/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/uu;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/a;Landroid/os/Bundle;Lcom/google/android/gms/ads/internal/client/c;Landroid/view/View;)V

    return-object v0

    :cond_0
    move-object v4, v10

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/internal/xv;)Lcom/google/android/gms/ads/internal/formats/e;
    .locals 9

    const/4 v7, 0x0

    new-instance v0, Lcom/google/android/gms/ads/internal/formats/e;

    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->d()Lcom/google/android/gms/internal/uu;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->d()Lcom/google/android/gms/internal/uu;

    move-result-object v4

    :goto_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->f()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0}, Lcom/google/android/gms/internal/xv;->j()Landroid/os/Bundle;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/ads/internal/formats/e;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/uu;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/a;Landroid/os/Bundle;)V

    return-object v0

    :cond_0
    move-object v4, v7

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/ads/internal/formats/d;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/q$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/q$2;-><init>(Lcom/google/android/gms/ads/internal/q;Lcom/google/android/gms/ads/internal/formats/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private a(Lcom/google/android/gms/ads/internal/formats/e;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/q$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/q$3;-><init>(Lcom/google/android/gms/ads/internal/q;Lcom/google/android/gms/ads/internal/formats/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/abi;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/q$4;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/ads/internal/q$4;-><init>(Lcom/google/android/gms/ads/internal/q;Ljava/lang/String;Lcom/google/android/gms/internal/abi;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public E()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->p()Lcom/google/android/gms/internal/ti;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    invoke-interface {v3}, Lcom/google/android/gms/internal/acy;->b()Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ti;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/abi;Landroid/view/View;Lcom/google/android/gms/internal/wy;)Lcom/google/android/gms/internal/tf;

    :goto_0
    return-void

    :cond_0
    const-string v0, "Request to enable ActiveView before adState is available."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public F()Landroid/support/v4/util/SimpleArrayMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/util/SimpleArrayMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/vi;",
            ">;"
        }
    .end annotation

    const-string v0, "getOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->v:Landroid/support/v4/util/SimpleArrayMap;

    return-object v0
.end method

.method public G()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    :cond_0
    return-void
.end method

.method public H()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->z()Lcom/google/android/gms/internal/add;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->w:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->w:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->f:Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->z()Lcom/google/android/gms/internal/add;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->w:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->f:Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;->b:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/add;->b(Z)V

    :cond_0
    return-void
.end method

.method public a(Landroid/support/v4/util/SimpleArrayMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/util/SimpleArrayMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/vi;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->v:Landroid/support/v4/util/SimpleArrayMap;

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V
    .locals 1

    const-string v0, "setNativeAdOptions must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->w:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/formats/g;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/acy;->a(Lcom/google/android/gms/ads/internal/formats/g;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/formats/i;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->j:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->p()Lcom/google/android/gms/internal/ti;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ti;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/ads/internal/formats/i;)Lcom/google/android/gms/internal/tf;

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/un;)V
    .locals 10

    iget-object v0, p1, Lcom/google/android/gms/internal/abi$a;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, p1, Lcom/google/android/gms/internal/abi$a;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/abi$a;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/q$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/q$1;-><init>(Lcom/google/android/gms/ads/internal/q;Lcom/google/android/gms/internal/abi$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/ads/internal/v;->E:I

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->d()Lcom/google/android/gms/internal/zn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v2, Lcom/google/android/gms/ads/internal/v;->d:Lcom/google/android/gms/internal/ro;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/q;->j:Lcom/google/android/gms/internal/xq;

    move-object v2, p0

    move-object v3, p1

    move-object v7, p0

    move-object v8, p2

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/internal/zn;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/internal/zn$a;Lcom/google/android/gms/internal/un;)Lcom/google/android/gms/internal/abx;

    move-result-object v0

    iput-object v0, v9, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    const-string v1, "AdRenderer: "

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/acy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/q;->l:Lcom/google/android/gms/internal/acy;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ur;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CustomRendering is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/vf;)V
    .locals 1

    const-string v0, "setOnAppInstallAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->s:Lcom/google/android/gms/internal/vf;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/vg;)V
    .locals 1

    const-string v0, "setOnContentAdLoadedListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->t:Lcom/google/android/gms/internal/vg;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/yy;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In App Purchase is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setNativeTemplates must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->A:Ljava/util/List;

    return-void
.end method

.method protected a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/abi;Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->d()Z

    move-result v0

    return v0
.end method

.method protected a(Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/internal/abi;)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/q;->a(Ljava/util/List;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/v;->e()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native ad DOES NOT have custom rendering mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v1, p2, Lcom/google/android/gms/internal/abi;->n:Z

    if-eqz v1, :cond_5

    :try_start_0
    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    invoke-interface {v1}, Lcom/google/android/gms/internal/xr;->h()Lcom/google/android/gms/internal/xu;

    move-result-object v4

    :goto_0
    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    if-eqz v1, :cond_2

    iget-object v0, p2, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/xr;->i()Lcom/google/android/gms/internal/xv;

    move-result-object v0

    move-object v6, v0

    :goto_1
    if-eqz v4, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->s:Lcom/google/android/gms/internal/vf;

    if-eqz v0, :cond_3

    invoke-static {v4}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/internal/xu;)Lcom/google/android/gms/ads/internal/formats/d;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/ads/internal/formats/h;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v2, Lcom/google/android/gms/ads/internal/v;->d:Lcom/google/android/gms/internal/ro;

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/formats/h;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/q;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/internal/xu;Lcom/google/android/gms/ads/internal/formats/i$a;)V

    invoke-virtual {v5, v0}, Lcom/google/android/gms/ads/internal/formats/d;->a(Lcom/google/android/gms/ads/internal/formats/i;)V

    invoke-direct {p0, v5}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/ads/internal/formats/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/internal/abi;)Z

    move-result v0

    :goto_3
    return v0

    :cond_1
    move-object v4, v0

    goto :goto_0

    :cond_2
    move-object v6, v0

    goto :goto_1

    :cond_3
    if-eqz v6, :cond_4

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->t:Lcom/google/android/gms/internal/vg;

    if-eqz v0, :cond_4

    invoke-static {v6}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/internal/xv;)Lcom/google/android/gms/ads/internal/formats/e;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/ads/internal/formats/h;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v2, Lcom/google/android/gms/ads/internal/v;->d:Lcom/google/android/gms/internal/ro;

    move-object v2, p0

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/formats/h;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/q;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/internal/xv;Lcom/google/android/gms/ads/internal/formats/i$a;)V

    invoke-virtual {v5, v0}, Lcom/google/android/gms/ads/internal/formats/e;->a(Lcom/google/android/gms/ads/internal/formats/i;)V

    invoke-direct {p0, v5}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/ads/internal/formats/e;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Failed to get native ad mapper"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    :try_start_2
    const-string v0, "No matching mapper/listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/q;->a(I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    move v0, v2

    goto :goto_3

    :cond_5
    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->E:Lcom/google/android/gms/ads/internal/formats/i$a;

    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/e;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->t:Lcom/google/android/gms/internal/vg;

    if-eqz v0, :cond_6

    iget-object v0, p2, Lcom/google/android/gms/internal/abi;->E:Lcom/google/android/gms/ads/internal/formats/i$a;

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/e;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/ads/internal/formats/e;)V

    goto :goto_2

    :cond_6
    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/d;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->s:Lcom/google/android/gms/internal/vf;

    if-eqz v0, :cond_7

    iget-object v0, p2, Lcom/google/android/gms/internal/abi;->E:Lcom/google/android/gms/ads/internal/formats/i$a;

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/d;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/ads/internal/formats/d;)V

    goto :goto_2

    :cond_7
    instance-of v0, v1, Lcom/google/android/gms/ads/internal/formats/f;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->v:Landroid/support/v4/util/SimpleArrayMap;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/v;->v:Landroid/support/v4/util/SimpleArrayMap;

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/ads/internal/formats/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/formats/f;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v1, Lcom/google/android/gms/ads/internal/formats/f;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/formats/f;->l()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/internal/abi;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_8
    const-string v0, "No matching listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/ads/internal/q;->a(I)V

    move v0, v2

    goto/16 :goto_3
.end method

.method public b(Landroid/support/v4/util/SimpleArrayMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/util/SimpleArrayMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/vh;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->u:Landroid/support/v4/util/SimpleArrayMap;

    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/internal/vh;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "getOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/q;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->u:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vh;

    return-object v0
.end method

.method public d()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support pause()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Interstitial is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h_()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support resume()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
