.class public Lcom/google/android/gms/fitness/data/Subscription;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/data/Subscription$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/data/Subscription;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/fitness/data/DataSource;

.field private final c:Lcom/google/android/gms/fitness/data/DataType;

.field private final d:J

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/e;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/e;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/Subscription;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;JI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/data/Subscription;->a:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p3, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    iput-wide p4, p0, Lcom/google/android/gms/fitness/data/Subscription;->d:J

    iput p6, p0, Lcom/google/android/gms/fitness/data/Subscription;->e:I

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/data/Subscription$a;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->a:I

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Subscription$a;->a(Lcom/google/android/gms/fitness/data/Subscription$a;)Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Subscription$a;->b(Lcom/google/android/gms/fitness/data/Subscription$a;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Subscription$a;->c(Lcom/google/android/gms/fitness/data/Subscription$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->d:J

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Subscription$a;->d(Lcom/google/android/gms/fitness/data/Subscription$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->e:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/data/Subscription$a;Lcom/google/android/gms/fitness/data/Subscription$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Subscription;-><init>(Lcom/google/android/gms/fitness/data/Subscription$a;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/data/Subscription;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v1, p1, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->d:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Subscription;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->e:I

    iget v1, p1, Lcom/google/android/gms/fitness/data/Subscription;->e:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->e:I

    return v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->d:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 4

    const-string v1, "Subscription{%s}"

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->j()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/data/Subscription;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/data/Subscription;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Subscription;->a(Lcom/google/android/gms/fitness/data/Subscription;)Z

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

.method public f()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->a()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    goto :goto_0
.end method

.method g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

    const-string v1, "dataSource"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->b:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataType"

    iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->c:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "samplingIntervalMicros"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "accuracyMode"

    iget v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->e:I

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

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/e;->a(Lcom/google/android/gms/fitness/data/Subscription;Landroid/os/Parcel;I)V

    return-void
.end method
