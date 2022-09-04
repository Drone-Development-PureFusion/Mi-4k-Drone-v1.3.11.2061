.class public abstract Lcom/google/android/gms/ads/internal/b;
.super Lcom/google/android/gms/ads/internal/a;

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/g;
.implements Lcom/google/android/gms/ads/internal/purchase/j;
.implements Lcom/google/android/gms/ads/internal/s;
.implements Lcom/google/android/gms/internal/vv;
.implements Lcom/google/android/gms/internal/xi;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field protected final j:Lcom/google/android/gms/internal/xq;

.field protected transient k:Z

.field private final l:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/d;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/internal/v;

    invoke-direct {v0, p1, p2, p3, p5}, Lcom/google/android/gms/ads/internal/v;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, p4, v1, p6}, Lcom/google/android/gms/ads/internal/b;-><init>(Lcom/google/android/gms/ads/internal/v;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/ads/internal/d;)V

    return-void
.end method

.method protected constructor <init>(Lcom/google/android/gms/ads/internal/v;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/ads/internal/d;)V
    .locals 3
    .param p3    # Lcom/google/android/gms/ads/internal/r;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1, p3, p4}, Lcom/google/android/gms/ads/internal/a;-><init>(Lcom/google/android/gms/ads/internal/v;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/ads/internal/d;)V

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/b;->j:Lcom/google/android/gms/internal/xq;

    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/google/android/gms/internal/yv;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/yv;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/b;->l:Landroid/os/Messenger;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/b;->k:Z

    return-void
.end method

