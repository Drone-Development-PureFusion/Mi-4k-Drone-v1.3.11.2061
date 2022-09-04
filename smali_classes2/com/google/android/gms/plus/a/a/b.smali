.class public final Lcom/google/android/gms/plus/a/a/b;
.super Lcom/google/android/gms/common/data/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/a",
        "<",
        "Lcom/google/android/gms/plus/a/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/common/data/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/data/k",
            "<",
            "Lcom/google/android/gms/plus/internal/model/people/PersonEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->f()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->f()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.google.android.gms.plus.IsSafeParcelable"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/data/k;

    sget-object v1, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->CREATOR:Lcom/google/android/gms/plus/internal/model/people/a;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/data/k;-><init>(Lcom/google/android/gms/common/data/DataHolder;Landroid/os/Parcelable$Creator;)V

    iput-object v0, p0, Lcom/google/android/gms/plus/a/a/b;->b:Lcom/google/android/gms/common/data/k;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/plus/a/a/b;->b:Lcom/google/android/gms/common/data/k;

    goto :goto_0
.end method


# virtual methods
.method public synthetic a(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/a/a/b;->b(I)Lcom/google/android/gms/plus/a/a/a;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/plus/a/a/a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/a/a/b;->b:Lcom/google/android/gms/common/data/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/plus/a/a/b;->b:Lcom/google/android/gms/common/data/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/data/k;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    check-cast v0, Lcom/google/android/gms/plus/a/a/a;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/plus/internal/model/people/k;

    iget-object v1, p0, Lcom/google/android/gms/plus/a/a/b;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/plus/internal/model/people/k;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    goto :goto_0
.end method
