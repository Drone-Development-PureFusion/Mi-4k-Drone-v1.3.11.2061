.class public Lcom/google/android/gms/fitness/data/Goal$DurationObjective;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/Goal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DurationObjective"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/data/Goal$DurationObjective;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/s;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/s;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->a:I

    iput-wide p2, p0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->b:J

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/data/Goal$DurationObjective;)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->b:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->b:J

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
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->b:J

    return-wide v0
.end method

.method b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->a(Lcom/google/android/gms/fitness/data/Goal$DurationObjective;)Z

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

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "duration"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Goal$DurationObjective;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/s;->a(Lcom/google/android/gms/fitness/data/Goal$DurationObjective;Landroid/os/Parcel;I)V

    return-void
.end method
