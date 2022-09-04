.class public Lcom/google/android/gms/internal/abc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/xr;

.field private final b:Lcom/google/android/gms/internal/aaz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/xr;Lcom/google/android/gms/internal/aay;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/abc;->a:Lcom/google/android/gms/internal/xr;

    new-instance v0, Lcom/google/android/gms/internal/aaz;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/aaz;-><init>(Lcom/google/android/gms/internal/aay;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/abc;->b:Lcom/google/android/gms/internal/aaz;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/xr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/abc;->a:Lcom/google/android/gms/internal/xr;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/aaz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/abc;->b:Lcom/google/android/gms/internal/aaz;

    return-object v0
.end method
