.class public Lcom/google/android/gms/maps/MapFragment;
.super Landroid/app/Fragment;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/MapFragment$b;,
        Lcom/google/android/gms/maps/MapFragment$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/maps/MapFragment$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    new-instance v0, Lcom/google/android/gms/maps/MapFragment$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/MapFragment$b;-><init>(Landroid/app/Fragment;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    return-void
.end method

.method public static a()Lcom/google/android/gms/maps/MapFragment;
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/MapFragment;

    invoke-direct {v0}, Lcom/google/android/gms/maps/MapFragment;-><init>()V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/maps/GoogleMapOptions;)Lcom/google/android/gms/maps/MapFragment;
    .locals 3

    new-instance v0, Lcom/google/android/gms/maps/MapFragment;

    invoke-direct {v0}, Lcom/google/android/gms/maps/MapFragment;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "MapOptions"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "onEnterAmbient must be called on the main thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapFragment$b;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/f;)V
    .locals 1

    const-string v0, "getMapAsync must be called on the main thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapFragment$b;->a(Lcom/google/android/gms/maps/f;)V

    return-void
.end method

.method public final b()V
    .locals 1

    const-string v0, "onExitAmbient must be called on the main thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->j()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-class v0, Lcom/google/android/gms/maps/MapFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/maps/MapFragment$b;->a(Lcom/google/android/gms/maps/MapFragment$b;Landroid/app/Activity;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapFragment$b;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/maps/MapFragment$b;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->g()V

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->f()V

    invoke-super {p0}, Landroid/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/maps/MapFragment$b;->a(Lcom/google/android/gms/maps/MapFragment$b;Landroid/app/Activity;)V

    invoke-static {p1, p2}, Lcom/google/android/gms/maps/GoogleMapOptions;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/maps/GoogleMapOptions;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "MapOptions"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0, p1, v1, p3}, Lcom/google/android/gms/maps/MapFragment$b;->a(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->h()V

    invoke-super {p0}, Landroid/app/Fragment;->onLowMemory()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->d()V

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->c()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-class v0, Lcom/google/android/gms/maps/MapFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapFragment$b;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->b()V

    return-void
.end method

.method public onStop()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/MapFragment;->a:Lcom/google/android/gms/maps/MapFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapFragment$b;->e()V

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    return-void
.end method

.method public setArguments(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-void
.end method
