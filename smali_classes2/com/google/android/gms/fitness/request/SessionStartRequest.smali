.class public Lcom/google/android/gms/fitness/request/SessionStartRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/SessionStartRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/fitness/data/Session;

.field private final c:Lcom/google/android/gms/internal/alq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/h;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/Session;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->b:Lcom/google/android/gms/fitness/data/Session;

    invoke-static {p3}, Lcom/google/android/gms/internal/alq$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->c:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/data/Session;Lcom/google/android/gms/internal/alq;)V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/fitness/data/Session;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot start a session in the future"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/Session;->b()Z

    move-result v0

    const-string v1, "Cannot start a session which has already ended"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->b:Lcom/google/android/gms/fitness/data/Session;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->c:Lcom/google/android/gms/internal/alq;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/fitness/request/SessionStartRequest;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->b:Lcom/google/android/gms/fitness/data/Session;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionStartRequest;->b:Lcom/google/android/gms/fitness/data/Session;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/fitness/data/Session;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->b:Lcom/google/android/gms/fitness/data/Session;

    return-object v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->c:Lcom/google/android/gms/internal/alq;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->c:Lcom/google/android/gms/internal/alq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/SessionStartRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/SessionStartRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionStartRequest;->a(Lcom/google/android/gms/fitness/request/SessionStartRequest;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->b:Lcom/google/android/gms/fitness/data/Session;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "session"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionStartRequest;->b:Lcom/google/android/gms/fitness/data/Session;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/h;->a(Lcom/google/android/gms/fitness/request/SessionStartRequest;Landroid/os/Parcel;I)V

    return-void
.end method
