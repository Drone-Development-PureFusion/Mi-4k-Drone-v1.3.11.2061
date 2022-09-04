.class Lcom/google/android/gms/ads/internal/f$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acz$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/f;->e(Lcom/google/android/gms/internal/abi;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/abi;

.field final synthetic b:Lcom/google/android/gms/ads/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/f;Lcom/google/android/gms/internal/abi;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/f$3;->b:Lcom/google/android/gms/ads/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/f$3;->a:Lcom/google/android/gms/internal/abi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/f$3;->b:Lcom/google/android/gms/ads/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/f;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/f$3;->b:Lcom/google/android/gms/ads/internal/f;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/f;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/f$3;->a:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ti;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/abi;)Lcom/google/android/gms/internal/tf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/f$3;->a:Lcom/google/android/gms/internal/abi;

    iget-object v1, v1, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tf;->a(Lcom/google/android/gms/internal/tg;)V

    return-void
.end method
