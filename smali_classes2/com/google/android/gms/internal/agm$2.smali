.class Lcom/google/android/gms/internal/agm$2;
.super Lcom/google/android/gms/internal/agm$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agm;->a(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lorg/json/JSONObject;

.field final synthetic d:Lcom/google/android/gms/internal/agm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agm;ILjava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$2;->d:Lcom/google/android/gms/internal/agm;

    iput p2, p0, Lcom/google/android/gms/internal/agm$2;->a:I

    iput-object p3, p0, Lcom/google/android/gms/internal/agm$2;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/agm$2;->c:Lorg/json/JSONObject;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/agm$a;-><init>(Lcom/google/android/gms/internal/agm;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/agm$2;->a:I

    invoke-static {v0}, Lcom/google/android/gms/internal/agp;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm$2;->c()Lcom/google/android/gms/cast/internal/p;

    move-result-object v0

    const-wide/16 v2, -0x1

    const/16 v1, 0x7d1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lcom/google/android/gms/cast/internal/p;->a(JILjava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/agm;->i()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "sendPlayerRequest for unsupported playerState: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/android/gms/internal/agm$2;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/agm$2;->d:Lcom/google/android/gms/internal/agm;

    iget-object v2, p0, Lcom/google/android/gms/internal/agm$2;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/agm$2;->c:Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm$2;->c()Lcom/google/android/gms/cast/internal/p;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/agm;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/p;)V

    goto :goto_0
.end method
