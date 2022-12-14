.class public Lcom/google/android/gms/internal/aau;
.super Lcom/google/android/gms/ads/internal/b;

# interfaces
.implements Lcom/google/android/gms/internal/aay;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# static fields
.field private static final l:Lcom/google/android/gms/internal/xp;


# instance fields
.field private final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/abc;",
            ">;"
        }
    .end annotation
.end field

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/xp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/xp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/aau;->l:Lcom/google/android/gms/internal/xp;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/d;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 7

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/b;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/d;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aau;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aau;->a(I)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/abi$a;)Lcom/google/android/gms/internal/abi$a;
    .locals 23

    const-string v2, "Creating mediation ad response for non-mediated rewarded ad."

    invoke-static {v2}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    :try_start_0
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-static {v2}, Lcom/google/android/gms/internal/aaf;->a(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "pubid"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/internal/abi$a;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->e:Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    new-instance v2, Lcom/google/android/gms/internal/xg;

    const/4 v4, 0x0

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    const-string v7, "com.google.ads.mediation.admob.AdMobAdapter"

    aput-object v7, v5, v6

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v12

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v19

    invoke-direct/range {v2 .. v19}, Lcom/google/android/gms/internal/xg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    new-instance v22, Lcom/google/android/gms/internal/xh;

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/internal/xg;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-wide/16 v4, -0x1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    const-string v11, ""

    const-wide/16 v12, -0x1

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, -0x1

    const-wide/16 v19, -0x1

    const/16 v21, 0x0

    move-object/from16 v2, v22

    invoke-direct/range {v2 .. v21}, Lcom/google/android/gms/internal/xh;-><init>(Ljava/util/List;JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;JIILjava/lang/String;IIJZ)V

    new-instance v2, Lcom/google/android/gms/internal/abi$a;

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/internal/abi$a;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/google/android/gms/internal/abi$a;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-object/from16 v0, p1

    iget v7, v0, Lcom/google/android/gms/internal/abi$a;->e:I

    move-object/from16 v0, p1

    iget-wide v8, v0, Lcom/google/android/gms/internal/abi$a;->f:J

    move-object/from16 v0, p1

    iget-wide v10, v0, Lcom/google/android/gms/internal/abi$a;->g:J

    move-object/from16 v0, p1

    iget-object v12, v0, Lcom/google/android/gms/internal/abi$a;->h:Lorg/json/JSONObject;

    move-object/from16 v5, v22

    invoke-direct/range {v2 .. v12}, Lcom/google/android/gms/internal/abi$a;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/xh;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V

    :goto_0
    return-object v2

    :catch_0
    move-exception v2

    const-string v3, "Unable to generate ad state for non-mediated rewarded video."

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/abr;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/aau;->c(Lcom/google/android/gms/internal/abi$a;)Lcom/google/android/gms/internal/abi$a;

    move-result-object v2

    goto :goto_0
.end method

.method private c(Lcom/google/android/gms/internal/abi$a;)Lcom/google/android/gms/internal/abi$a;
    .locals 11

    new-instance v0, Lcom/google/android/gms/internal/abi$a;

    iget-object v1, p1, Lcom/google/android/gms/internal/abi$a;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v2, p1, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    const/4 v3, 0x0

    iget-object v4, p1, Lcom/google/android/gms/internal/abi$a;->d:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    const/4 v5, 0x0

    iget-wide v6, p1, Lcom/google/android/gms/internal/abi$a;->f:J

    iget-wide v8, p1, Lcom/google/android/gms/internal/abi$a;->g:J

    iget-object v10, p1, Lcom/google/android/gms/internal/abi$a;->h:Lorg/json/JSONObject;

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/abi$a;-><init>(Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/ads/internal/request/AdResponseParcel;Lcom/google/android/gms/internal/xh;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;IJJLorg/json/JSONObject;)V

    return-object v0
.end method


# virtual methods
.method public E()V
    .locals 2

    const-string v0, "showAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aau;->F()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "The reward video has not loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aau;->n:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->q:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aau;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/abc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/xr;->f()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not call showVideo."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public F()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->g:Lcom/google/android/gms/internal/abq;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aau;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public G()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/aau;->a(Lcom/google/android/gms/internal/abi;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aau;->r()V

    return-void
.end method

.method public H()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v4, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v6, v6, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    iget-object v6, v6, Lcom/google/android/gms/internal/xg;->j:Ljava/util/List;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/aau;->t()V

    return-void
.end method

.method public I()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aau;->p()V

    return-void
.end method

.method public J()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aau;->e()V

    return-void
.end method

.method public K()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aau;->q()V

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/abc;

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/xr;->a(Lcom/google/android/gms/c/e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Unable to call Adapter.onContextChanged."

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/abr;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;)V
    .locals 2

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Invalid ad unit id. Aborting."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/aau$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/aau$1;-><init>(Lcom/google/android/gms/internal/aau;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aau;->n:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    invoke-super {p0, v0}, Lcom/google/android/gms/ads/internal/b;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/un;)V
    .locals 4

    iget v0, p1, Lcom/google/android/gms/internal/abi$a;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/aau$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/aau$2;-><init>(Lcom/google/android/gms/internal/aau;Lcom/google/android/gms/internal/abi$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->k:Lcom/google/android/gms/internal/abi$a;

    iget-object v0, p1, Lcom/google/android/gms/internal/abi$a;->c:Lcom/google/android/gms/internal/xh;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aau;->b(Lcom/google/android/gms/internal/abi$a;)Lcom/google/android/gms/internal/abi$a;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->k:Lcom/google/android/gms/internal/abi$a;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/ads/internal/v;->E:I

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->d()Lcom/google/android/gms/internal/zn;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->k:Lcom/google/android/gms/internal/abi$a;

    invoke-virtual {v1, v2, v3, p0}, Lcom/google/android/gms/internal/zn;->a(Landroid/content/Context;Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/aau;)Lcom/google/android/gms/internal/abx;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/abi;Z)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/internal/abi;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b()V
    .locals 4

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/abc;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/xr;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v1, "Fail to destroy adapter: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public b(Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;)V
    .locals 7
    .param p1    # Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->x()Lcom/google/android/gms/internal/xm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v4, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v6, v6, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v6, v6, Lcom/google/android/gms/internal/abi;->o:Lcom/google/android/gms/internal/xg;

    iget-object v6, v6, Lcom/google/android/gms/internal/xg;->k:Ljava/util/List;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/xm;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/abi;Ljava/lang/String;ZLjava/util/List;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v0, v0, Lcom/google/android/gms/internal/xh;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance p1, Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget-object v0, v0, Lcom/google/android/gms/internal/xh;->j:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/aau;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v1, v1, Lcom/google/android/gms/internal/abi;->r:Lcom/google/android/gms/internal/xh;

    iget v1, v1, Lcom/google/android/gms/internal/xh;->k:I

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;-><init>(Ljava/lang/String;I)V

    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aau;->a(Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;)V

    return-void
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/internal/abc;
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/abc;

    if-nez v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/aau;->j:Lcom/google/android/gms/internal/xq;

    const-string v2, "com.google.ads.mediation.admob.AdMobAdapter"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/aau;->l:Lcom/google/android/gms/internal/xp;

    move-object v2, v1

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/abc;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/xq;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/xr;

    move-result-object v2

    invoke-direct {v1, v2, p0}, Lcom/google/android/gms/internal/abc;-><init>(Lcom/google/android/gms/internal/xr;Lcom/google/android/gms/internal/aay;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v1

    :cond_0
    :goto_1
    return-object v0

    :catch_0
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    :goto_2
    const-string v3, "Fail to instantiate adapter "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v2, v0

    goto :goto_2

    :cond_2
    move-object v2, v1

    goto :goto_0
.end method

.method public d()V
    .locals 4

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/abc;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/xr;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v1, "Fail to pause adapter: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public h_()V
    .locals 4

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/aau;->m:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/abc;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abc;->a()Lcom/google/android/gms/internal/xr;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/xr;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v1, "Fail to resume adapter: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    return-void
.end method
