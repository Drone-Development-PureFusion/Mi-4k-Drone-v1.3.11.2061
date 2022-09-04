.class final Lcom/google/android/gms/internal/iq$2;
.super Lcom/google/android/gms/internal/kw$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/lh;Ljava/util/Map;)Lcom/google/android/gms/internal/lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/google/android/gms/internal/ir;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/google/android/gms/internal/ir;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iq$2;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/android/gms/internal/iq$2;->b:Lcom/google/android/gms/internal/ir;

    invoke-direct {p0}, Lcom/google/android/gms/internal/kw$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/iq$2;->a:Ljava/util/Map;

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/lh;Ljava/util/Map;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-eq v0, p2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/iq$2;->b:Lcom/google/android/gms/internal/ir;

    new-instance v2, Lcom/google/android/gms/internal/ij;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ir;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    :cond_0
    return-void
.end method
