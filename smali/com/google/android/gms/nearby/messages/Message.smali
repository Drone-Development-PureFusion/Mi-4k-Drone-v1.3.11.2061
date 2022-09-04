.class public Lcom/google/android/gms/nearby/messages/Message;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/Message;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:I = 0x19000

.field public static final b:I = 0x20

.field public static final c:Ljava/lang/String; = "__reserved_namespace"

.field public static final d:Ljava/lang/String; = "__eddystone_uid"

.field public static final e:Ljava/lang/String; = "__i_beacon_id"

.field private static final g:[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;


# instance fields
.field final f:I

.field private final h:[B

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

.field private final l:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/nearby/messages/o;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/Message;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;->a:Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/nearby/messages/Message;->g:[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    return-void
.end method

.method constructor <init>(I[BLjava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;J)V
    .locals 5
    .param p2    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # [Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/Message;->f:I

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->i:Ljava/lang/String;

    if-nez p3, :cond_0

    const-string p3, ""

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/Message;->j:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/nearby/messages/Message;->l:J

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->j:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/Message;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/nearby/messages/Message;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_3

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Content must be null for a device presence message."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    :goto_1
    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/Message;->h:[B

    if-eqz p5, :cond_1

    array-length v0, p5

    if-nez v0, :cond_2

    :cond_1
    sget-object p5, Lcom/google/android/gms/nearby/messages/Message;->g:[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    :cond_2
    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/Message;->k:[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_6

    const/4 v0, 0x1

    :goto_2
    const-string v1, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const/16 v4, 0x20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    :cond_4
    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p2

    const v1, 0x19000

    if-gt v0, v1, :cond_5

    const/4 v0, 0x1

    :goto_3
    const-string v1, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    array-length v4, p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const v4, 0x19000

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public constructor <init>([B)V
    .locals 2

    const-string v0, ""

    const-string v1, ""

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/nearby/messages/Message;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;)V
    .locals 1

    const-string v0, ""

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/nearby/messages/Message;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/messages/Message;->g:[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/nearby/messages/Message;-><init>([BLjava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;)V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;)V
    .locals 8

    const-wide/16 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/nearby/messages/Message;-><init>([BLjava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;J)V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;J)V
    .locals 9

    const/4 v1, 0x2

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/nearby/messages/Message;-><init>(I[BLjava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;J)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "__reserved_namespace"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "__device_presence"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
.method public a()Z
    .locals 2

    const-string v0, "__reserved_namespace"

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/Message;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/Message;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/Message;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->i:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->j:Ljava/lang/String;

    return-object v0
.end method

.method public d()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->h:[B

    return-object v0
.end method

.method public e()[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->k:[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/nearby/messages/Message;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/nearby/messages/Message;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/Message;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/nearby/messages/Message;->j:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/Message;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/nearby/messages/Message;->i:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/Message;->h:[B

    iget-object v3, p1, Lcom/google/android/gms/nearby/messages/Message;->h:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_3

    cmp-long v2, v4, v4

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/Message;->j:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/Message;->i:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/Message;->h:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/Message;->j:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/Message;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->h:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/Message;->e()[Lcom/google/android/gms/nearby/messages/devices/NearbyDevice;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x45

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Message{namespace=\'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "\', type=\'"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\', content=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes], devices="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/Message;->h:[B

    array-length v0, v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/o;->a(Lcom/google/android/gms/nearby/messages/Message;Landroid/os/Parcel;I)V

    return-void
.end method
