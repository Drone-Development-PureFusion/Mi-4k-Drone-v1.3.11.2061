.class public Lcom/google/android/gms/ads/internal/formats/c;
.super Lcom/google/android/gms/internal/uu$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Landroid/graphics/drawable/Drawable;

.field private final b:Landroid/net/Uri;

.field private final c:D


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/uu$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/formats/c;->a:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/formats/c;->b:Landroid/net/Uri;

    iput-wide p3, p0, Lcom/google/android/gms/ads/internal/formats/c;->c:D

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/c/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/c;->a:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/formats/c;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/ads/internal/formats/c;->c:D

    return-wide v0
.end method
