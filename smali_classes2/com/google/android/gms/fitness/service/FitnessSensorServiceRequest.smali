.class public Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:I = -0x1


# instance fields
.field private final b:I

.field private final c:Lcom/google/android/gms/fitness/data/DataSource;

.field private final d:Lcom/google/android/gms/fitness/data/y;

.field private final e:J

.field private final f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/service/b;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/service/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;Landroid/os/IBinder;JJ)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->b:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->c:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {p3}, Lcom/google/android/gms/fitness/data/y$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/fitness/data/y;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->d:Lcom/google/android/gms/fitness/data/y;

    iput-wide p4, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->e:J

    iput-wide p6, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->f:J

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->c:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->c:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->e:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->f:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->f:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/TimeUnit;)J
    .locals 4

    const-wide/16 v0, -0x1

    iget-wide v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->e:J

    cmp-long v2, v2, v0

    if-nez v2, :cond_0

    :goto_0
    return-wide v0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->e:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->c:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public b(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->f:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lcom/google/android/gms/fitness/service/a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/fitness/service/c;

    iget-object v1, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->d:Lcom/google/android/gms/fitness/data/y;

    invoke-direct {v0, v1}, Lcom/google/android/gms/fitness/service/c;-><init>(Lcom/google/android/gms/fitness/data/y;)V

    return-object v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->b:I

    return v0
.end method

.method d()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->d:Lcom/google/android/gms/fitness/data/y;

    invoke-interface {v0}, Lcom/google/android/gms/fitness/data/y;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->e:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;)Z

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

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->f:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->c:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "FitnessSensorServiceRequest{%s}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->c:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/service/b;->a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;Landroid/os/Parcel;I)V

    return-void
.end method
