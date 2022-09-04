.class public Lcom/google/android/gms/internal/vn;
.super Lcom/google/android/gms/internal/vi$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/formats/e$b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/e$b;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/vi$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/vn;->a:Lcom/google/android/gms/ads/formats/e$b;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/vd;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/vn;->a:Lcom/google/android/gms/ads/formats/e$b;

    new-instance v1, Lcom/google/android/gms/internal/ve;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ve;-><init>(Lcom/google/android/gms/internal/vd;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/formats/e$b;->a(Lcom/google/android/gms/ads/formats/e;)V

    return-void
.end method
