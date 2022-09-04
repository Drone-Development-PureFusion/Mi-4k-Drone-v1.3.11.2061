.class public Lcom/google/android/gms/internal/zznv;
.super Landroid/support/v4/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method public static a(Landroid/support/v4/app/FragmentActivity;Landroid/os/Bundle;)V
    .locals 3
    .param p0    # Landroid/support/v4/app/FragmentActivity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-nez p1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zznv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zznv;-><init>()V

    invoke-virtual {p0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_0
    return-void
.end method


# virtual methods
.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zznv;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zznv;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/c;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zznv;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zznv;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/app/Activity;)V

    return-void
.end method
