.class final Lcom/google/android/gms/internal/iq$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/is$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/is;Ljava/util/Map;)Lcom/google/android/gms/internal/is;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/is;

.field final synthetic b:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/is;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iq$1;->a:Lcom/google/android/gms/internal/is;

    iput-object p2, p0, Lcom/google/android/gms/internal/iq$1;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/iq$1;->a:Lcom/google/android/gms/internal/is;

    iget-object v1, p0, Lcom/google/android/gms/internal/iq$1;->b:Ljava/util/Map;

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/lh;Ljava/util/Map;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    return-void
.end method
