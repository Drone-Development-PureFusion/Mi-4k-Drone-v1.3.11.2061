.class Lcom/google/android/gms/internal/aau$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aau;->a(Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/un;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/abi$a;

.field final synthetic b:Lcom/google/android/gms/internal/aau;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aau;Lcom/google/android/gms/internal/abi$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aau$2;->b:Lcom/google/android/gms/internal/aau;

    iput-object p2, p0, Lcom/google/android/gms/internal/aau$2;->a:Lcom/google/android/gms/internal/abi$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    const/4 v2, 0x0

    iget-object v9, p0, Lcom/google/android/gms/internal/aau$2;->b:Lcom/google/android/gms/internal/aau;

    new-instance v0, Lcom/google/android/gms/internal/abi;

    iget-object v1, p0, Lcom/google/android/gms/internal/aau$2;->a:Lcom/google/android/gms/internal/abi$a;

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    move-object v8, v2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/abi;-><init>(Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/internal/xg;Lcom/google/android/gms/internal/xr;Ljava/lang/String;Lcom/google/android/gms/internal/xj;Lcom/google/android/gms/ads/internal/formats/i$a;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/aau;->b(Lcom/google/android/gms/internal/abi;)V

    return-void
.end method
