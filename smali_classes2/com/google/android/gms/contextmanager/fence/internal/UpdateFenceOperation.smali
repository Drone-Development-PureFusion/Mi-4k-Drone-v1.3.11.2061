.class public Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

.field private d:Lcom/google/android/gms/contextmanager/fence/internal/m;

.field private final e:Lcom/google/android/gms/awareness/fence/i;

.field private final f:Landroid/app/PendingIntent;

.field private final g:Ljava/lang/String;

.field private final h:J

.field private final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/q;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;Landroid/os/IBinder;Landroid/app/PendingIntent;Ljava/lang/String;JJ)V
    .locals 3

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->a:I

    iput p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->b:I

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->c:Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

    if-nez p4, :cond_0

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->d:Lcom/google/android/gms/contextmanager/fence/internal/m;

    iput-object v1, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->e:Lcom/google/android/gms/awareness/fence/i;

    iput-object p5, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->f:Landroid/app/PendingIntent;

    iput-object p6, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->g:Ljava/lang/String;

    iput-wide p7, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->h:J

    iput-wide p9, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->i:J

    return-void

    :cond_0
    invoke-static {p4}, Lcom/google/android/gms/contextmanager/fence/internal/m$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/fence/internal/m;

    move-result-object v0

    goto :goto_0
.end method

.method private constructor <init>(ILcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;Lcom/google/android/gms/awareness/fence/i;Landroid/app/PendingIntent;Ljava/lang/String;JJ)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->a:I

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->b:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->c:Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->d:Lcom/google/android/gms/contextmanager/fence/internal/m;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->e:Lcom/google/android/gms/awareness/fence/i;

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->f:Landroid/app/PendingIntent;

    iput-object p5, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->g:Ljava/lang/String;

    iput-wide p6, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->h:J

    iput-wide p8, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->i:J

    return-void
.end method

.method public static final a(Landroid/app/PendingIntent;)Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;
    .locals 10

    const-wide/16 v6, -0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;

    const/4 v1, 0x4

    move-object v3, v2

    move-object v4, p0

    move-object v5, v2

    move-wide v8, v6

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;-><init>(ILcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;Lcom/google/android/gms/awareness/fence/i;Landroid/app/PendingIntent;Ljava/lang/String;JJ)V

    return-object v0
.end method

.method public static final a(Ljava/lang/String;)Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;
    .locals 10

    const-wide/16 v6, -0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;

    const/4 v1, 0x5

    move-object v3, v2

    move-object v4, v2

    move-object v5, p0

    move-wide v8, v6

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;-><init>(ILcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;Lcom/google/android/gms/awareness/fence/i;Landroid/app/PendingIntent;Ljava/lang/String;JJ)V

    return-object v0
.end method

.method public static final a(Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;Landroid/app/PendingIntent;)Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;
    .locals 10

    const-wide/16 v6, -0x1

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;

    const/4 v1, 0x2

    invoke-static {p0, p1}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;->a(Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

    move-result-object v2

    move-object v4, p2

    move-object v5, v3

    move-wide v8, v6

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;-><init>(ILcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;Lcom/google/android/gms/awareness/fence/i;Landroid/app/PendingIntent;Ljava/lang/String;JJ)V

    return-object v0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->a:I

    return v0
.end method

.method a(Lcom/google/android/gms/internal/sx;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/sx",
            "<",
            "Lcom/google/android/gms/awareness/fence/i;",
            "Lcom/google/android/gms/contextmanager/fence/internal/e;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->d:Lcom/google/android/gms/contextmanager/fence/internal/m;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->e:Lcom/google/android/gms/awareness/fence/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->e:Lcom/google/android/gms/awareness/fence/i;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/sx;->a(Ljava/lang/Object;)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/m;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->d:Lcom/google/android/gms/contextmanager/fence/internal/m;

    :cond_0
    return-void
.end method

.method b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->d:Lcom/google/android/gms/contextmanager/fence/internal/m;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->d:Lcom/google/android/gms/contextmanager/fence/internal/m;

    invoke-interface {v0}, Lcom/google/android/gms/contextmanager/fence/internal/m;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->b:I

    return v0
.end method

.method public d()Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->c:Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceRegistrationStub;

    return-object v0
.end method

.method public e()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->f:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->h:J

    return-wide v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->i:J

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/q;->a(Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;Landroid/os/Parcel;I)V

    return-void
.end method