.method private a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Landroid/os/Bundle;Lcom/google/android/gms/internal/abk;)Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;
    .locals 42

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v20

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-eqz v2, :cond_1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/v$a;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v2, 0x2

    new-array v2, v2, [I

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/ads/internal/v$a;->getLocationOnScreen([I)V

    const/4 v3, 0x0

    aget v4, v2, v3

    const/4 v3, 0x1

    aget v5, v2, v3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/v$a;->getWidth()I

    move-result v6

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/v$a;->getHeight()I

    move-result v9

    const/4 v2, 0x0

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v3}, Lcom/google/android/gms/ads/internal/v$a;->isShown()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int v3, v4, v6

    if-lez v3, :cond_0

    add-int v3, v5, v9

    if-lez v3, :cond_0

    move-object/from16 v0, v20

    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    if-gt v4, v3, :cond_0

    move-object/from16 v0, v20

    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    if-gt v5, v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    new-instance v3, Landroid/os/Bundle;

    const/4 v10, 0x5

    invoke-direct {v3, v10}, Landroid/os/Bundle;-><init>(I)V

    const-string v10, "x"

    invoke-virtual {v3, v10, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "y"

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "width"

    invoke-virtual {v3, v4, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "height"

    invoke-virtual {v3, v4, v9}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "visible"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/abl;->c()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    new-instance v4, Lcom/google/android/gms/internal/abj;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    invoke-direct {v4, v9, v5}, Lcom/google/android/gms/internal/abj;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v4, v2, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/abj;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-virtual {v2, v4, v5, v6}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)Ljava/lang/String;

    move-result-object v21

    const-wide/16 v22, 0x0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->p:Lcom/google/android/gms/ads/internal/client/ao;

    if-eqz v2, :cond_2

    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->p:Lcom/google/android/gms/ads/internal/client/ao;

    invoke-interface {v2}, Lcom/google/android/gms/ads/internal/client/ao;->b()J
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v22

    :cond_2
    :goto_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    move-object/from16 v0, p0

    invoke-virtual {v2, v4, v0, v9}, Lcom/google/android/gms/internal/abl;->a(Landroid/content/Context;Lcom/google/android/gms/internal/abn;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v12

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v4, v2

    :goto_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->v:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v2}, Landroid/support/v4/util/SimpleArrayMap;->size()I

    move-result v2

    if-ge v4, v2, :cond_3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->v:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v2, v4}, Landroid/support/v4/util/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v4, 0x1

    move v4, v2

    goto :goto_2

    :catch_0
    move-exception v2

    const/4 v8, 0x0

    goto/16 :goto_0

    :catch_1
    move-exception v2

    const-string v2, "Cannot get correlation id, default to 0."

    invoke-static {v2}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->q:Lcom/google/android/gms/internal/yy;

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    move v4, v2

    :goto_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    if-eqz v2, :cond_7

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/abl;->r()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x1

    move v15, v2

    :goto_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/b;->i:Lcom/google/android/gms/ads/internal/d;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/d;->c:Lcom/google/android/gms/ads/internal/overlay/m;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-interface {v2, v5}, Lcom/google/android/gms/ads/internal/overlay/m;->a(Landroid/content/Context;)Z

    move-result v29

    const-string v36, ""

    sget-object v2, Lcom/google/android/gms/internal/uf;->cu:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "Getting webview cookie from CookieManager."

    invoke-static {v2}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->g()Lcom/google/android/gms/internal/abw;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/abw;->b(Landroid/content/Context;)Landroid/webkit/CookieManager;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v5, "googleads.g.doubleclick.net"

    invoke-virtual {v2, v5}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    :cond_4
    const/16 v37, 0x0

    if-eqz p3, :cond_5

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/abk;->c()Ljava/lang/String;

    move-result-object v37

    :cond_5
    new-instance v2, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/abl;->a()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v11, v11, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v13, v13, Lcom/google/android/gms/ads/internal/v;->A:Ljava/util/List;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/internal/abl;->g()Z

    move-result v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/b;->l:Landroid/os/Messenger;

    move-object/from16 v17, v0

    move-object/from16 v0, v20

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    move/from16 v18, v0

    move-object/from16 v0, v20

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    move/from16 v19, v0

    move-object/from16 v0, v20

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    move/from16 v20, v0

    invoke-static {}, Lcom/google/android/gms/internal/uf;->a()Ljava/util/List;

    move-result-object v25

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->a:Ljava/lang/String;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    move-object/from16 v27, v0

    move-object/from16 v0, v27

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->w:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    move-object/from16 v27, v0

    new-instance v28, Lcom/google/android/gms/ads/internal/request/CapabilityParcel;

    move-object/from16 v0, v28

    move/from16 v1, v29

    invoke-direct {v0, v4, v15, v1}, Lcom/google/android/gms/ads/internal/request/CapabilityParcel;-><init>(ZZZ)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v4}, Lcom/google/android/gms/ads/internal/v;->h()Ljava/lang/String;

    move-result-object v29

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/abv;->g()F

    move-result v30

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/abv;->h()Z

    move-result v31

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v15, v15, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v4, v15}, Lcom/google/android/gms/internal/abv;->k(Landroid/content/Context;)I

    move-result v32

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v15, v15, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v4, v15}, Lcom/google/android/gms/internal/abv;->b(Landroid/view/View;)I

    move-result v33

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    instance-of v0, v4, Landroid/app/Activity;

    move/from16 v34, v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/abl;->k()Z

    move-result v35

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/abl;->n()Z

    move-result v38

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->B()Lcom/google/android/gms/internal/wh;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/wh;->a()I

    move-result v39

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/abv;->i()Landroid/os/Bundle;

    move-result-object v40

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->m()Lcom/google/android/gms/internal/abz;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/abz;->a()Ljava/lang/String;

    move-result-object v41

    move-object/from16 v4, p1

    move-object/from16 v15, p2

    invoke-direct/range {v2 .. v41}, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Landroid/os/Bundle;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;ZLandroid/os/Messenger;IIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;Lcom/google/android/gms/ads/internal/request/CapabilityParcel;Ljava/lang/String;FZIIZZLjava/lang/String;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;)V

    return-object v2

    :cond_6
    const/4 v2, 0x0

    move v4, v2

    goto/16 :goto_3

    :cond_7
    const/4 v2, 0x0

    move v15, v2

    goto/16 :goto_4
