.class Lcom/google/android/gms/internal/acz$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/acz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/acy;

.field private b:Lcom/google/android/gms/ads/internal/overlay/g;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/ads/internal/overlay/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/acz$d;->a:Lcom/google/android/gms/internal/acy;

    iput-object p2, p0, Lcom/google/android/gms/internal/acz$d;->b:Lcom/google/android/gms/ads/internal/overlay/g;

    return-void
.end method


# virtual methods
.method public g()V
    .locals 0

    return-void
.end method

.method public i_()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$d;->b:Lcom/google/android/gms/ads/internal/overlay/g;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/g;->i_()V

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$d;->a:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->c()V

    return-void
.end method

.method public j_()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$d;->b:Lcom/google/android/gms/ads/internal/overlay/g;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/g;->j_()V

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$d;->a:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->d()V

    return-void
.end method

.method public k_()V
    .locals 0

    return-void
.end method
