.class public Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;
.super Lcom/google/android/gms/awareness/fence/FenceState;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final d:I

.field private final e:I

.field private final f:J

.field private final g:Ljava/lang/String;

.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/i;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIJLjava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/awareness/fence/FenceState;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->d:I

    iput p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->e:I

    iput-wide p3, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->f:J

    iput-object p5, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->g:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->h:I

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;I)V
    .locals 8

    const/4 v2, 0x1

    move-object v1, p0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;-><init>(IIJLjava/lang/String;I)V

    return-void
.end method

.method public static a(ILjava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    packed-switch p0, :pswitch_data_0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2b

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid fence evaluation state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/sw;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    :pswitch_0
    return v0

    :pswitch_1
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static b(Landroid/content/Intent;)Lcom/google/android/gms/awareness/fence/FenceState;
    .locals 7

    const/4 v6, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;

    const-string v1, "context_fence_current_state"

    invoke-virtual {p0, v1, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "FenceState"

    invoke-static {v1, v2}, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->a(ILjava/lang/String;)I

    move-result v1

    const-string v2, "context_fence_last_updated_time"

    const-wide/16 v4, 0x0

    invoke-virtual {p0, v2, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    const-string v4, "context_fence_key"

    invoke-virtual {p0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "context_fence_previous_state"

    invoke-virtual {p0, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    const-string v6, "FenceState"

    invoke-static {v5, v6}, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->a(ILjava/lang/String;)I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;-><init>(IJLjava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->e:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->h:I

    return v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->f:J

    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->g:Ljava/lang/String;

    return-object v0
.end method

.method e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;->d:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/i;->a(Lcom/google/android/gms/contextmanager/fence/internal/FenceStateImpl;Landroid/os/Parcel;I)V

    return-void
.end method
