.class public final Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/wearable/internal/ChannelImpl;

.field final c:I

.field final d:I

.field final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/bf;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/bf;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/wearable/internal/ChannelImpl;III)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->a:I

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->b:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iput p3, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->c:I

    iput p4, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->d:I

    iput p5, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->e:I

    return-void
.end method

.method private static a(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "CHANNEL_OPENED"

    goto :goto_0

    :pswitch_1
    const-string v0, "CHANNEL_CLOSED"

    goto :goto_0

    :pswitch_2
    const-string v0, "OUTPUT_CLOSED"

    goto :goto_0

    :pswitch_3
    const-string v0, "INPUT_CLOSED"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private static b(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "CLOSE_REASON_DISCONNECTED"

    goto :goto_0

    :pswitch_1
    const-string v0, "CLOSE_REASON_REMOTE_CLOSE"

    goto :goto_0

    :pswitch_2
    const-string v0, "CLOSE_REASON_LOCAL_CLOSE"

    goto :goto_0

    :pswitch_3
    const-string v0, "CLOSE_REASON_NORMAL"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/c$a;)V
    .locals 4

    iget v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->c:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "ChannelEventParcelable"

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->c:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->b:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-interface {p1, v0}, Lcom/google/android/gms/wearable/c$a;->a(Lcom/google/android/gms/wearable/Channel;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->b:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->d:I

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->e:I

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/wearable/c$a;->a(Lcom/google/android/gms/wearable/Channel;II)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->b:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->d:I

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->e:I

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/wearable/c$a;->b(Lcom/google/android/gms/wearable/Channel;II)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->b:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    iget v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->d:I

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->e:I

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/wearable/c$a;->c(Lcom/google/android/gms/wearable/Channel;II)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->a:I

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->b:Lcom/google/android/gms/wearable/internal/ChannelImpl;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->c:I

    invoke-static {v2}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->d:I

    invoke-static {v3}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->e:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x68

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "ChannelEventParcelable[versionCode="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", channel="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", closeReason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appErrorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bf;->a(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;Landroid/os/Parcel;I)V

    return-void
.end method
