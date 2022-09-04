.class Lcom/google/android/gms/internal/zu$4;
.super Lcom/google/android/gms/internal/zt$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zu;->a(Lcom/google/android/gms/ads/internal/formats/i$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/vt;

.field final synthetic b:Lcom/google/android/gms/internal/zu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zu;Lcom/google/android/gms/internal/vt;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zu$4;->b:Lcom/google/android/gms/internal/zu;

    iput-object p2, p0, Lcom/google/android/gms/internal/zu$4;->a:Lcom/google/android/gms/internal/vt;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zt$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wy;)V
    .locals 2

    const-string v0, "/nativeAdCustomClick"

    iget-object v1, p0, Lcom/google/android/gms/internal/zu$4;->a:Lcom/google/android/gms/internal/vt;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/wy;->a(Ljava/lang/String;Lcom/google/android/gms/internal/vt;)V

    return-void
.end method
