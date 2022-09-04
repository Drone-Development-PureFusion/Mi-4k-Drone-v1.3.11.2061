.class public Lcom/google/android/gms/fitness/data/Goal$Recurrence;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/Goal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Recurrence"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/data/Goal$Recurrence;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/ae;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/ae;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(III)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->a:I

    iput p2, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->b:I

    if-lez p3, :cond_0

    const/4 v0, 0x3

    if-gt p3, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    iput p3, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->c:I

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid unit value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string v0, "day"

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "week"

    goto :goto_0

    :pswitch_2
    const-string v0, "month"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/google/android/gms/fitness/data/Goal$Recurrence;)Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->b:I

    iget v1, p1, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->b:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->c:I

    iget v1, p1, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->c:I

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

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->c:I

    return v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/data/Goal$Recurrence;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/data/Goal$Recurrence;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->a(Lcom/google/android/gms/fitness/data/Goal$Recurrence;)Z

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

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->c:I

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

    const-string v1, "count"

    iget v2, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "unit"

    iget v2, p0, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->c:I

    invoke-static {v2}, Lcom/google/android/gms/fitness/data/Goal$Recurrence;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/ae;->a(Lcom/google/android/gms/fitness/data/Goal$Recurrence;Landroid/os/Parcel;I)V

    return-void
.end method
