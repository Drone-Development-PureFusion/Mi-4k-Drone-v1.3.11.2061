.class public Lcom/google/android/gms/fitness/request/StartBleScanRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/StartBleScanRequest;",
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

.field private final c:Lcom/google/android/gms/fitness/request/ag;

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/alq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/k;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/List;Landroid/os/IBinder;ILandroid/os/IBinder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Landroid/os/IBinder;",
            "I",
            "Landroid/os/IBinder;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->b:Ljava/util/List;

    invoke-static {p3}, Lcom/google/android/gms/fitness/request/ag$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/fitness/request/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->c:Lcom/google/android/gms/fitness/request/ag;

    iput p4, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->d:I

    invoke-static {p5}, Lcom/google/android/gms/internal/alq$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->e:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;->a(Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;)[Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/util/b;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;->b(Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;)Lcom/google/android/gms/fitness/request/ag;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;->c(Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;)I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/fitness/request/StartBleScanRequest;-><init>(Ljava/util/List;Lcom/google/android/gms/fitness/request/ag;ILcom/google/android/gms/internal/alq;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;Lcom/google/android/gms/fitness/request/StartBleScanRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/StartBleScanRequest;-><init>(Lcom/google/android/gms/fitness/request/StartBleScanRequest$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/StartBleScanRequest;Lcom/google/android/gms/internal/alq;)V
    .locals 3

    iget-object v0, p1, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->b:Ljava/util/List;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->c:Lcom/google/android/gms/fitness/request/ag;

    iget v2, p1, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->d:I

    invoke-direct {p0, v0, v1, v2, p2}, Lcom/google/android/gms/fitness/request/StartBleScanRequest;-><init>(Ljava/util/List;Lcom/google/android/gms/fitness/request/ag;ILcom/google/android/gms/internal/alq;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/google/android/gms/fitness/request/ag;ILcom/google/android/gms/internal/alq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;",
            "Lcom/google/android/gms/fitness/request/ag;",
            "I",
            "Lcom/google/android/gms/internal/alq;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->b:Ljava/util/List;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->c:Lcom/google/android/gms/fitness/request/ag;

    iput p3, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->d:I

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->e:Lcom/google/android/gms/internal/alq;

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

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->b:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->d:I

    return v0
.end method

.method public c()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->c:Lcom/google/android/gms/fitness/request/ag;

    invoke-interface {v0}, Lcom/google/android/gms/fitness/request/ag;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->e:Lcom/google/android/gms/internal/alq;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->e:Lcom/google/android/gms/internal/alq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataTypes"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->b:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "timeoutSecs"

    iget v2, p0, Lcom/google/android/gms/fitness/request/StartBleScanRequest;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/k;->a(Lcom/google/android/gms/fitness/request/StartBleScanRequest;Landroid/os/Parcel;I)V

    return-void
.end method
