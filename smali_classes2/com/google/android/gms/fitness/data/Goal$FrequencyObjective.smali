.class public Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/Goal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FrequencyObjective"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/u;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/u;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->a:I

    iput p2, p0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->b:I

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;)Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->b:I

    iget v1, p1, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->b:I

    return v0
.end method

.method b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->a(Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;)Z

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

    iget v2, p0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "frequency"

    iget v2, p0, Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;->b:I

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

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/u;->a(Lcom/google/android/gms/fitness/data/Goal$FrequencyObjective;Landroid/os/Parcel;I)V

    return-void
.end method
