.class Lcom/google/android/gms/internal/tl$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acr$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/tl;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/tm;Lcom/google/android/gms/internal/wx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/acr$c",
        "<",
        "Lcom/google/android/gms/internal/wy;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/tl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/tl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/tl$3;->a:Lcom/google/android/gms/internal/tl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wy;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/tl$3;->a:Lcom/google/android/gms/internal/tl;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/tl;->a(Lcom/google/android/gms/internal/tl;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/tl$3;->a:Lcom/google/android/gms/internal/tl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/tl;->a(Lcom/google/android/gms/internal/wy;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tl$3;->a:Lcom/google/android/gms/internal/tl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tl;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/tl$3;->a:Lcom/google/android/gms/internal/tl;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tl;->a(I)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/wy;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/tl$3;->a(Lcom/google/android/gms/internal/wy;)V

    return-void
.end method