.end method


# virtual methods
.method public A()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->B()V

    return-void
.end method

.method public B()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/internal/abi;Z)V

    return-void
.end method

.method public C()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/ads/internal/b$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/b$2;-><init>(Lcom/google/android/gms/ads/internal/b;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abv;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public D()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/ads/internal/b$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/b$3;-><init>(Lcom/google/android/gms/ads/internal/b;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abv;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/abi;Z)V
    .locals 7
    .param p1    # Lcom/google/android/gms/internal/abi;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_1

    const-string v0, "Ad state was null when trying to ping impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/a;->c(Lcom/google/android/gms/internal/abi;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v0, v0, Lcom/google/android/gms/internal/xh;->d:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v6, v3, Lcom/google/android/gms/internal/xh;->d:Ljava/util/List;

    move-object v3, p1

    move v5, p2

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    iget-object v0, v0, Lcom/google/android/gms/internal/xg;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    iget-object v6, v3, Lcom/google/android/gms/internal/xg;->g:Ljava/util/List;

    move-object v3, p1

    move v5, p2

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/yy;)V
    .locals 1

    const-string v0, "setInAppPurchaseListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->q:Lcom/google/android/gms/internal/yy;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "setPlayStorePurchaseParams must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    new-instance v1, Lcom/google/android/gms/ads/internal/purchase/k;

    invoke-direct {v1, p2}, Lcom/google/android/gms/ads/internal/purchase/k;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->B:Lcom/google/android/gms/ads/internal/purchase/k;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->f()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/purchase/c;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->B:Lcom/google/android/gms/ads/internal/purchase/k;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/ads/internal/purchase/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zd;Lcom/google/android/gms/ads/internal/purchase/k;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abq;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/ads/internal/purchase/d;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1, v2}, Lcom/google/android/gms/ads/internal/purchase/d;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->q:Lcom/google/android/gms/internal/yy;

    if-nez v1, :cond_5

    const-string v1, "InAppPurchaseListener is not set. Try to launch default purchase flow."

    invoke-static {v1}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/util/client/a;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "Google Play Service unavailable, cannot launch default purchase flow."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    if-nez v1, :cond_1

    const-string v0, "PlayStorePurchaseListener is not set."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->B:Lcom/google/android/gms/ads/internal/purchase/k;

    if-nez v1, :cond_2

    const-string v0, "PlayStorePurchaseVerifier is not initialized."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/v;->F:Z

    if-eqz v1, :cond_3

    const-string v0, "An in-app purchase request is already in progress, abort"

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/ads/internal/v;->F:Z

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zd;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/ads/internal/v;->F:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Could not start In-App purchase."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iput-boolean v3, v0, Lcom/google/android/gms/ads/internal/v;->F:Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->s()Lcom/google/android/gms/ads/internal/purchase/i;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->e:Z

    new-instance v4, Lcom/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->B:Lcom/google/android/gms/ads/internal/purchase/k;

    invoke-direct {v4, v5, v6, v0, p0}, Lcom/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/purchase/k;Lcom/google/android/gms/internal/yx;Lcom/google/android/gms/ads/internal/purchase/j;)V

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/ads/internal/purchase/i;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;)V

    goto :goto_0

    :cond_5
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->q:Lcom/google/android/gms/internal/yy;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/yy;->a(Lcom/google/android/gms/internal/yx;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v0, "Could not start In-App purchase."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/ads/internal/purchase/f;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v7, v0, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    new-instance v0, Lcom/google/android/gms/ads/internal/purchase/g;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/purchase/g;-><init>(Landroid/content/Context;Ljava/lang/String;ZILandroid/content/Intent;Lcom/google/android/gms/ads/internal/purchase/f;)V

    invoke-interface {v7, v0}, Lcom/google/android/gms/internal/zd;->a(Lcom/google/android/gms/internal/zc;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/b$1;

    invoke-direct {v1, p0, p4}, Lcom/google/android/gms/ads/internal/b$1;-><init>(Lcom/google/android/gms/ads/internal/b;Landroid/content/Intent;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Fail to invoke PlayStorePurchaseListener."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/abi;Z)Z
    .locals 4

    const-wide/16 v2, 0x0

    if-nez p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p2, Lcom/google/android/gms/internal/abi;->h:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->e:Lcom/google/android/gms/ads/internal/r;

    iget-wide v2, p2, Lcom/google/android/gms/internal/abi;->h:J

    invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;J)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->d()Z

    move-result v0

    return v0

    :cond_1
    iget-object v0, p2, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-wide v0, v0, Lcom/google/android/gms/internal/xh;->i:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->e:Lcom/google/android/gms/ads/internal/r;

    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-wide v2, v1, Lcom/google/android/gms/internal/xh;->i:J

    invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;J)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p2, Lcom/google/android/gms/internal/abi;->n:Z

    if-nez v0, :cond_0

    iget v0, p2, Lcom/google/android/gms/internal/abi;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/r;->b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/un;)Z
    .locals 8

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->u()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return v3

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abl;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/tq;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/internal/tq;)Landroid/os/Bundle;

    move-result-object v7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->a()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iput v3, v0, Lcom/google/android/gms/ads/internal/v;->E:I

    sget-object v0, Lcom/google/android/gms/internal/uf;->cd:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->o()Lcom/google/android/gms/internal/abk;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->A()Lcom/google/android/gms/ads/internal/g;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    if-nez v4, :cond_2

    :goto_1
    iget-object v6, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/g;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;ZLcom/google/android/gms/internal/abk;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    invoke-direct {p0, p1, v7, v4}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Landroid/os/Bundle;Lcom/google/android/gms/internal/abk;)Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;

    move-result-object v0

    const-string v1, "seq_num"

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;->g:Ljava/lang/String;

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "request_id"

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;->v:Ljava/lang/String;

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "session_id"

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;->h:Ljava/lang/String;

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;->f:Landroid/content/pm/PackageInfo;

    if-eqz v1, :cond_1

    const-string v1, "app_version"

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;->f:Landroid/content/pm/PackageInfo;

    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->a()Lcom/google/android/gms/ads/internal/request/a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->d:Lcom/google/android/gms/internal/ro;

    invoke-virtual {v2, v3, v0, v4, p0}, Lcom/google/android/gms/ads/internal/request/a;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel$a;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/request/a$a;)Lcom/google/android/gms/internal/abq;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/ads/internal/v;->g:Lcom/google/android/gms/internal/abq;

    const/4 v3, 0x1

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/abk;->d()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_3
    move-object v4, v5

    goto :goto_2
