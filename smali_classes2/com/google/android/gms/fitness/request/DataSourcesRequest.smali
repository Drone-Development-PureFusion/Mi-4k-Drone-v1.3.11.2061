.class public Lcom/google/android/gms/fitness/request/DataSourcesRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataSourcesRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z

.field private final e:Lcom/google/android/gms/internal/aky;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/v;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/v;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/List;Ljava/util/List;ZLandroid/os/IBinder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Landroid/os/IBinder;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->c:Ljava/util/List;

    iput-boolean p4, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->d:Z

    invoke-static {p5}, Lcom/google/android/gms/internal/aky$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/aky;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->e:Lcom/google/android/gms/internal/aky;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;->a(Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;)[Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/util/b;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;->b(Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;)[I

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/util/b;->a([I)[Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;->c(Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;)Z

    move-result v2

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/aky;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;Lcom/google/android/gms/fitness/request/DataSourcesRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataSourcesRequest;Lcom/google/android/gms/internal/aky;)V
    .locals 3

    iget-object v0, p1, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->b:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->c:Ljava/util/List;

    iget-boolean v2, p1, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->d:Z

    invoke-direct {p0, v0, v1, v2, p2}, Lcom/google/android/gms/fitness/request/DataSourcesRequest;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/aky;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/aky;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Lcom/google/android/gms/internal/aky;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->b:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->c:Ljava/util/List;

    iput-boolean p3, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->d:Z

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->e:Lcom/google/android/gms/internal/aky;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->c:Ljava/util/List;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->d:Z

    return v0
.end method

.method public d()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->e:Lcom/google/android/gms/internal/aky;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->e:Lcom/google/android/gms/internal/aky;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aky;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->b:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "sourceTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->d:Z

    if-eqz v1, :cond_0

    const-string v1, "includeDbOnlySources"

    const-string v2, "true"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/v;->a(Lcom/google/android/gms/fitness/request/DataSourcesRequest;Landroid/os/Parcel;I)V

    return-void
.end method
