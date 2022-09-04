.class public Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;


# instance fields
.field final b:I

.field final c:[B

.field private final d:I

.field private final e:Lcom/google/android/gms/nearby/messages/c;

.field private final f:Lcom/google/android/gms/nearby/messages/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/devices/c;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/devices/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->a:Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-direct {p0, v1, v1, v0}, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;-><init>(II[B)V

    return-void
.end method

.method constructor <init>(II[B)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->b:I

    iput p2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->d:I

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->c:[B

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    new-instance v0, Lcom/google/android/gms/nearby/messages/c;

    invoke-direct {v0, p3}, Lcom/google/android/gms/nearby/messages/c;-><init>([B)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->e:Lcom/google/android/gms/nearby/messages/c;

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    new-instance v1, Lcom/google/android/gms/nearby/messages/d;

    invoke-direct {v1, p3}, Lcom/google/android/gms/nearby/messages/d;-><init>([B)V

    :cond_0
    iput-object v1, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->f:Lcom/google/android/gms/nearby/messages/d;

    return-void

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->d:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;

    iget v2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->c:[B

    iget-object v3, p1, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->c:[B

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->c:[B

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NearbyDeviceId{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->d:I

    packed-switch v1, :pswitch_data_0

    :goto_0
    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v1, "eddystoneUid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->e:Lcom/google/android/gms/nearby/messages/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_1
    const-string v1, "iBeaconId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;->f:Lcom/google/android/gms/nearby/messages/d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_2
    const-string v1, "UNKNOWN"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/devices/c;->a(Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceId;Landroid/os/Parcel;I)V

    return-void
.end method