.end method

.method a(Lcom/google/android/gms/internal/abi;)Z
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->g:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->g:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/b;->g:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    :cond_0
    :goto_0
    invoke-virtual {p0, v1, p1, v0}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/abi;Z)Z

    move-result v0

    return v0

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/internal/abi;->a:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->c:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->c:Landroid/os/Bundle;

    const-string v3, "_noRefresh"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/internal/abi;)Z
    .locals 3
    .param p1    # Lcom/google/android/gms/internal/abi;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p1, Lcom/google/android/gms/internal/abi;->s:Lcom/google/android/gms/internal/xj;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lcom/google/android/gms/internal/abi;->s:Lcom/google/android/gms/internal/xj;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/xj;->a(Lcom/google/android/gms/internal/xi;)V

    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->s:Lcom/google/android/gms/internal/xj;

    if-eqz v1, :cond_1

    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->s:Lcom/google/android/gms/internal/xj;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/xj;->a(Lcom/google/android/gms/internal/xi;)V

    :cond_1
    iget-object v1, p2, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    if-eqz v1, :cond_2

    iget-object v0, p2, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget v1, v0, Lcom/google/android/gms/internal/xh;->o:I

    iget-object v0, p2, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget v0, v0, Lcom/google/android/gms/internal/xh;->p:I

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->C:Lcom/google/android/gms/internal/abo;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/abo;->a(II)V

    const/4 v0, 0x1

    return v0

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/abi;)V
    .locals 7

    const/4 v5, 0x0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/a;->b(Lcom/google/android/gms/internal/abi;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    if-eqz v0, :cond_0

    const-string v0, "Pinging network fill URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    iget-object v6, v3, Lcom/google/android/gms/internal/xg;->h:Ljava/util/List;

    move-object v3, p1

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v0, v0, Lcom/google/android/gms/internal/xh;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v0, v0, Lcom/google/android/gms/internal/xh;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "Pinging urls remotely"

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v2, v2, Lcom/google/android/gms/internal/xh;->f:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Ljava/util/List;)V

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/abi;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v0, v0, Lcom/google/android/gms/internal/xh;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    const-string v0, "Pinging no fill URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v6, v3, Lcom/google/android/gms/internal/xh;->e:Ljava/util/List;

    move-object v3, p1

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    :cond_1
    return-void
