.class public Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/h;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IID)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->a:I

    iput p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->b:I

    iput-wide p3, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->c:D

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x24

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "unknown plugged in state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "POWER_DISCONNECTED"

    goto :goto_0

    :pswitch_1
    const-string v0, "POWER_CONNECTED_USB"

    goto :goto_0

    :pswitch_2
    const-string v0, "POWER_CONNECTED_AC"

    goto :goto_0

    :pswitch_3
    const-string v0, "POWER_CONNECTED_WIRELESS"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->b:I

    return v0
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->c:D

    return-wide v0
.end method

.method c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->b:I

    invoke-static {v0}, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;->c:D

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x45

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "PowerConnectionState = "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Battery Percentage = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/h;->a(Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;Landroid/os/Parcel;I)V

    return-void
.end method
