.class final Lcom/google/android/gms/internal/dk$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/dj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([B)Lcom/google/android/gms/internal/dm;
    .locals 6

    if-nez p1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/de;

    const-string v1, "Cannot parse a null byte[]"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/de;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/de;

    const-string v1, "Cannot parse a 0 length byte[]"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/de;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    invoke-static {v0}, Lcom/google/android/gms/internal/dg;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/dv;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "The container was successfully parsed from the resource"

    invoke-static {v1}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/internal/de; {:try_start_0 .. :try_end_0} :catch_1

    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/dk;->b:Lcom/google/android/gms/internal/dj;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/dj;->a([B)Lcom/google/android/gms/internal/dm;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/dm;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    const/4 v4, 0x0

    new-instance v5, Lcom/google/android/gms/internal/dm$a;

    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/dm$a;-><init>(Lcom/google/android/gms/internal/dv;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dm;->c()Lcom/google/android/gms/internal/dy;

    move-result-object v0

    invoke-direct {v2, v3, v4, v5, v0}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/common/api/Status;ILcom/google/android/gms/internal/dm$a;Lcom/google/android/gms/internal/dy;)V

    return-object v2

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/de;

    const-string v1, "The resource data is corrupted. The container cannot be extracted from the JSON data"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/de;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/de;

    const-string v1, "The resource data is invalid. The container cannot be extracted from the JSON data"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/de;-><init>(Ljava/lang/String;)V

    throw v0
.end method
