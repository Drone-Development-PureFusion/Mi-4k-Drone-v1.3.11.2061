.class public Lcom/google/android/gms/drive/internal/OnEventResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/OnEventResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:I

.field final c:Lcom/google/android/gms/drive/events/ChangeEvent;

.field final d:Lcom/google/android/gms/drive/events/CompletionEvent;

.field final e:Lcom/google/android/gms/drive/events/QueryResultEventParcelable;

.field final f:Lcom/google/android/gms/drive/events/ChangesAvailableEvent;

.field final g:Lcom/google/android/gms/drive/events/TransferStateEvent;

.field final h:Lcom/google/android/gms/drive/events/TransferProgressEvent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/y;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/y;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/OnEventResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/drive/events/ChangeEvent;Lcom/google/android/gms/drive/events/CompletionEvent;Lcom/google/android/gms/drive/events/QueryResultEventParcelable;Lcom/google/android/gms/drive/events/ChangesAvailableEvent;Lcom/google/android/gms/drive/events/TransferStateEvent;Lcom/google/android/gms/drive/events/TransferProgressEvent;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->a:I

    iput p2, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->b:I

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->c:Lcom/google/android/gms/drive/events/ChangeEvent;

    iput-object p4, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->d:Lcom/google/android/gms/drive/events/CompletionEvent;

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->e:Lcom/google/android/gms/drive/events/QueryResultEventParcelable;

    iput-object p6, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->f:Lcom/google/android/gms/drive/events/ChangesAvailableEvent;

    iput-object p7, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->g:Lcom/google/android/gms/drive/events/TransferStateEvent;

    iput-object p8, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->h:Lcom/google/android/gms/drive/events/TransferProgressEvent;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/drive/events/DriveEvent;
    .locals 4

    iget v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->b:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x21

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected event type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->c:Lcom/google/android/gms/drive/events/ChangeEvent;

    :goto_0
    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->d:Lcom/google/android/gms/drive/events/CompletionEvent;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->e:Lcom/google/android/gms/drive/events/QueryResultEventParcelable;

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->f:Lcom/google/android/gms/drive/events/ChangesAvailableEvent;

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->g:Lcom/google/android/gms/drive/events/TransferStateEvent;

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->h:Lcom/google/android/gms/drive/events/TransferProgressEvent;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/y;->a(Lcom/google/android/gms/drive/internal/OnEventResponse;Landroid/os/Parcel;I)V

    return-void
.end method
