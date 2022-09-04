.class public Lcom/google/android/gms/fitness/request/DailyTotalRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DailyTotalRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/internal/akw;

.field private c:Lcom/google/android/gms/fitness/data/DataType;

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/q;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Lcom/google/android/gms/fitness/data/DataType;Z)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/internal/akw$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/akw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->b:Lcom/google/android/gms/internal/akw;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    iput-boolean p4, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->d:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/akw;Lcom/google/android/gms/fitness/data/DataType;Z)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->b:Lcom/google/android/gms/internal/akw;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    iput-boolean p3, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->d:Z

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->a:I

    return v0
.end method

.method public b()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->d:Z

    return v0
.end method

.method public d()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->b:Lcom/google/android/gms/internal/akw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/akw;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v1, "DailyTotalRequest{%s}"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    if-nez v0, :cond_0

    const-string v0, "null"

    :goto_0
    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/q;->a(Lcom/google/android/gms/fitness/request/DailyTotalRequest;Landroid/os/Parcel;I)V

    return-void
.end method
