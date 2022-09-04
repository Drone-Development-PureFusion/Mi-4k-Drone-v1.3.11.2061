.class public Lcom/google/android/gms/fitness/data/DataUpdateNotification;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/data/DataUpdateNotification;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Ljava/lang/String; = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION"

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:Ljava/lang/String; = "vnd.google.fitness.data_udpate_notification"


# instance fields
.field final f:I

.field private final g:J

.field private final h:J

.field private final i:I

.field private final j:Lcom/google/android/gms/fitness/data/DataSource;

.field private final k:Lcom/google/android/gms/fitness/data/DataType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/q;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJILcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->f:I

    iput-wide p2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->g:J

    iput-wide p4, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->h:J

    iput p6, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->i:I

    iput-object p7, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->j:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p8, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->k:Lcom/google/android/gms/fitness/data/DataType;

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/google/android/gms/fitness/data/DataUpdateNotification;
    .locals 2

    const-string v0, "vnd.google.fitness.data_udpate_notification"

    sget-object v1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/fitness/data/DataUpdateNotification;)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->g:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->g:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->h:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->h:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->i:I

    iget v1, p1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->i:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->j:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->j:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->k:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->k:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->g:J

    return-wide v0
.end method

.method public a(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->g:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->h:J

    return-wide v0
.end method

.method public b(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->h:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->i:I

    return v0
.end method

.method public d()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->j:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->k:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataUpdateNotification;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->a(Lcom/google/android/gms/fitness/data/DataUpdateNotification;)Z

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
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->j:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->k:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "updateStartTimeNanos"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "updateEndTimeNanos"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "operationType"

    iget v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataSource"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->j:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataType"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataUpdateNotification;->k:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/q;->a(Lcom/google/android/gms/fitness/data/DataUpdateNotification;Landroid/os/Parcel;I)V

    return-void
.end method
