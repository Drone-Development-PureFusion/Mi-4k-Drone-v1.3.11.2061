.class public final Lcom/google/android/gms/ads/internal/v;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/internal/v$a;
    }
.end annotation


# instance fields
.field A:Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field B:Lcom/google/android/gms/ads/internal/purchase/k;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public C:Lcom/google/android/gms/internal/abo;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field D:Landroid/view/View;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public E:I

.field F:Z

.field G:Z

.field private H:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/abj;",
            ">;"
        }
    .end annotation
.end field

.field private I:I

.field private J:I

.field private K:Lcom/google/android/gms/internal/ach;

.field private L:Z

.field private M:Z

.field private N:Z

.field final a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public final c:Landroid/content/Context;

.field final d:Lcom/google/android/gms/internal/ro;

.field public final e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field f:Lcom/google/android/gms/ads/internal/v$a;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public g:Lcom/google/android/gms/internal/abq;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public h:Lcom/google/android/gms/internal/abx;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

.field public j:Lcom/google/android/gms/internal/abi;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public k:Lcom/google/android/gms/internal/abi$a;

.field public l:Lcom/google/android/gms/internal/abj;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field m:Lcom/google/android/gms/ads/internal/client/af;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field n:Lcom/google/android/gms/ads/internal/client/ag;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field o:Lcom/google/android/gms/ads/internal/client/am;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field p:Lcom/google/android/gms/ads/internal/client/ao;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field q:Lcom/google/android/gms/internal/yy;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field r:Lcom/google/android/gms/internal/zd;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field s:Lcom/google/android/gms/internal/vf;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field t:Lcom/google/android/gms/internal/vg;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field u:Landroid/support/v4/util/SimpleArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SimpleArrayMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/vh;",
            ">;"
        }
    .end annotation
.end field

.field v:Landroid/support/v4/util/SimpleArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SimpleArrayMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/vi;",
            ">;"
        }
    .end annotation
.end field

.field w:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field x:Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field y:Lcom/google/android/gms/internal/ur;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field z:Lcom/google/android/gms/ads/internal/reward/client/d;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/v;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ro;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ro;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/v;->C:Lcom/google/android/gms/internal/abo;

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/v;->D:Landroid/view/View;

    iput v0, p0, Lcom/google/android/gms/ads/internal/v;->E:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->F:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->G:Z

    iput-object v2, p0, Lcom/google/android/gms/ads/internal/v;->H:Ljava/util/HashSet;

    iput v1, p0, Lcom/google/android/gms/ads/internal/v;->I:I

    iput v1, p0, Lcom/google/android/gms/ads/internal/v;->J:I

    iput-boolean v3, p0, Lcom/google/android/gms/ads/internal/v;->L:Z

    iput-boolean v3, p0, Lcom/google/android/gms/ads/internal/v;->M:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->N:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/uf;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->e()Lcom/google/android/gms/internal/uh;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/uf;->b()Ljava/util/List;

    move-result-object v0

    iget v1, p4, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->c:I

    if-eqz v1, :cond_0

    iget v1, p4, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abl;->e()Lcom/google/android/gms/internal/uh;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/uh;->a(Ljava/util/List;)V

    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/v;->a:Ljava/lang/String;

    iget-boolean v0, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->e:Z

    if-nez v0, :cond_2

    iget-boolean v0, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->i:Z

    if-eqz v0, :cond_3

    :cond_2
    iput-object v2, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    if-eqz p5, :cond_4

    :goto_1
    iput-object p5, p0, Lcom/google/android/gms/ads/internal/v;->d:Lcom/google/android/gms/internal/ro;

    new-instance v0, Lcom/google/android/gms/internal/ach;

    const-wide/16 v2, 0xc8

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ach;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/v;->K:Lcom/google/android/gms/internal/ach;

    new-instance v0, Landroid/support/v4/util/SimpleArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/v;->v:Landroid/support/v4/util/SimpleArrayMap;

    return-void

    :cond_3
    new-instance v0, Lcom/google/android/gms/ads/internal/v$a;

    invoke-direct {v0, p1, p3, p0, p0}, Lcom/google/android/gms/ads/internal/v$a;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    iget v1, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->g:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/v$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    iget v1, p2, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->d:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/v$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/v$a;->setVisibility(I)V

    goto :goto_0

    :cond_4
    new-instance p5, Lcom/google/android/gms/internal/ro;

    new-instance v0, Lcom/google/android/gms/ads/internal/i;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/i;-><init>(Lcom/google/android/gms/ads/internal/v;)V

    invoke-direct {p5, v0}, Lcom/google/android/gms/internal/ro;-><init>(Lcom/google/android/gms/internal/oq;)V

    goto :goto_1