.end method

.method protected b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 1

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/a;->b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/b;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 2

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->g()Lcom/google/android/gms/internal/abw;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v1, v1, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abw;->a(Lcom/google/android/gms/internal/acy;)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/xr;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ti;->d(Lcom/google/android/gms/internal/abi;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->b()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not pause mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e()V
    .locals 7

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-nez v0, :cond_0

    const-string v0, "Ad state was null when trying to ping click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v0, v0, Lcom/google/android/gms/internal/xh;->c:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v6, v6, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v6, v6, Lcom/google/android/gms/internal/xh;->c:Ljava/util/List;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    iget-object v0, v0, Lcom/google/android/gms/internal/xg;->f:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v6, v6, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    iget-object v6, v6, Lcom/google/android/gms/internal/xg;->f:Ljava/util/List;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    :cond_2
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/a;->e()V

    goto :goto_0
.end method

.method public f()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "showInterstitial is not supported for current ad type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ti;->e(Lcom/google/android/gms/internal/abi;)V

    return-void
.end method

.method public h_()V
    .locals 3

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v1, v1, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/v;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->g()Lcom/google/android/gms/internal/abw;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v2, v2, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/abw;->b(Lcom/google/android/gms/internal/acy;)Z

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v1, v1, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    if-eqz v1, :cond_2

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v1, v1, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    invoke-interface {v1}, Lcom/google/android/gms/internal/xr;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->u()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->c()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ti;->e(Lcom/google/android/gms/internal/abi;)V

    return-void

    :catch_0
    move-exception v1

    const-string v1, "Could not resume mediation adapter."

    invoke-static {v1}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public i_()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ti;->b(Lcom/google/android/gms/internal/abi;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/b;->k:Z

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->p()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abj;->c()V

    return-void
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->q:Ljava/lang/String;

    goto :goto_0
.end method

.method public j_()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/b;->k:Z

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->r()V

    return-void
.end method

.method public k_()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ti;->d(Lcom/google/android/gms/internal/abi;)V

    return-void
.end method

.method protected u()Z
    .locals 5

    const/4 v0, 0x1

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.permission.INTERNET"

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return v0
.end method

.method public v()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->e()V

    return-void
.end method

.method public w()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->i_()V

    return-void
.end method

.method public x()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->m()V

    return-void
.end method

.method public y()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->j_()V

    return-void
.end method

.method public z()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->q:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x4a

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Mediation adapter "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refreshed, but mediation adapters should never refresh."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/b;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/internal/abi;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/b;->s()V

    return-void
.end method
