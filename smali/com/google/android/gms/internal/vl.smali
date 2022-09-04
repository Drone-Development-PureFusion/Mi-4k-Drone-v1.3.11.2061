.class public Lcom/google/android/gms/internal/vl;
.super Lcom/google/android/gms/internal/vg$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/formats/d$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/d$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/vg$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/vl;->a:Lcom/google/android/gms/ads/formats/d$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/vb;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/vl;->a:Lcom/google/android/gms/ads/formats/d$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vl;->b(Lcom/google/android/gms/internal/vb;)Lcom/google/android/gms/internal/vc;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/formats/d$a;->a(Lcom/google/android/gms/ads/formats/d;)V

    return-void
.end method

.method b(Lcom/google/android/gms/internal/vb;)Lcom/google/android/gms/internal/vc;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/vc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/vc;-><init>(Lcom/google/android/gms/internal/vb;)V

    return-object v0
.end method
