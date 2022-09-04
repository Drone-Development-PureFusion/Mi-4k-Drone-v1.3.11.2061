.class Lcom/google/android/gms/internal/aoi$b;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aoi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahl$a",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        "Lcom/google/android/gms/internal/aoh;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Z


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/search/a;->b:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    const-string v0, "SearchAuth"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aoi$b;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/aoi$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aoi$b;->a:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aoi$b;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aoi$b;->c:Z

    return v0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aoi$b;->c:Z

    if-eqz v0, :cond_0

    const-string v1, "SearchAuth"

    const-string v2, "ClearTokenImpl received failure: "

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aoh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aoi$b;->a(Lcom/google/android/gms/internal/aoh;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aoh;)V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aoi$b;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "SearchAuth"

    const-string v1, "ClearTokenImpl started"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/aoi$b$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/aoi$b$1;-><init>(Lcom/google/android/gms/internal/aoi$b;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aoh;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aog;

    iget-object v2, p0, Lcom/google/android/gms/internal/aoi$b;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/aoi$b;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/aog;->b(Lcom/google/android/gms/internal/aof;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aoi$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
