.class Lcom/google/android/gms/fitness/service/FitnessSensorService$a;
.super Lcom/google/android/gms/fitness/internal/service/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/service/FitnessSensorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/fitness/service/FitnessSensorService;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/fitness/service/FitnessSensorService;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/fitness/internal/service/c$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->a:Lcom/google/android/gms/fitness/service/FitnessSensorService;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/service/FitnessSensorService;Lcom/google/android/gms/fitness/service/FitnessSensorService$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;-><init>(Lcom/google/android/gms/fitness/service/FitnessSensorService;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/fitness/internal/service/FitnessDataSourcesRequest;Lcom/google/android/gms/internal/aky;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->a:Lcom/google/android/gms/fitness/service/FitnessSensorService;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->a:Lcom/google/android/gms/fitness/service/FitnessSensorService;

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/internal/service/FitnessDataSourcesRequest;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/fitness/result/DataSourcesResult;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/fitness/result/DataSourcesResult;-><init>(Ljava/util/List;Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/aky;->a(Lcom/google/android/gms/fitness/result/DataSourcesResult;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/fitness/internal/service/FitnessUnregistrationRequest;Lcom/google/android/gms/internal/alq;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->a:Lcom/google/android/gms/fitness/service/FitnessSensorService;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->a:Lcom/google/android/gms/fitness/service/FitnessSensorService;

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/internal/service/FitnessUnregistrationRequest;->a()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->a(Lcom/google/android/gms/fitness/data/DataSource;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/alq;->a(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/alq;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;Lcom/google/android/gms/internal/alq;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->a:Lcom/google/android/gms/fitness/service/FitnessSensorService;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->a()V

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorService$a;->a:Lcom/google/android/gms/fitness/service/FitnessSensorService;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/service/FitnessSensorService;->a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/alq;->a(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/alq;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method
