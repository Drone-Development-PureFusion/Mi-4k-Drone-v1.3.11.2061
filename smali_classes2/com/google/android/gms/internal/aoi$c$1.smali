.class Lcom/google/android/gms/internal/aoi$c$1;
.super Lcom/google/android/gms/internal/aoi$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aoi$c;->a(Lcom/google/android/gms/internal/aoh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aoi$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aoi$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoi$c$1;->a:Lcom/google/android/gms/internal/aoi$c;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aoi$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/search/GoogleNowAuthState;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aoi$c$1;->a:Lcom/google/android/gms/internal/aoi$c;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoi$c;->a(Lcom/google/android/gms/internal/aoi$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "SearchAuth"

    const-string v1, "GetGoogleNowAuthImpl success"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aoi$c$1;->a:Lcom/google/android/gms/internal/aoi$c;

    new-instance v1, Lcom/google/android/gms/internal/aoi$d;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/aoi$d;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/search/GoogleNowAuthState;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/aoi$c;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
