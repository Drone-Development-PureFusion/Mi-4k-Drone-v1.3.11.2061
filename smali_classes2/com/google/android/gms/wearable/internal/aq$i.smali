.class final Lcom/google/android/gms/wearable/internal/aq$i;
.super Lcom/google/android/gms/wearable/internal/aq$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/internal/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/aq$b",
        "<",
        "Lcom/google/android/gms/wearable/Channel$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/wearable/internal/bl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/internal/bl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/wearable/Channel$b;",
            ">;",
            "Lcom/google/android/gms/wearable/internal/bl;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/aq$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/bl;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/aq$i;->a:Lcom/google/android/gms/wearable/internal/bl;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/internal/GetChannelOutputStreamResponse;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p1, Lcom/google/android/gms/wearable/internal/GetChannelOutputStreamResponse;->c:Landroid/os/ParcelFileDescriptor;

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/wearable/internal/bi;

    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/GetChannelOutputStreamResponse;->c:Landroid/os/ParcelFileDescriptor;

    invoke-direct {v1, v2}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/wearable/internal/bi;-><init>(Ljava/io/OutputStream;)V

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/aq$i;->a:Lcom/google/android/gms/wearable/internal/bl;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/internal/bi;->a()Lcom/google/android/gms/wearable/internal/bm;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/wearable/internal/bl;->a(Lcom/google/android/gms/wearable/internal/bm;)V

    :cond_0
    new-instance v1, Lcom/google/android/gms/wearable/internal/ChannelImpl$b;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    iget v3, p1, Lcom/google/android/gms/wearable/internal/GetChannelOutputStreamResponse;->b:I

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/wearable/internal/ChannelImpl$b;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/io/OutputStream;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/wearable/internal/aq$i;->a(Ljava/lang/Object;)V

    return-void
.end method