.end method

.method private b(Z)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v2, v2, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v2, v2, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v2}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/v;->K:Lcom/google/android/gms/internal/ach;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ach;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v2, v2, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v2}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/acz;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x2

    new-array v2, v2, [I

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/ads/internal/v$a;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    aget v5, v2, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/ads/internal/util/client/a;->b(Landroid/content/Context;I)I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    aget v2, v2, v0

    invoke-virtual {v4, v5, v2}, Lcom/google/android/gms/ads/internal/util/client/a;->b(Landroid/content/Context;I)I

    move-result v2

    iget v4, p0, Lcom/google/android/gms/ads/internal/v;->I:I

    if-ne v3, v4, :cond_3

    iget v4, p0, Lcom/google/android/gms/ads/internal/v;->J:I

    if-eq v2, v4, :cond_4

    :cond_3
    iput v3, p0, Lcom/google/android/gms/ads/internal/v;->I:I

    iput v2, p0, Lcom/google/android/gms/ads/internal/v;->J:I

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v2, v2, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v2}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/ads/internal/v;->I:I

    iget v4, p0, Lcom/google/android/gms/ads/internal/v;->J:I

    if-nez p1, :cond_5

    :goto_1
    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/internal/acz;->a(IIZ)V

    :cond_4
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/v;->k()V

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_1
.end method

.method private k()V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v$a;->getRootView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/ads/internal/v$a;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    invoke-virtual {v0, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    iget v0, v1, Landroid/graphics/Rect;->top:I

    iget v3, v2, Landroid/graphics/Rect;->top:I

    if-eq v0, v3, :cond_2

    iput-boolean v4, p0, Lcom/google/android/gms/ads/internal/v;->L:Z

    :cond_2
    iget v0, v1, Landroid/graphics/Rect;->bottom:I

    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    if-eq v0, v1, :cond_0

    iput-boolean v4, p0, Lcom/google/android/gms/ads/internal/v;->M:Z

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/abj;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->H:Ljava/util/HashSet;

    return-object v0
.end method

.method public a(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/abj;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/v;->H:Ljava/util/HashSet;

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/v;->E:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/v;->c()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->g:Lcom/google/android/gms/internal/abq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->g:Lcom/google/android/gms/internal/abq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abq;->d()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/abx;->d()V

    :cond_2
    if-eqz p1, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    :cond_3
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->destroy()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->stopLoading()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->p:Lcom/google/android/gms/internal/xr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/xr;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "Could not destroy mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/v;->E:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/ads/internal/v;->E:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v$a;->b()V

    :cond_0
    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->L:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->M:Z

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->L:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->N:Z

    if-eqz v0, :cond_1

    const-string v0, "top-scrollable"

    goto :goto_0

    :cond_1
    const-string v0, "top-locked"

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->M:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->N:Z

    if-eqz v0, :cond_3

    const-string v0, "bottom-scrollable"

    goto :goto_0

    :cond_3
    const-string v0, "bottom-locked"

    goto :goto_0

    :cond_4
    const-string v0, ""

    goto :goto_0
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-wide v2, v1, Lcom/google/android/gms/internal/abi;->A:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/abj;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-wide v2, v1, Lcom/google/android/gms/internal/abi;->B:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/abj;->b(J)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/abi;->n:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abj;->b(Z)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->e:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abj;->a(Z)V

    goto :goto_0
.end method

.method public j()V
    .locals 2

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/v;->g()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/v;->o:Lcom/google/android/gms/ads/internal/client/am;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/v;->r:Lcom/google/android/gms/internal/zd;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/v;->q:Lcom/google/android/gms/internal/yy;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/v;->y:Lcom/google/android/gms/internal/ur;

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/v;->p:Lcom/google/android/gms/ads/internal/client/ao;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/v;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v$a;->removeAllViews()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/v;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/v;->d()V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    return-void
.end method

.method public onGlobalLayout()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/v;->b(Z)V

    return-void
.end method

.method public onScrollChanged()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/v;->b(Z)V

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/v;->N:Z

    return-void
.end method
