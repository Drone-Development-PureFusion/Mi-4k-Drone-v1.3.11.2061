.class public Lcom/google/android/gms/internal/ws;
.super Lcom/google/android/gms/ads/internal/client/ak$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/gms/internal/wm;

.field private c:Lcom/google/android/gms/ads/internal/l;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/wo;

.field private e:Lcom/google/android/gms/internal/zd;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/d;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/wm;

    invoke-direct {v0, p1, p3, p4, p5}, Lcom/google/android/gms/internal/wm;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/xq;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/d;)V

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ws;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/wm;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/wm;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/ak$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ws;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ws;->b:Lcom/google/android/gms/internal/wm;

    new-instance v0, Lcom/google/android/gms/internal/wo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wo;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->t()Lcom/google/android/gms/internal/wp;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/wp;->a(Lcom/google/android/gms/internal/wm;)V

    return-void
.end method

.method static b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/wp;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "gw"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static c(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/wp;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "_ad"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private n()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->e:Lcom/google/android/gms/internal/zd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->e:Lcom/google/android/gms/internal/zd;

    iget-object v2, p0, Lcom/google/android/gms/internal/ws;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/c/e;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->a()Lcom/google/android/gms/c/e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getVideoController not implemented for interstitials"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/af;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iput-object p1, v0, Lcom/google/android/gms/internal/wo;->e:Lcom/google/android/gms/ads/internal/client/af;

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/ag;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iput-object p1, v0, Lcom/google/android/gms/internal/wo;->a:Lcom/google/android/gms/ads/internal/client/ag;

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/am;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iput-object p1, v0, Lcom/google/android/gms/internal/wo;->b:Lcom/google/android/gms/ads/internal/client/am;

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/ao;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ws;->m()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/ao;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/reward/client/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iput-object p1, v0, Lcom/google/android/gms/internal/wo;->f:Lcom/google/android/gms/ads/internal/reward/client/d;

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ur;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iput-object p1, v0, Lcom/google/android/gms/internal/wo;->d:Lcom/google/android/gms/internal/ur;

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/yy;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iput-object p1, v0, Lcom/google/android/gms/internal/wo;->c:Lcom/google/android/gms/internal/yy;

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ws;->e:Lcom/google/android/gms/internal/zd;

    iput-object p2, p0, Lcom/google/android/gms/internal/ws;->f:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ws;->n()V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ws;->m()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/l;->a(Z)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/uf;->at:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ws;->b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ws;->m()V

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/wp;->c(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ws;->m()V

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->j:Lcom/google/android/gms/ads/internal/client/SearchAdRequestParcel;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ws;->m()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    :goto_0
    return v0

    :cond_4
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->t()Lcom/google/android/gms/internal/wp;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ws;->c(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/wp;->b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;)V

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/wp;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;)Lcom/google/android/gms/internal/wr$a;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-boolean v1, v0, Lcom/google/android/gms/internal/wr$a;->e:Z

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wr$a;->a()V

    :cond_6
    iget-object v1, v0, Lcom/google/android/gms/internal/wr$a;->a:Lcom/google/android/gms/ads/internal/l;

    iput-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    iget-object v1, v0, Lcom/google/android/gms/internal/wr$a;->c:Lcom/google/android/gms/internal/wn;

    iget-object v2, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/internal/wo;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v2, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ws;->n()V

    iget-boolean v0, v0, Lcom/google/android/gms/internal/wr$a;->f:Z

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ws;->m()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->b()V

    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->d()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->f()V

    :goto_0
    return-void

    :cond_0
    const-string v0, "Interstitial ad must be loaded before showInterstitial()."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->h()V

    :goto_0
    return-void

    :cond_0
    const-string v0, "Interstitial ad must be loaded before pingManualTrackingUrl()."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public h_()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->h_()V

    :cond_0
    return-void
.end method

.method public i()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->i()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->j()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public l()Lcom/google/android/gms/ads/internal/client/c;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getVideoController not implemented for interstitials"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l_()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/l;->l_()V

    :cond_0
    return-void
.end method

.method m()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->b:Lcom/google/android/gms/internal/wm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wm;->a(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    iget-object v0, p0, Lcom/google/android/gms/internal/ws;->d:Lcom/google/android/gms/internal/wo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ws;->c:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wo;->a(Lcom/google/android/gms/ads/internal/l;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ws;->n()V

    goto :goto_0
.end method
