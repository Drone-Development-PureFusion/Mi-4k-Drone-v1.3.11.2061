.class public Lcom/google/android/gms/maps/StreetViewPanoramaView;
.super Landroid/widget/FrameLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/StreetViewPanoramaView$b;,
        Lcom/google/android/gms/maps/StreetViewPanoramaView$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

.field private b:Lcom/google/android/gms/maps/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->c()V

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/c/b;->b(Landroid/widget/FrameLayout;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/maps/g;)V
    .locals 1

    const-string v0, "getStreetViewPanoramaAsync() must be called on the main thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->a(Lcom/google/android/gms/maps/g;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->d()V

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->g()V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->h()V

    return-void
.end method

.method public final getStreetViewPanorama()Lcom/google/android/gms/maps/i;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->b:Lcom/google/android/gms/maps/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->b:Lcom/google/android/gms/maps/i;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->i()V

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/maps/i;

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->a:Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->a()Lcom/google/android/gms/c/a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->h()Lcom/google/android/gms/maps/a/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/i;->a()Lcom/google/android/gms/maps/a/g;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/i;-><init>(Lcom/google/android/gms/maps/a/g;)V

    iput-object v1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->b:Lcom/google/android/gms/maps/i;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->b:Lcom/google/android/gms/maps/i;

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
