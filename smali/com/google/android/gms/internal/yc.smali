.class public final Lcom/google/android/gms/internal/yc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/mediation/l;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final d:Ljava/util/Date;

.field private final e:I

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Z

.field private final h:Landroid/location/Location;

.field private final i:I

.field private final j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Z


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZILcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;Ljava/util/List;Z)V
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/location/Location;",
            "ZI",
            "Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/yc;->d:Ljava/util/Date;

    iput p2, p0, Lcom/google/android/gms/internal/yc;->e:I

    iput-object p3, p0, Lcom/google/android/gms/internal/yc;->f:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/internal/yc;->h:Landroid/location/Location;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/yc;->g:Z

    iput p6, p0, Lcom/google/android/gms/internal/yc;->i:I

    iput-object p7, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iput-object p8, p0, Lcom/google/android/gms/internal/yc;->k:Ljava/util/List;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/yc;->l:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->d:Ljava/util/Date;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/yc;->e:I

    return v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->f:Ljava/util/Set;

    return-object v0
.end method

.method public d()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->h:Landroid/location/Location;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/yc;->i:I

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/yc;->g:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/yc;->l:Z

    return v0
.end method

.method public h()Lcom/google/android/gms/ads/formats/b;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/ads/formats/b$b;

    invoke-direct {v0}, Lcom/google/android/gms/ads/formats/b$b;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->b:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/b$b;->a(Z)Lcom/google/android/gms/ads/formats/b$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->c:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/b$b;->a(I)Lcom/google/android/gms/ads/formats/b$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->d:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/b$b;->b(Z)Lcom/google/android/gms/ads/formats/b$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->a:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->e:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/b$b;->b(I)Lcom/google/android/gms/ads/formats/b$b;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->a:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->f:Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/google/android/gms/ads/i$a;

    invoke-direct {v1}, Lcom/google/android/gms/ads/i$a;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/yc;->j:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;->f:Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;

    iget-boolean v2, v2, Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;->b:Z

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/i$a;->a(Z)Lcom/google/android/gms/ads/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/ads/i$a;->a()Lcom/google/android/gms/ads/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/formats/b$b;->a(Lcom/google/android/gms/ads/i;)Lcom/google/android/gms/ads/formats/b$b;

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/b$b;->a()Lcom/google/android/gms/ads/formats/b;

    move-result-object v0

    goto :goto_0
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->k:Ljava/util/List;

    const-string v1, "2"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/yc;->k:Ljava/util/List;

    const-string v1, "1"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
