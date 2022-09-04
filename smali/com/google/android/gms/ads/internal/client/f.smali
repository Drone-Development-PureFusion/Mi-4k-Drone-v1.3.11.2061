.class public Lcom/google/android/gms/ads/internal/client/f;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/ads/internal/client/ae;

.field private final b:Lcom/google/android/gms/internal/xp;

.field private final c:Lcom/google/android/gms/ads/internal/client/y;

.field private final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final e:Lcom/google/android/gms/ads/h;

.field private f:Lcom/google/android/gms/ads/internal/client/a;

.field private g:Lcom/google/android/gms/ads/a;

.field private h:[Lcom/google/android/gms/ads/d;

.field private i:Lcom/google/android/gms/ads/doubleclick/a;

.field private j:Lcom/google/android/gms/ads/e;

.field private k:Lcom/google/android/gms/ads/internal/client/ak;

.field private l:Lcom/google/android/gms/ads/purchase/b;

.field private m:Lcom/google/android/gms/ads/doubleclick/c;

.field private n:Lcom/google/android/gms/ads/purchase/d;

.field private o:Lcom/google/android/gms/ads/i;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Landroid/view/ViewGroup;

.field private s:Z

.field private t:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;Z)V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y;Z)V

    return-void
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y;Lcom/google/android/gms/ads/internal/client/ak;Z)V
    .locals 5

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/xp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/xp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->b:Lcom/google/android/gms/internal/xp;

    new-instance v0, Lcom/google/android/gms/ads/h;

    invoke-direct {v0}, Lcom/google/android/gms/ads/h;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->e:Lcom/google/android/gms/ads/h;

    new-instance v0, Lcom/google/android/gms/ads/internal/client/f$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/client/f$1;-><init>(Lcom/google/android/gms/ads/internal/client/f;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->a:Lcom/google/android/gms/ads/internal/client/ae;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->r:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/f;->c:Lcom/google/android/gms/ads/internal/client/y;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p6, p0, Lcom/google/android/gms/ads/internal/client/f;->s:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzk;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/ads/internal/client/zzk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {v0, p3}, Lcom/google/android/gms/ads/internal/client/zzk;->a(Z)[Lcom/google/android/gms/ads/d;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzk;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->p:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    aget-object v2, v2, v3

    iget-boolean v3, p0, Lcom/google/android/gms/ads/internal/client/f;->s:Z

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/ads/internal/client/f;->a(Landroid/content/Context;Lcom/google/android/gms/ads/d;Z)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    const-string v2, "Ads by Google"

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/ads/internal/util/client/a;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    sget-object v4, Lcom/google/android/gms/ads/d;->c:Lcom/google/android/gms/ads/d;

    invoke-direct {v3, v1, v4}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/d;)V

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v3, v1, v0}, Lcom/google/android/gms/ads/internal/util/client/a;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y;Z)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y;Lcom/google/android/gms/ads/internal/client/ak;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZZ)V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Z)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/ads/internal/client/y;Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/client/f;)Lcom/google/android/gms/ads/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->e:Lcom/google/android/gms/ads/h;

    return-object v0
.end method

.method private static a(Landroid/content/Context;Lcom/google/android/gms/ads/d;Z)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/d;)V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->a(Z)V

    return-object v0
.end method

.method private static a(Landroid/content/Context;[Lcom/google/android/gms/ads/d;Z)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/d;)V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->a(Z)V

    return-object v0
.end method

