.class public Lcom/google/android/gms/internal/vm;
.super Lcom/google/android/gms/internal/vh$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/formats/e$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/e$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/vh$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/vm;->a:Lcom/google/android/gms/ads/formats/e$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/vd;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/vm;->a:Lcom/google/android/gms/ads/formats/e$a;

    new-instance v1, Lcom/google/android/gms/internal/ve;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ve;-><init>(Lcom/google/android/gms/internal/vd;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/ads/formats/e$a;->a(Lcom/google/android/gms/ads/formats/e;Ljava/lang/String;)V

    return-void
.end method
