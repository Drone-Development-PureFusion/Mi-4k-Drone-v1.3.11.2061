.class public Lcom/google/android/gms/internal/aij;
.super Ljava/lang/Object;


# instance fields
.field protected final d:Lcom/google/android/gms/internal/aik;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/aik;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aij;->d:Lcom/google/android/gms/internal/aik;

    return-void
.end method

.method protected static b(Landroid/app/Activity;)Lcom/google/android/gms/internal/aik;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/aih;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aih;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/aij;->b(Lcom/google/android/gms/internal/aih;)Lcom/google/android/gms/internal/aik;

    move-result-object v0

    return-object v0
.end method

.method protected static b(Lcom/google/android/gms/internal/aih;)Lcom/google/android/gms/internal/aik;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aih;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aih;->c()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzrn;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/google/android/gms/internal/zzrn;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/aih;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzrc;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/zzrc;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    return-void
.end method

.method public a(IILandroid/content/Intent;)V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    return-void
.end method

.method public b()V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    return-void
.end method

.method public e()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aij;->d:Lcom/google/android/gms/internal/aik;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aik;->a()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 0
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    return-void
.end method