.method private s()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->a()Lcom/google/android/gms/c/e;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->r:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get an ad frame."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to destroy AdView."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->g:Lcom/google/android/gms/ads/a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->a:Lcom/google/android/gms/ads/internal/client/ae;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/ae;->a(Lcom/google/android/gms/ads/a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->i:Lcom/google/android/gms/ads/doubleclick/a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/aa;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/aa;-><init>(Lcom/google/android/gms/ads/doubleclick/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/am;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/c;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->m:Lcom/google/android/gms/ads/doubleclick/c;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/us;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/us;-><init>(Lcom/google/android/gms/ads/doubleclick/c;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/ur;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the onCustomRenderedAdLoadedListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/e;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->j:Lcom/google/android/gms/ads/e;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->j:Lcom/google/android/gms/ads/e;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/ao;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->j:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->b()Lcom/google/android/gms/ads/internal/client/ad;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set correlator."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/i;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->o:Lcom/google/android/gms/ads/i;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;-><init>(Lcom/google/android/gms/ads/i;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set video options."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->f:Lcom/google/android/gms/ads/internal/client/a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/s;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/s;-><init>(Lcom/google/android/gms/ads/internal/client/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/af;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdClickListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/e;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/f;->q()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->c:Lcom/google/android/gms/ads/internal/client/y;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->r:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/y;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/e;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->b:Lcom/google/android/gms/internal/xp;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/e;->j()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/xp;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/purchase/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->n:Lcom/google/android/gms/ads/purchase/d;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Play store purchase parameter has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->l:Lcom/google/android/gms/ads/purchase/b;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ze;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ze;-><init>(Lcom/google/android/gms/ads/purchase/b;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/yy;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the InAppPurchaseListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/purchase/d;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->l:Lcom/google/android/gms/ads/purchase/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "InAppPurchaseListener has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->n:Lcom/google/android/gms/ads/purchase/d;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/f;->q:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/zi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zi;-><init>(Lcom/google/android/gms/ads/purchase/d;)V

    :goto_0
    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the play store purchase parameter."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->p:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/client/f;->t:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/client/f;->t:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to set manual impressions."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public varargs a([Lcom/google/android/gms/ads/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/client/f;->b([Lcom/google/android/gms/ads/d;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)Z
    .locals 2

    const-string v0, "search_v2"

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b()Lcom/google/android/gms/ads/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->g:Lcom/google/android/gms/ads/a;

    return-object v0
.end method

.method public varargs b([Lcom/google/android/gms/ads/d;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->r:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    iget-boolean v3, p0, Lcom/google/android/gms/ads/internal/client/f;->s:Z

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/ads/internal/client/f;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/d;Z)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->r:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the ad size."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/ads/d;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->i()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->b()Lcom/google/android/gms/ads/d;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the current AdSize."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()[Lcom/google/android/gms/ads/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->p:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/ads/doubleclick/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->i:Lcom/google/android/gms/ads/doubleclick/a;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/ads/purchase/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->l:Lcom/google/android/gms/ads/purchase/b;

    return-object v0
.end method

.method public h()Lcom/google/android/gms/ads/doubleclick/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->m:Lcom/google/android/gms/ads/doubleclick/c;

    return-object v0
.end method

.method public i()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call pause."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public j()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->h()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to record impression."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public k()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->h_()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call resume."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public l()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->j()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the mediation adapter class name."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->k()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to check if ad is loading."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public n()Lcom/google/android/gms/ads/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->e:Lcom/google/android/gms/ads/h;

    return-object v0
.end method

.method public o()Lcom/google/android/gms/ads/internal/client/c;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/client/ak;->l()Lcom/google/android/gms/ads/internal/client/c;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to retrieve VideoController."

    invoke-static {v2, v1}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public p()Lcom/google/android/gms/ads/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->o:Lcom/google/android/gms/ads/i;

    return-object v0
.end method

.method q()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size and ad unit ID must be set before loadAd is called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/f;->r()Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/t;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->a:Lcom/google/android/gms/ads/internal/client/ae;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/t;-><init>(Lcom/google/android/gms/ads/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/ag;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->f:Lcom/google/android/gms/ads/internal/client/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/s;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->f:Lcom/google/android/gms/ads/internal/client/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/s;-><init>(Lcom/google/android/gms/ads/internal/client/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/af;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->i:Lcom/google/android/gms/ads/doubleclick/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/aa;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->i:Lcom/google/android/gms/ads/doubleclick/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/aa;-><init>(Lcom/google/android/gms/ads/doubleclick/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/am;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->l:Lcom/google/android/gms/ads/purchase/b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/internal/ze;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->l:Lcom/google/android/gms/ads/purchase/b;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ze;-><init>(Lcom/google/android/gms/ads/purchase/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/yy;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->n:Lcom/google/android/gms/ads/purchase/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/internal/zi;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->n:Lcom/google/android/gms/ads/purchase/d;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zi;-><init>(Lcom/google/android/gms/ads/purchase/d;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->q:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->m:Lcom/google/android/gms/ads/doubleclick/c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/internal/us;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->m:Lcom/google/android/gms/ads/doubleclick/c;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/us;-><init>(Lcom/google/android/gms/ads/doubleclick/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/ur;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->j:Lcom/google/android/gms/ads/e;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->j:Lcom/google/android/gms/ads/e;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/e;->b()Lcom/google/android/gms/ads/internal/client/ad;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/ao;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->o:Lcom/google/android/gms/ads/i;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/f;->o:Lcom/google/android/gms/ads/i;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;-><init>(Lcom/google/android/gms/ads/i;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;)V

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->k:Lcom/google/android/gms/ads/internal/client/ak;

    iget-boolean v1, p0, Lcom/google/android/gms/ads/internal/client/f;->t:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/f;->s()V

    return-void
.end method

.method protected r()Lcom/google/android/gms/ads/internal/client/ak;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/f;->r:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/f;->h:[Lcom/google/android/gms/ads/d;

    iget-boolean v2, p0, Lcom/google/android/gms/ads/internal/client/f;->s:Z

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/f;->a(Landroid/content/Context;[Lcom/google/android/gms/ads/d;Z)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/ads/internal/client/f;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->b()Lcom/google/android/gms/ads/internal/client/ab;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/f;->p:Ljava/lang/String;

    invoke-virtual {v2, v0, v1, v3}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->b()Lcom/google/android/gms/ads/internal/client/ab;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/f;->p:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/client/f;->b:Lcom/google/android/gms/internal/xp;

    invoke-virtual {v2, v0, v1, v3, v4}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    goto :goto_0
.end method
