.class Lcom/google/android/gms/internal/wr$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/wr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Lcom/google/android/gms/ads/internal/l;

.field b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field c:Lcom/google/android/gms/internal/wn;

.field d:J

.field e:Z

.field f:Z

.field final synthetic g:Lcom/google/android/gms/internal/wr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wr;Lcom/google/android/gms/internal/wm;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/wr$a;->g:Lcom/google/android/gms/internal/wr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/wr;->a(Lcom/google/android/gms/internal/wr;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/wm;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/wr$a;->a:Lcom/google/android/gms/ads/internal/l;

    new-instance v0, Lcom/google/android/gms/internal/wn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wn;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/wr$a;->c:Lcom/google/android/gms/internal/wn;

    iget-object v0, p0, Lcom/google/android/gms/internal/wr$a;->c:Lcom/google/android/gms/internal/wn;

    iget-object v1, p0, Lcom/google/android/gms/internal/wr$a;->a:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/ads/internal/l;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/wr;Lcom/google/android/gms/internal/wm;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/wr$a;-><init>(Lcom/google/android/gms/internal/wr;Lcom/google/android/gms/internal/wm;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/wr$a;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/wr$a;->e:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wr$a;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/wr$a;->b:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/wp;->b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/wr$a;->a:Lcom/google/android/gms/ads/internal/l;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/wr$a;->f:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/wr$a;->e:Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->k()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/wr$a;->d:J

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/wr$a;->g:Lcom/google/android/gms/internal/wr;

    invoke-static {v0}, Lcom/google/android/gms/internal/wr;->b(Lcom/google/android/gms/internal/wr;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object v0

    goto :goto_1
.end method
