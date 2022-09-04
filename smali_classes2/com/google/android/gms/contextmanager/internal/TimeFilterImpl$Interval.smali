.class public Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Interval"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:J

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/r;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/r;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->a:I

    iput-wide p2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->b:J

    iput-wide p4, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->c:J

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->a:I

    return v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->b:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;

    iget-wide v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->b:J

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->b()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->c:J

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->c()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/r;->a(Lcom/google/android/gms/contextmanager/internal/TimeFilterImpl$Interval;Landroid/os/Parcel;I)V

    return-void
.end method
